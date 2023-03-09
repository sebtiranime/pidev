/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.gui;

import edu.workshopjdbc3a48.entities.Annonce;
import edu.workshopjdbc3a48.entities.Article;
import edu.workshopjdbc3a48.entities.User;
import edu.workshopjdbc3a48.services.ServiceAnnonce;
import edu.workshopjdbc3a48.services.ServiceArticle;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
    @FXML
    private TextArea tacondition_echange;
    @FXML
    private RadioButton rbneuf;
    @FXML
    private ToggleGroup etat_article;
    @FXML
    private RadioButton rbutilise;
    @FXML
    private RadioButton rbpour_piece;
     @FXML
    private TextField tfnom_user;
    @FXML
    private ComboBox<Article> cbliste_article;
    @FXML
    private ImageView ivimage;
    @FXML
    private Button btnverifier;
    @FXML
    private RadioButton rbproduit;
    @FXML
    private ToggleGroup categorie;
    @FXML
    private RadioButton rbservice;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        User u = new User("ranime");
        this.tfnom_user.setText(u.getNom());  
          ServiceArticle sa = new ServiceArticle();
        
      cbliste_article.setItems(FXCollections.observableArrayList(sa.getAll()));
    }    
 
     
    

    @FXML
     private void afficherImage (ActionEvent event) {
       
        String ch = cbliste_article.getSelectionModel().getSelectedItem().toString();

       
        if (ch.equals("article 1")) {
        ivimage.setImage(new Image("C:\\Users\\pc\\Desktop\\images\\image1.jfif"));
        } else if (ch.equals("article 2")) {
            ivimage.setImage(new Image("C:\\Users\\pc\\Desktop\\images\\image2.jfif"));
        } else if (ch.equals("article 3")) {
            ivimage.setImage(new Image("C:\\Users\\pc\\Desktop\\images\\image3.jfif"));
        }
     }


  
    
    @FXML
    private void saveAnnonce(ActionEvent event) {
        String categorie="";
            if (rbproduit.isSelected()){
                categorie = "produit";
            }
            else if (rbservice.isSelected()){
                categorie = "service";
            }
         
            String statut="";
            if (rbarchivee.isSelected()){
                statut = "archivée";
            }
            else if (rbactivee.isSelected()){
                statut = "activée";
            }
            String etat_article="";
            if (rbutilise.isSelected()){
                etat_article = "utilisé";
            }
            else if (rbpour_piece.isSelected()){
                etat_article = "pour pièce";
            }  
            else if (rbneuf.isSelected()){
                etat_article = "neuf";
            } 
            
            String titre = tftitre.getText();
            String description = tadescription.getText();
            String condition_echange = tacondition_echange.getText();
            
            Annonce A1 = new Annonce(titre,description,statut,etat_article,condition_echange,categorie);
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
