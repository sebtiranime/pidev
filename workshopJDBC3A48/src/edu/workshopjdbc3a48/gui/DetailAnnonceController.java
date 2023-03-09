/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author pc
 */
public class DetailAnnonceController implements Initializable {

    @FXML
    private TextField tftitre;
    @FXML
    private TextArea tadescription;
    @FXML
    private TextField tfstatut;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void setTftitre(String message){
        this.tftitre.setText(message);
    }
    public void setTadescription(String message){
        this.tadescription.setText(message);
    }
    public void setTfstatut(String message){
        this.tfstatut.setText(message);
    }
}
