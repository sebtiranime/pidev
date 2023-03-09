/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.gui;

import edu.workshopjdbc3a48.entities.Annonce;
import edu.workshopjdbc3a48.entities.Avis;
import edu.workshopjdbc3a48.entities.Favoris;
import edu.workshopjdbc3a48.services.ServiceAvis;
import edu.workshopjdbc3a48.services.ServiceFavoris;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
public class AvisController implements Initializable {

    @FXML
    private TextArea tacommentaire;
    @FXML
    private Button btnajouterf;
    @FXML
    private RadioButton rblike;
    @FXML
    private ToggleGroup react;
    @FXML
    private RadioButton rbdislike;
    @FXML
    private TextArea tadescription;
    @FXML
    private TextField tftitre;
    @FXML
    private Button btncommenter;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ajouterFavoris(ActionEvent event) {
 /*      // Get the email address of the user who posted the ad
String adEmail = getAdPosterEmail(adId);

// Send an email to the user
EmailSender.sendEmail(adEmail);
        */
        
        Favoris F1 = new Favoris();
        ServiceFavoris sf = new ServiceFavoris();
        sf.ajouter(F1);
        
         
            FXMLLoader loader = new FXMLLoader (getClass().getResource("Favoris.fxml"));
            try {
             Parent root= loader.load();
             
             Annonce A1 = new Annonce("titre1","c'est ma premiere annonce");
            FavorisController fc = loader.getController();
            fc.setTftitre1(A1.getTitre());
            fc.setTadescription1(A1.getDescription());
           
            fc.setTfidfavoris1(""+sf.getOneById(8).getId_favoris());
            fc.setTfdate1(""+sf.getOneById(8).getDate_ajout());
           tftitre.getScene().setRoot(root);
            
        } catch (IOException ex) {
            Logger.getLogger(ex.getMessage());
        }
    }

    @FXML
    private void commenter(ActionEvent event) {
        
        String note="aucune note";
            if (react.getSelectedToggle().equals(rblike)){
                note = "like";
            }
            else if (react.getSelectedToggle().equals(rbdislike)) {
               note = "dislike"; 
            }
         String commentaire = tacommentaire.getText();
            Avis A1 = new Avis(note,commentaire);
            ServiceAvis sa = new ServiceAvis();
            sa.ajouter(A1);
    }
    public void setTftitre(String message){
        this.tftitre.setText(message);
    }
    public void setTadescription(String message){
        this.tadescription.setText(message);
    }
}
