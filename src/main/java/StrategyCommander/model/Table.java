package StrategyCommander.model;

import javax.persistence.*;

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
}
