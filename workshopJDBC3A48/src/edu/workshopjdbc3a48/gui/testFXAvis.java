/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.gui;

import edu.workshopjdbc3a48.entities.Annonce;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author pc
 */
public class testFXAvis extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        
         
            
             
        
        FXMLLoader loader = new FXMLLoader (getClass().getResource("Avis.fxml"));
        try {
            
        Parent root= loader.load();
           
            Scene scene = new Scene(root);
            
            
            Annonce A1 = new Annonce("titre1","c'est ma premiere annonce");
            AvisController av = loader.getController();
            av.setTftitre(A1.getTitre());
            av.setTadescription(A1.getDescription());
            
            
            
            primaryStage.setTitle("Avis");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(ex.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
