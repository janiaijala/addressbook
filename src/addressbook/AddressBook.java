/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Ohjelmistokehitys
 */
//aina pelkastaan yksi luokka ja se perii application luokan
public class AddressBook extends Application {
    
    @Override
    public void start(Stage primaryStage) {

        // the root is the main layout
        VBox root = new VBox();
        
        Label nameLabel = new Label("Nimi");
        TextField nameField = new TextField();
        
        Label addressLabel = new Label("Osoite");
        TextField addressField = new TextField();
        
        Label phoneLabel = new Label("Puhelin numero");
        TextField phoneField = new TextField();
        
        //Do layout for textfiels components
        VBox textFieldLayout = new VBox();
        textFieldLayout.getChildren().add(nameLabel);
        textFieldLayout.getChildren().add(nameField);
        textFieldLayout.getChildren().add(addressLabel);
        textFieldLayout.getChildren().add(addressField);
        textFieldLayout.getChildren().add(phoneLabel);
        textFieldLayout.getChildren().add(phoneField);
        textFieldLayout.setStyle("-fx-padding:10 10 10 10");
        
        Button closeButton = new Button("Sulje");
        Button saveButton = new Button("Tallenna");
        HBox buttonLayout = new HBox();
        buttonLayout.setStyle("-fx-padding:10;-fx-spacing:10");
        buttonLayout.getChildren().add(closeButton);
        buttonLayout.getChildren().add(saveButton);

        //textFieldLayout and buttonLyout added to root layout
        root.getChildren().add(textFieldLayout);
        root.getChildren().add(buttonLayout);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Idea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
