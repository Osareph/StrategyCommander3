package StrategyCommander.model;

import javax.persistence.*;

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
}
