package StrategyCommander.repository;

import StrategyCommander.model.Game;
import StrategyCommander.model.Turn;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *Interfaccia che aiuta l'inizzializzazione della repository del Turno
 */
public interface TurnRepository extends CrudRepository<Turn, Long> {
    /**
     * ricerca il turno tramite il numero
     * @param number è il secondo identificatore per il turno
     * @return ritorna il turno che ha il numero indicato
     */
    public Turn findByNumber(int number);

    /**
     * ricerca il turno tramite il suo numero ma esclusivamente all'interno di un torneo
     * @param number numero del turno da cercare
     * @param game torneo in cui si svolge il turno
     * @return il turno che possiede il numero indicato e che si trova all'interno del torneo indicato
     */
    public Turn findByNumberAndGame(int number, Game game);

    /**
     * ricerca la lista dei turni che sono in un singolo torneo
     * @param game torneo a cui appartengono i turni
     * @return elenco dei turni che compongono il torneo
     */
    public List<Turn> findAllByGame(Game game);
}
