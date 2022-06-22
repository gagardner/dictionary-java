/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Glen
 */
public class Dictionary {
    
    private List<String> words;
    private HashMap<String, String> translations;
    
    public Dictionary() {
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
        
        words.add("hi");
        translations.put("hi", "ahoj");
        
        words.add("bread");
        translations.put("bread", "chleba");
        
        words.add("toilet");
        translations.put("toilet", "zachod");
        
        words.add("wolf");
        translations.put("wolf", "vlk");
        
        words.add("glen");
        translations.put("glen", "rokle");
        
        words.add("table");
        translations.put("table", "stul");
    }
    
    public String get(String word) {
        return this.translations.get(word);
    }
    
    public void add(String word, String translation) {
        if (!this.words.contains(word)) {
            this.words.add(word);
        }
        
        this.translations.put(word, translation);
    }
    
    public String getRandomWord() {
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));
    }
}
