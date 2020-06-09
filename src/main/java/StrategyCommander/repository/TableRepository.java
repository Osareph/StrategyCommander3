package StrategyCommander.repository;

import StrategyCommander.model.Table;
import StrategyCommander.model.Turn;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *Interfaccia che aiuta l'inizzializzazione della repository del Tavolo
 */
public interface TableRepository extends CrudRepository<Table, Long> {

    /**
     * Ricerca del tavolo da gioco tramite il numero
     * @param number secondo identificativo per il tavolo da gioco
     * @return ritorna il tavolo da gioco che ha il numero indicato
     */
    public Table findByNumber(int number);

    /**
     * Elimina il tavolo da gioco con l'Id indicato
     * @param id identificatore del tavolo da cancellare
     */
    public void deleteTableById(Long id);

    /**
     * ricerca l'elenco dei tavoli che fanno parte dello stesso turno
     * @param turn turno in cui sono presenti i tavoli richiesti
     * @return elenco dei tavoli che partecipano al turno
     */
    public List<Table> findAllByTurn(Turn turn);

    /**
     * Elimina tutti i tavoli all'interno di un singolo turno
     * @param turn turno di cui i tavoli vanno cancellati
     */
    public void deleteAllByTurn(Turn turn);
}
