/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.entities;

import java.util.Date;





/**
 *
 * @author pc
 */
public class Annonce {
    private int id_annonce;
    private String titre, description,statut,etat_article,condition_echange,image,categorie;
    private Date date_publication;
    
    private Article acticle;
    private User user;
            
    public Annonce(int id_annonce, String titre, String description, String statut, String etat_article, String condition_echange, String categorie, Date date_publication) {
        this.id_annonce = id_annonce;
        this.titre = titre;
        this.description = description;
        this.statut = statut;
        this.date_publication = date_publication;
        this.etat_article = etat_article;
        this.condition_echange = condition_echange;
        this.categorie = categorie;
        
              
    }

    public Annonce(String titre, String description, String statut, String etat_article, String condition_echange , String categorie) {
        this.titre = titre;
        this.description = description;
        this.statut = statut;
        this.etat_article = etat_article;
        this.condition_echange = condition_echange;
        this.categorie = categorie;
    }

    public Annonce(String titre, String description, String etat_article, String condition_echange, String categorie) {
        this.titre = titre;
        this.description = description;
        this.etat_article = etat_article;
        this.condition_echange = condition_echange;
        this.categorie = categorie;
    }
    
 public Annonce(String titre, String description) {
        this.titre = titre;
        this.description = description;}
    
    public Annonce(String titre, String description, Date date_publication, String statut, String etat_article, String condition_echange) {
        this.titre = titre;
        this.description = description;
        this.date_publication = date_publication;
        this.statut = statut;
        this.etat_article = etat_article;
        this.condition_echange = condition_echange;
    }

    public Annonce() { }

    public int getId_annonce() {
        return id_annonce;
    }

    public String getTitre() {
        return titre;
    }

    public String getDescription() {
        return description;
    }

    public String getStatut() {
        return statut;
    }

    public Date getDate_publication() {
        return date_publication;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getEtat_article() {
        return etat_article;
    }

    public String getCondition_echange() {
        return condition_echange;
    }

    public void setEtat_article(String etat_article) {
        this.etat_article = etat_article;
    }

    public void setCondition_echange(String condition_echange) {
        this.condition_echange = condition_echange;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCategorie() {
        return categorie;
    }
    

    @Override
    public String toString() {
        return "Annonce{" + "id_annonce=" + id_annonce + ", titre=" + titre + ", description=" + description + ", statut=" + statut + ", etat_article=" + etat_article + ", condition_echange=" + condition_echange + ", date_publication=" + date_publication + ", acticle=" + acticle + ", user=" + user + '}';
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Annonce other = (Annonce) obj;
        if (this.id_annonce != other.id_annonce) {
            return false;
        }
        return true;
    }

   

    

    
    
}
