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

    @OneToMany(mappedBy = "turn")
    private List<Table> tables; //elenco dei tavoli durante il turno
}
