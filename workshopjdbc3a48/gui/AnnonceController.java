/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.gui;

import edu.workshopjdbc3a48.entities.Annonce;
import edu.workshopjdbc3a48.services.ServiceAnnonce;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class AnnonceController implements Initializable {

    @FXML
    private TextField tftitre;
    @FXML
    private TextArea tadescription;
    @FXML
    private Button btncreer;
    @FXML
    private ToggleGroup statuts;
    @FXML
    private RadioButton rbactivee;
    @FXML
    private RadioButton rbarchivee;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
    }    

    @FXML
    private void saveAnnonce(ActionEvent event) {
        
            String statut="activée";
            if (statuts.getSelectedToggle().equals(rbarchivee)){
                statut = "archivée";
            }
            String titre = tftitre.getText();
            String description = tadescription.getText();
            
            Annonce A1 = new Annonce(titre,description,statut);
            ServiceAnnonce sa = new ServiceAnnonce();
            sa.ajouter(A1);
            
            
            FXMLLoader loader = new FXMLLoader (getClass().getResource("detailAnnonce.fxml"));
            try {
             Parent root= loader.load();
            DetailAnnonceController dac = loader.getController();
            dac.setTftitre(A1.getTitre());
            dac.setTadescription(A1.getDescription());
            dac.setTfstatut(A1.getStatut());
            
            tftitre.getScene().setRoot(root);
            
           
        } catch (IOException ex) {
            Logger.getLogger(ex.getMessage());
        }
       
    }
 
} 
