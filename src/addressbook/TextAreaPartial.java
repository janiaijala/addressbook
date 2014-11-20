/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 *
 * @author Ohjelmistokehitys
 */
public class TextAreaPartial extends VBox{
    private final Label textAreaLabel = new Label("Kayttajat");
    private final TextArea textAreaField = new TextArea();
    
    public TextAreaPartial(){
        this.getChildren().add(textAreaLabel);
        this.getChildren().add(textAreaField);
        this.setStyle("-fx-max-width:200;-fx-max-height:300;-fx-padding:10");
    }
}
