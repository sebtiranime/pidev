/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class FavorisController implements Initializable {

    @FXML
    private TextField tftitre1;
    @FXML
    private TextArea tadescription1;
    @FXML
    private TextField tftitre2;
    @FXML
    private TextField tftitre3;
    @FXML
    private TextArea tadescription3;
    @FXML
    private TextArea tadescription2;
    @FXML
    private Button btnretirer1;
    @FXML
    private TextField tfdate1;
    @FXML
    private TextField tfdate3;
    @FXML
    private TextField tfdate2;
    @FXML
    private TextField tfidfavoris1;
    @FXML
    private TextField tfidfavoris3;
    @FXML
    private TextField tfidfavoris2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void retirer(ActionEvent event) {
    }
    public void setTfidfavoris1(String message){
        this.tfidfavoris1.setText(message);
    }
    public void setTfdate1(String message){
        this.tfdate1.setText(message);
    }
    public void setTfidfavoris2(String message){
        this.tfidfavoris2.setText(message);
    }
    public void setTfdate2(String message){
        this.tfdate1.setText(message);
    }
    public void setTfidfavoris3(String message){
        this.tfidfavoris1.setText(message);
    }
    public void setTfdate3(String message){
        this.tfdate1.setText(message);
    }
}
