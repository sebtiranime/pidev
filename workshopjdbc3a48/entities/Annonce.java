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
    private String titre, description,statut;
    private Date date_publication;
    
    private Article acticle;
    private User user;
            
    public Annonce(int id_annonce, String titre, String description, String statut, Date date_publication) {
        this.id_annonce = id_annonce;
        this.titre = titre;
        this.description = description;
        this.statut = statut;
        this.date_publication = date_publication;
    }

    public Annonce(String titre, String description, String statut) {
        this.titre = titre;
        this.description = description;
        this.statut = statut;
    }

    public Annonce(String titre, String description) {
        this.titre = titre;
        this.description = description;
    }
    

    
    public Annonce(String titre, String description, Date date_publication, String statut) {
        this.titre = titre;
        this.description = description;
        this.date_publication = date_publication;
        this.statut = statut;
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

    @Override
    public String toString() {
        return "Annonce{" + "id_annonce=" + id_annonce + ", titre=" + titre + ", description=" + description + ", statut=" + statut + ", date_publication=" + date_publication + '}';
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
