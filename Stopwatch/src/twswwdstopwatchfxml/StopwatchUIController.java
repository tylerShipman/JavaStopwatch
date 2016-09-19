/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twswwdstopwatchfxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.util.Duration;



public class StopwatchUIController implements Initializable {

    @FXML
    private ImageView hand;
    
    @FXML
    private Label digitalClock;
    
    private Timeline timeLine;
    
    private int elapsedTime;
    
    int sec;
    int min;
    
    String time;

    public StopwatchUIController() {
        this.digitalClock = new Label("00:00");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        timeLine = new Timeline(new KeyFrame(Duration.millis(1000), actionEvent -> update() ));
        timeLine.setCycleCount(Timeline.INDEFINITE);
    } 
    
    @FXML
    public void handleStart(ActionEvent event){
        
        timeLine.play();
        
    }
    
    @FXML
    public void handleStop(ActionEvent event){
        
        timeLine.stop();
        
    }
    
    @FXML
    public void handleReset(ActionEvent event){
     
        reset();
    
    }
    
    private void update(){
        
        elapsedTime++;
        updateHand();
        updateDigitalClock();
        
    }
    
    private void updateHand(){
       
        hand.setRotate(elapsedTime*6);
        
       
    }
    
   
    
    private void updateDigitalClock(){
      
        sec = elapsedTime % 60;
        min = elapsedTime / 60;
        
        
        time = String.format("%02d:%02d", min, sec);
        digitalClock.setText(time);
       
    }
    
    private void reset(){
        timeLine.stop();
        hand.setRotate(0);
        elapsedTime = 0;
        digitalClock.setText("00:00");
    }
}
