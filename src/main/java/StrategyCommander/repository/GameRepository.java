package StrategyCommander.repository;

import StrategyCommander.model.Game;
import org.springframework.data.repository.CrudRepository;

/**
 * Interfaccia che aiuta l'inizzializzazione della repository del Torneo
 */
public interface GameRepository extends CrudRepository<Game,Long> {
}
