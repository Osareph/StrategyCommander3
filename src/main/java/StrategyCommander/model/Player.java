package StrategyCommander.model;

import javax.persistence.*;

/**
 * Classe che rappresenta il giocatore prensente nel torneo
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
     * Costruttore vuoto sempre comodo
     */
    public Player() {
    }
}
