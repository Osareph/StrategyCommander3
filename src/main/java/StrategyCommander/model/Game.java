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

    /**
     * Elenco dei turni del Torneo
     */
    @OneToMany(mappedBy = "game")
    private List<Turn> turns;//lista dei turni del torneo

    @ManyToOne
    private Utente utente;//utente che ha creato il torneo

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

    /**
     * getTurns
     * @return la lista dei turni di un torneo
     */
    public List<Turn> getTurns() {
        return turns;
    }

    /**
     * setTurns modifica la lista dei turni di un torneo
     * @param turns elenco dei turni del torneo
     */
    public void setTurns(List<Turn> turns) {
        this.turns = turns;
    }

    /**
     * getUtente
     * @return l'utente che ha creato il torneo
     */
    public Utente getUtente() {
        return utente;
    }

    /**
     * setUtente modifica l'utente che ha creato il torneo
     * @param utente che ha creato il torneo
     */
    public void setUtente(Utente utente) {
        this.utente = utente;
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
