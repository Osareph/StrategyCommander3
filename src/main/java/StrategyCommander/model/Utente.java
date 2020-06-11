package StrategyCommander.model;

import javax.persistence.*;
import java.util.List;

/**
 * classe che modella l'utente che crea i tornei
 */
@Entity
public class Utente {

    /**
     * Variabili caratteristiche dell'utente
     */
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;//identificativo dell'utente

    @Column(nullable = false)
    private String name;//nome dell'utente

    @Column(nullable = false)
    private String username;//nome per l'accesso dell'utente

    @Column(nullable = false)
    private String parolaSegreta;//password per l'accesso dell'utente

    @Column(nullable = false)
    private String email;//email dell'utente per la regitrazione

    @OneToMany(mappedBy = "utente")
    private List<Game> games;//Elenco dei tornei che ha creato l'utente

    //GETTER & SETTER

    /**
     * getId
     * @return l'identificativo dell'utente
     */
    public Long getId() {
        return id;
    }

    /**
     * setId modifica l'identificativo dell'utente
     * @param id identificativo dell'utente
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * getName
     * @return il nome dell'utente
     */
    public String getName() {
        return name;
    }

    /**
     * setName modifica il nome dell'utente
     * @param name dell'utente
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getUsername
     * @return l'username dell'utente
     */
    public String getUsername() {
        return username;
    }

    /**
     * setUsername modifica l'username dell'utente
     * @param username dell'utente
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * getParolaSegreta
     * @return la password per accedere dell'utente
     */
    public String getParolaSegreta() {
        return parolaSegreta;
    }

    /**
     * setParolaSegreta modifica la password per accedere dell'utente
     * @param parolaSegreta password dell'utente
     */
    public void setParolaSegreta(String parolaSegreta) {
        this.parolaSegreta = parolaSegreta;
    }

    /**
     * getEmail
     * @return l'email dell'utente
     */
    public String getEmail() {
        return email;
    }

    /**
     * setEmail modifica l'email per l'iscrizione dell'utente
     * @param email dell'utente
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getGames
     * @return lista dei tornei creati dall'utente
     */
    public List<Game> getGames() {
        return games;
    }

    /**
     * setGames modifica la lista dei tornei creati dall'utente
     * @param games elenco dei tornei creati dall'utente
     */
    public void setGames(List<Game> games) {
        this.games = games;
    }

    //COSTRUTTORI

    /**
     * Costruttore dell'utente
     * @param id identificatore dell'utente
     * @param name nome dell'utente
     * @param username nickname dell'utente
     * @param parolaSegreta password dell'utente
     * @param email email dell'utente
     */
    public Utente(Long id, String name, String username, String parolaSegreta, String email) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.parolaSegreta = parolaSegreta;
        this.email = email;
    }

    /**
     * Costruttore Vuoto
     */
    public Utente(){}
}
