package StrategyCommander.model;

import javax.persistence.*;
import java.util.List;

/**
 * Classe che rappresenta il singolo turno del torneo
 * Ogni turno è formato da un numero di tavoli specificato
 */
@Entity
public class Turn {

    /**
     * elenco di variabili che caratterizzano l'oggetto Player
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id; //id del turno

    @Column(nullable = false)
    private int number;//rappresenta il numero del turno, secondo identificatore per il turno

    /**
     * elenco dei tavoli presenti nel turno
     */
    @OneToMany(mappedBy = "turn")
    private List<Table> tables; //elenco dei tavoli durante il turno

    /**
     * Torneo in cui viene creato il turno
     */
    @ManyToOne
    private Game game;//rappresenta il torneo in cui il turno è definito

    //GETTER & SETTER

    /**
     * getId
     * @return id del turno
     */
    public Long getId() {
        return id;
    }

    /**
     * setId modifica l'id del turno
     * @param id identificatore del turno
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getNumber
     * @return ritorna il numero del turno
     */
    public int getNumber() {
        return number;
    }

    /**
     * setNumber modifica il numero del turno
     * @param number è il secondo indentificatore per il turno
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * getTables
     * @return elenco dei tavoli presenti nel turno
     */
    public List<Table> getTables() {
        return tables;
    }

    /**
     * setTable modifica l'elenco dei tavoli nel turno
     * @param tables elenco tavoli del turno
     */
    public void setTables(List<Table> tables) {
        this.tables = tables;
    }

    /**
     * GetGame
     * @return il torneo in cui il turno viene generato
     */
    public Game getGame() {
        return game;
    }

    /**
     * setGame modifica il torneo in cui viene creato il turno
     * @param game Torneo in cui viene creato il turno
     */
    public void setGame(Game game) {
        this.game = game;
    }

    //COSTRUTTORI

    /**
     * Costruttore vuoto
     */
    public Turn(){
    }

    /**
     * Costruttore
     * @param id identificatore del tavolo
     */
    public Turn(Long id, int number) {
        this.id = id;
        this.number = number;
    }
}
