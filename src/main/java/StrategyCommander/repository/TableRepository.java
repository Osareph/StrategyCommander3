package StrategyCommander.repository;

import StrategyCommander.model.Table;
import org.springframework.data.repository.CrudRepository;

public interface TableRepository extends CrudRepository<Table, Long> {

    /**
     * Ricerca del tavolo da gioco tramite il numero
     * @param number secondo identificativo per il tavolo da gioco
     * @return ritorna il tavolo da gioco che ha il numero indicato
     */
    public Table findByNumber(int number);
}
