/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Glen
 */
public class PracticeView {
    
    private Dictionary dictionary;
    private String word;
    
    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = dictionary.getRandomWord();
        
        
    }
    
    public GridPane getView() {
        GridPane layout = new GridPane();
        
        Label wordInstruction = new Label("Translate the word '" + this.word + "'.");
        TextField translationField = new TextField();
        Button checkButton = new Button("Check");
        Label result = new Label("");
        
        layout.add(wordInstruction, 0, 0);
        layout.add(translationField, 0, 1);
        layout.add(checkButton, 0, 2);
        layout.add(result, 0, 3);
        
        checkButton.setOnMouseClicked(event -> {
            String translation = translationField.getText();
            if (dictionary.get(this.word).equals(translation)) {
                result.setText("Correct!");
            } else {
                result.setText("Incorrect. The translation for '" + word + "' is '" + dictionary.get(word) + "'.");
            }
            
            this.word = this.dictionary.getRandomWord();
            wordInstruction.setText("Translate the word '" + this.word + "'.");
            translationField.clear();
        });
        
        return layout;
    }
    
}
