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
    private String DCI;//rappresenta la DCI del giocatore

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
     * setId modifica l'Id del giocatore
     * @param id identificatore univoco del giocatore
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getDCI
     * @return ritorna la DCI del giocatore
     */
    public String getDCI() {
        return DCI;
    }

    /**
     * setDCI modifica la DCI del giocatore
     * @param DCI attuale del giocatore
     */
    public void setDCI(String DCI) {
        this.DCI = DCI;
    }

    /**
     * getName
     * @return nome del giocatore
     */
    public String getName() {
        return name;
    }

    /**
     * setName modifica il nome del giocatore
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
     * setPoint modifica il punteggio del Giocatore
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
     * setGame modifica la partita in cui si trova il giocatore
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
     * setTable modifica il tavolo in cui si trova il giocatore
     * @param table tavolo in cui si trova il giocatore
     */
    public void setTable(Table table) {
        this.table = table;
    }

    //Costruttori

    /**
     * Costruttore vuoto sempre comodo
     */
    public Player() {
    }

    /**
     * Costruttore
     * @param id del giocatore
     * @param name del giocatore
     * @param DCI del giocatore
     */
    public Player(Long id, String name, String DCI) {
        this.id = id;
        this.name = name;
        this.DCI = DCI;
    }


}