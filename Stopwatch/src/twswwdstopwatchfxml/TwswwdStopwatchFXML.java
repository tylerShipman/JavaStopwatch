/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twswwdstopwatchfxml;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import static javafx.application.Application.launch;
import static javafx.application.Application.launch;
import static javafx.application.Application.launch;
import static javafx.application.Application.launch;
import static javafx.application.Application.launch;
import static javafx.application.Application.launch;

/**
 *
 * @author TylerShipman
 */
public class TwswwdStopwatchFXML extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("StopwatchUI.fxml"));
        
        Parent root = loader.load();
        StopwatchUIController controller = loader.getController();
               
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

