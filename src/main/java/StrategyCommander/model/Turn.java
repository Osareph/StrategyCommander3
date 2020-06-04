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

    /**
     * elenco dei tavoli presenti nel turno
     */
    @OneToMany(mappedBy = "turn")
    private List<Table> tables; //elenco dei tavoli durante il turno

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
    public Turn(Long id) {
        this.id = id;
    }
}
