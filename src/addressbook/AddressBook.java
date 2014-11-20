/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
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
        BorderPane root = new BorderPane();

        //textFieldLayout and buttonLyout added to root layout
        root.setCenter(new TextFieldsPartial());
        root.setRight(new TextAreaPartial());
        root.setBottom(new ButtonFieldsPartial());

        
        Scene scene = new Scene(root, 400, 400);
        
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
