package StrategyCommander.validator;

import StrategyCommander.model.Player;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Classe che modella la verifica di un oggetto Player
 */
@Component
public class PlayerValidator implements Validator {

    /**
     * Permette di confrontare due oggetti Player
     * @param clazz Oggetto che va confrontato
     * @return true se i due oggetti sono uguali, altrimenti false
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return Player.class.equals(clazz);
    }

    /**
     * Metodo che permette di verificare se un giocatore possiede
     * sia il campo nome che il campo DCI
     * @param target l'oggetto per cui va verificato l'esistenza dei campi descritti
     * @param errors errore che ti restituisce nel caso non fosse verificata la presenza degli attributi
     */
    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"nome","required");
        ValidationUtils.rejectIfEmpty(errors,"DCI","required");
    }
}
