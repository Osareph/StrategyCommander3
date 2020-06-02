package StrategyCommander.model;

import javax.persistence.*;

/**
 * Classe che rappresenta il giocatore prensente nel torneo
 * ogni giocatore ottiene un numero preciso di punti alla fine di ogni turno
 */
@Entity
public class Player {

    /**
     * elenco di variabili che caratterizzano l'oggetto Player
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id; //id del giocatore

    @Column(nullable = false)
    private String name; //nome del giocatore

    @Column(nullable = false)
    private int point; //punti del giocatore

    @ManyToOne
    private Game game; //Partita a cui partecipa il giocatore
    @ManyToOne
    private Table table; //Tavolo in cui si trova il giocatore

    //GETTER & SETTER
    /**
     * getId
     * @return Id del giocatore
     */
    public Long getId() {
        return id;
    }

    /**
     * setId
     * @param id identificatore univoco del giocatore
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getName
     * @return nome del giocatore
     */
    public String getName() {
        return name;
    }

    /**
     * setName
     * @param name nome del giocatore
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getPoint
     * @return punteggio del giocatore
     */
    public int getPoint() {
        return point;
    }

    /**
     * setPoint
     * @param point punteggio in classifica del giocatore
     */
    public void setPoint(int point) {
        this.point = point;
    }

    /**
     * getGame
     * @return gioco in cui si trova il giocatore
     */
    public Game getGame() {
        return game;
    }

    /**
     * setGame
     * @param game gioco in cui si trova il giocatore
     */
    public void setGame(Game game) {
        this.game = game;
    }

    /**
     * getTable
     * @return ritorna il tavolo in cui il giocatore si trova
     */
    public Table getTable() {
        return table;
    }

    /**
     * setTable
     * @param table tavolo in cui si trova il giocatore
     */
    public void setTable(Table table) {
        this.table = table;
    }

    /**
     * Costruttore vuoto sempre comodo
     */
    public Player() {
    }

    /**
     * Costruttore
     */
    public Player(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}