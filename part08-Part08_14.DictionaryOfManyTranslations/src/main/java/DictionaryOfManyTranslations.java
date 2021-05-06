import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;
    
    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        // empty list needs to be added for new word if one not already added
        this.translations.putIfAbsent(word, new ArrayList<>());
        
        this.translations.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word) {        
        return translations.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word) {
        translations.remove(word);
    }
}
