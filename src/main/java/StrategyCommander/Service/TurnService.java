package StrategyCommander.Service;

import StrategyCommander.model.Game;
import StrategyCommander.model.Turn;
import StrategyCommander.repository.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Classe che modella i servizi di gestione della repository dei turni
 */
@Service
public class TurnService {

    /**
     * Interfaccia per la gestione della repository
     */
    @Autowired
    private TurnRepository turnRepository;

    /**
     * aggiunge alla repository un nuovo turno
     * @param turn nuovo turno da salvare
     * @return restituisce il turno aggiunto
     */
    @Transactional
    public Turn addTurn(Turn turn){
        return this.turnRepository.save(turn);
    }

    /**
     * ricerca il turno dato il suo identificatore
     * @param id identificatore del turno che si vuole cercare
     * @return ritorna il turno con l'identificatore indicato
     */
    @Transactional
    public Turn findById(Long id){
        return this.turnRepository.findById(id).get();
    }

    /**
     * ricerca il turno dato il suo numero
     * @param number numero del turno da cercare
     * @return il turno con il corrispondente numero
     */
    @Transactional
    public Turn findByNumber(int number){
        return this.turnRepository.findByNumber(number);
    }

    /**
     * ricerca il turno con il numero indicato all'interno di un singolo torneo
     * @param number è il numero del turno da cercare
     * @param game è il torneo in cui si svolge il turno
     * @return il turno che ha il numero indicato e si svolge nel torneo indicato
     */
    @Transactional
    public Turn findByNumberAndGame(int number, Game game){
        return this.turnRepository.findByNumberAndGame(number,game);
    }

    /**
     * ricerca l'elenco dei turni di un torneo
     * @param game torneo di cui si vogliono i turni
     * @return elenco dei turni del torneo indicato
     */
    @Transactional
    public List<Turn> findTurnsFromGame(Game game){
        return this.turnRepository.findAllByGame(game);
    }

    /**
     * Elimana un turno
     * @param turn turno che va eliminato
     */
    @Transactional
    public void deleteTurn(Turn turn){
        this.turnRepository.delete(turn);
    }


}
