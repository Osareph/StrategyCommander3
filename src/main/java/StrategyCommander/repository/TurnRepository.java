package StrategyCommander.repository;

import StrategyCommander.model.Turn;
import org.springframework.data.repository.CrudRepository;

public interface TurnRepository extends CrudRepository<Turn, Long> {
    /**
     * ricerca il turno tramite il numero
     * @param number è il secondo identificatore per il turno
     * @return ritorna il turno che ha il numero indicato
     */
    public Turn findByNumber(int number);
}
