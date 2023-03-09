/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.gui;

import edu.workshopjdbc3a48.entities.Annonce;
import edu.workshopjdbc3a48.entities.User;
import edu.workshopjdbc3a48.services.ServiceAnnonce;
import java.io.IOException;
import java.net.URL;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class AcceuilController implements Initializable {

    @FXML
    private ListView<Annonce> lvliste_annonces;
    @FXML
    private Button btnajout_annonce;
    @FXML
    private TextField tfrecherche;
    @FXML
    private ComboBox<String> cbliste_filtres;
    @FXML
    private Button btnfiltrer;
    @FXML
    private TextField tfnom_user;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cbliste_filtres.setItems(FXCollections.observableArrayList("publiée récemment",
                "populaire","service","produit"));
        User u = new User("ranime");
        this.tfnom_user.setText(u.getNom()); 
        ServiceAnnonce sa = new ServiceAnnonce();
       List<Annonce> annonces = sa.getAll();

// Créer une ObservableList pour stocker les données des annonces
ObservableList<Annonce> observableAnnonces = FXCollections.observableArrayList(annonces);

// Configurer la ListView pour afficher les données de votre ObservableList
lvliste_annonces.setItems(observableAnnonces);

// Utiliser un CellFactory pour personnaliser l'affichage des cellules dans votre ListView
lvliste_annonces.setCellFactory((ListView<Annonce> param) -> {
            return new ListCell<Annonce>() {
                @Override
                protected void updateItem(Annonce annonce, boolean empty) {
                    super.updateItem(annonce, empty);
                    if (annonce != null) {
                        // Créer des éléments d'interface utilisateur pour afficher les détails de l'annonce
                        HBox hbox = new HBox();
                        ImageView imageView = new ImageView(new Image(annonce.getImage()));
                        Label titreLabel = new Label(annonce.getTitre());
                        Label descriptionLabel = new Label(annonce.getDescription());
                        TextArea commentaireArea = new TextArea();
                        
                        // Ajouter les éléments d'interface utilisateur à la HBox
                        hbox.getChildren().addAll(imageView, titreLabel, descriptionLabel, commentaireArea);
                        
                        // Définir la cellule comme affichant la HBox
                        setGraphic(hbox);
                    } else {
                        setGraphic(null);
                    }
                }
            };      });
         
    }    

    
    @FXML
    private void ajouterAnnonce(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader (getClass().getResource("Annonce.fxml"));
            try {
             Parent root= loader.load();
            AnnonceController ac = loader.getController();
            tfrecherche.getScene().setRoot(root);
         } catch (IOException ex) {
            Logger.getLogger(ex.getMessage());
        }
    }
/*
    @FXML
    private void filtrerAnnonce(ActionEvent event) {
          // Mettre à jour la liste d'annonces lorsqu'un critère de filtrage est sélectionné
    
        String filter = cbliste_filtres.getSelectionModel().getSelectedItem();
        switch (filter) {
            case "Plus récent":
                // Trier les annonces par date de création, de la plus récente à la plus ancienne
                lvliste_annonces.getItems().sort(Comparator.comparing(Annonce::getDateCreation).reversed());
                break;
            case "Populaire":
                // Filtrer les annonces qui ont au moins un commentaire
                ObservableList<Annonce> filteredAnnonces = lvliste_annonces.getItems().filtered(a -> !a.getCommentaires().isEmpty());
                // Trier les annonces filtrées par ordre décroissant du nombre de commentaires
                filteredAnnonces.sort(Comparator.comparingInt(a -> a.getCommentaires().size()).reversed());
                lvliste_annonces.setItems(filteredAnnonces);
                break;
            case "Produit":
                // Filtrer les annonces de catégorie "Produit"
                lvliste_annonces.setItems(lvliste_annonces.getItems().filtered(a -> a.getCategorie().equals("Produit")));
                break;
            case "Service":
                // Filtrer les annonces de catégorie "Service"
                lvliste_annonces.setItems(lvliste_annonces.getItems().filtered(a -> a.getCategorie().equals("Service")));
                break;
            default:
                break;
        }
    }  */
}




