package globalproject;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Jose Flavio
 */
public class Language {
    
    private static Language language;
    private ResourceBundle strings;
    
    private Language(){
        
    }
    
    public synchronized static Language getInstance(){
        if (language == null) {
            Language.language = new Language();
        }
        return language;
    }
    
    public ResourceBundle setLanguage(String languageString){
        Locale locale = new Locale(languageString);
        this.strings = ResourceBundle.getBundle("globalproject.strings",locale);
        return this.strings;
    }
    
    public ResourceBundle getStrings(){
        if(this.strings == null){
            Locale locale = new Locale("en");
            return ResourceBundle.getBundle("globalproject.strings",locale);
        } else {
            return this.strings;
        }
    }
    
}
