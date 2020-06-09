package StrategyCommander.Service;

import StrategyCommander.model.Game;
import StrategyCommander.model.Player;
import StrategyCommander.model.Table;
import StrategyCommander.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Classe che modella i servizi per la repository del giocatore
 */
@Service
public class PlayerService {

    /**
     * dichiarazione del gestore della repository
     */
    @Autowired
    private PlayerRepository playerRepository;

    /**
     * metodo che aggiunge alla repository il giocatore
     * @param player giocatore che va salvato
     * @return restiruisce il giocatore salvato
     */
    @Transactional
    public Player addPlayer(Player player){
        return this.playerRepository.save(player);
    }

    /**
     * metodo che ricerca il giocatore con l'Id indicato
     * @param id identificatore del giocatore
     * @return ritorna il giocatore con l'Id indicato
     */
    @Transactional
    public Player findPlayerById(Long id){
        return (Player)this.playerRepository.findById(id).get();
    }

    /**
     * metodo che ricerca il giocatore con il nome indicato
     * @param name del giocatore da cercare
     * @return il giocatore con il nome indicato
     */
    @Transactional
    public Player findPlayerByName(String name){
        return this.playerRepository.findByName(name);
    }

    /**
     * metodo che ricerca il giocatore con la DCI indicata
     * @param DCI del giocatore da cercare
     * @return il giocatore con la DCI indicata
     */
    @Transactional
    public Player findPlayerByDCI(String DCI){
        return this.playerRepository.findByDCI(DCI);
    }

    /**
     * motodo che ricerca la lista dei giocatori che partecipano allo stesso torneo
     * @param game torneo in cui sono iscritti i giocatori
     * @return ritorna la lista dei giocatori che partecipano al torneo
     */
    @Transactional
    public List<Player> findAllPlayerByGame(Game game){
        return this.playerRepository.findAllByGame(game);
    }

    /**
     * metodo che ricerca la lista dei giocatori che appartengono allo stesso tavolo
     * @param table tavolo in cui sono i giocatori
     * @return ritorna la lista dei giocatori che sono all'interno del tavolo
     */
    @Transactional
    public List<Player> findAllPlayerByTable(Table table){
        return this.playerRepository.findAllByTable(table);
    }

    /**
     * elimina il giocatore con l'Id indicato
     * @param id identificatore del giocatore da eliminare
     */
    @Transactional
    public void deletePlayer(Long id){
        this.playerRepository.deleteById(id);
    }

    /**
     * rimuove dal torneo il giocatore indicato
     * @param player è il giocatore da rimuovere dal torneo
     */
    @Transactional
    public void removePlayerFromGame(Player player){
        Player tmp = this.playerRepository.findByDCI(player.getDCI());
        tmp.setGame(null);
        this.playerRepository.save(tmp);
    }

    /**
     * rimuove dal tavolo il giocatore indicato
     * @param player è il giocatore da rimuovere dal tavolo
     */
    @Transactional
    public void removePlayerFromTable(Player player){
        Player tmp = this.playerRepository.findByDCI(player.getDCI());
        player.setTable(null);
        this.playerRepository.save(tmp);
    }


}
