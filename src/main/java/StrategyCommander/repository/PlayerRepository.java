package StrategyCommander.repository;

import StrategyCommander.model.Game;
import StrategyCommander.model.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {

    /**
     * ricerca del giocatore tramite DCI
     * @param DCI
     * @return ritorna il giocatore con la DCI indicata
     */
    public Player findByDCI(String DCI);

    /**
     * ricerca del giocatore tramite nome
     * @param name
     * @return ritorna il giocatore con il nome indicato
     */
    public Player findByName(String name);

    
}
