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

    @OneToMany(mappedBy = "game")
    private List<Player> players;//lista dei giocatori presenti

}
