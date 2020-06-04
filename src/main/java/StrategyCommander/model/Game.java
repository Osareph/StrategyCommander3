package StrategyCommander.model;

import javax.persistence.*;
import java.util.List;


@Entity
public class Game {

    /**
     * elenco di variabili che caratterizzano l'oggetto Player
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id; //id del gioco

    /**
     * Elenco dei giocatori che partecipano al torneo
     */
    @OneToMany(mappedBy = "game")
    private List<Player> players;//lista dei giocatori presenti

    //GETTER & SETTER

    /**
     * getId
     * @return id del torneo
     */
    public Long getId() {
        return id;
    }

    /**
     * setId modifica l'id del torneo
     * @param id identificatore del torneo
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getPlayers
     * @return elenco dei giocatori presenti nel torneo
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * setPlayers modifica l'elenco dei giocatori presenti nel torneo
     * @param players elenco dei giocatori nel torneo
     */
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    //COSTRUTTORI

    /**
     * Costruttore Vuoto
     */
    public Game(){
    }

    /**
     * Costruttore
     * @param id identificatore della partita
     */
    public Game(Long id){
        this.id = id;
    }
}
