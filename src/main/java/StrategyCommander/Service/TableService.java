package StrategyCommander.Service;

import StrategyCommander.model.Table;
import StrategyCommander.model.Turn;
import StrategyCommander.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * modella i servizzi per la gestione della repository del tavolo
 */
@Service
public class TableService {

    /**
     * interfaccia per la gestione della repository di un tavolo
     */
    @Autowired
    private TableRepository tableRepository;

    /**
     * Aggiunge il tavolo indicato alla repository
     * @param table tavolo da aggiungere
     * @return ritorna il tavolo aggiunto
     */
    @Transactional
    public Table addTable(Table table){
        return tableRepository.save(table);
    }

    /**
     * ricerca il tavolo da gioco tramite l'Id inditcato
     * @param id identificatore del tavolo da mostrare
     * @return tavolo con l'Id indicato
     */
    @Transactional
    public Table findById(Long id){
        return tableRepository.findById(id).get();
    }

    /**
     * ricerca il tavolo tramite il numero
     * @param number numero del tavolo che si cerca
     * @return il tavolo che possiede il numero indicato
     */
    @Transactional
    public Table findByNumber(int number){
        return tableRepository.findByNumber(number);
    }

    /**
     * restituisce la lista di tavoli presenti nel turno
     * @param turn turno in cui vengono creati i tavoli
     * @return lista dei tavoli presenti nel turno
     */
    @Transactional
    public List<Table> findTablesByTurn(Turn turn){
        return tableRepository.findAllByTurn(turn);
    }

    /**
     * Elimina dalla repository il tavolo che possiede l'Id indicato
     * @param id identificatore del tavolo da cancellare
     */
    @Transactional
    public void deleteTable(Long id){
        tableRepository.deleteById(id);
    }

    /**
     * Elimina tutti i tavoli presenti in un turno
     * @param turn è il turno in cui vengono eliminati tutti i tavoli
     */
    @Transactional
    public void deleteAllTableFromTurn(Turn turn){
        tableRepository.deleteAllByTurn(turn);
    }

}
