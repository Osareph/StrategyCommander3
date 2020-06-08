package StrategyCommander.model;

import javax.persistence.*;
import java.util.List;

/**
 * Classe che rappresenta il singolo tavolo prensente in un turno
 * ogni tavolo è formato da un massimo di 5 giocatori ad un minimo di 3
 */
@Entity
public class Table {

    /**
     * elenco di variabili che caratterizzano l'oggetto Player
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id; //id del tavolo

    @Column(nullable = false)
    private int number; //numero del tavolo , rappresenta un secondo identificativo per il tavolo

    @OneToMany(mappedBy = "table")
    private List<Player> players; //Elenco dei giocatori che sono al tavolo da gioco
    /*
    * Il numero di giocatori che può trovarsi ad un tavolo sono un minimo di 3 ed un massimo di 5
    */

    @ManyToOne
    private Turn turn; // turno in cui viene creato il tavolo

    //GETTER & SETTER

    /**
     * getId
     * @return Id ritorna l'Id del tavolo
     */
    public Long getId() {
        return id;
    }

    /**
     * setId modifica l'Id del tavolo
     * @param id identificatore attuale del tavolo
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getNumber
     * @return ritorna il numero del tavolo
     */
    public int getNumber() {
        return number;
    }

    /**
     * setNumber modifica il numero del tavolo
     * @param number è un secondo identificativo per il tavolo
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * getTurn
     * @return turn restituisce il turno in cui viene creato il tavolo da gioco
     */
    public Turn getTurn() {
        return turn;
    }

    /**
     * setTurn modifica il turno in cui si trova il tavolo
     * @param turn turno in cui viene creato il tavolo
     */
    public void setTurn(Turn turn) {
        this.turn = turn;
    }

    /**
     * getPlayer
     * @return players elenco dei giocatori al tavolo da gioco
     */
    public List<Player> getPlayers() {
        return players;
    }

    /**
     * setPlayers modifica l'elenco dei giocatori nel tavolo
     * @param players
     */
    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    //COSTRUTTORI

    /**
     * Costruttore vuoto
     */
    public Table() {
    }

    /**
     * costruttore
     * @param id del tavolo
     * @param turn turno in cui viene creato il tavolo
     */
    public Table(Long id, Turn turn, int number) {
        this.id = id;
        this.turn = turn;
        this.number = number;
    }
}
