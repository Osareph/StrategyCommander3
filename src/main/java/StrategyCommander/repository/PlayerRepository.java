package StrategyCommander.repository;

import StrategyCommander.model.Game;
import StrategyCommander.model.Player;
import StrategyCommander.model.Table;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

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

    /**
     * ricerca tutti i giocatori che partecipano allo stesso torneo
     * @param game torneo a cui partecipano
     * @return ritorna la lista dei partecipanti
     */
    public List<Player> findAllByGame(Game game);

    /**
     * ricerca tutti i giocatori presenti in un tavolo
     * @param table tavolo in cui sono i giocatori
     * @return ritorna la lista del tavolo
     */
    public List<Player> findAllByTable(Table table);
}
