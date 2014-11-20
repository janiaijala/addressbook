/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.util.ArrayList;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class ButtonFieldsPartial extends HBox implements EventHandler<ActionEvent>{
    
        private final Button closeButton = new Button("Sulje");
        private final Button saveButton = new Button("Tallenna");
        private final Button printButton = new Button("Tulosta");
        private final HBox buttonLayout = new HBox();

        private ArrayList<UserInfo> userInfo = new ArrayList<UserInfo>();
        private TextArea users;
        private TextFieldsPartial partial = new TextFieldsPartial();
        
        public ButtonFieldsPartial(){
            this.users = users;
            this.partial = partial;
            this.getChildren().add(closeButton);
            this.getChildren().add(saveButton);
            this.getChildren().add(printButton);
            this.setStyle("-fx-padding:10;-fx-spacing:10");
            closeButton.setOnAction(this);
            saveButton.setOnAction(this);
            printButton.setOnAction(this);
            //Inline implemtation for EventHandler interface
            /*closeButton.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent t) {
                    
                }
            });*/
        }

    @Override
    public void handle(ActionEvent t) {
        if(t.getSource().equals(closeButton)){
            Platform.exit();
 
        }
        else if(t.getSource().equals(saveButton)){
           UserInfo temp = partial.getUserInfo();
           userInfo.add(temp);
 
          
        }
        else{
            for(UserInfo temp : userInfo){
                users.setText(users.getText() +
                              "Nimi:" + temp.getName() + "\n" +
                              "Osoite:" + temp.getAddress() + "\n" +
                              "Puhelin:" + temp.getPhoneNumber() + "\n\n");
            }
        }  
    }
}
