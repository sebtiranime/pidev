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
public class Avis {
   private int id_avis;
   private Date date_creation;
   private String note,commentaire;

   private Annonce annonce;
   
    public Avis(String note, Date date_creation, String commentaire) {
        this.note = note;
        this.date_creation = date_creation;
        this.commentaire = commentaire;
    }

    public Avis(String note, String commentaire) {
        this.note = note;
        this.commentaire = commentaire;
    }

    public Avis() {
    }
    
    
    
    public Avis(int id_avis, String note, Date date_creation, String commentaire) {
        this.id_avis = id_avis;
        this.note = note;
        this.date_creation = date_creation;
        this.commentaire = commentaire;
    }
    

    public int getId_avis() {
        return id_avis;
    }

    public String getNote() {
        return note;
    }

   

    public Date getDate_creation() {
        return date_creation;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setNote(String note) {
        this.note = note;
    }

    

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public String toString() {
        return "Avis{" + "id_avis=" + id_avis + ", date_creation=" + date_creation + ", note=" + note + ", commentaire=" + commentaire + '}';
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Avis other = (Avis) obj;
        if (this.id_avis != other.id_avis) {
            return false;
        }
        return true;
    }
   
   
   
   
}
