/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.entities;

/**
 *
 * @author pc
 */
public class Sous_categorie {
   private int id_sous_categorie;
    private String nom,description;

    public Sous_categorie(int id_sous_categorie, String nom, String description) {
        this.id_sous_categorie = id_sous_categorie;
        this.nom= nom;
        this.description = description;
    }

    
    
    public Sous_categorie(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }

    public int getId_sous_categorie() {
        return id_sous_categorie;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "sous_categorie{" + "id_sous_categorie=" + id_sous_categorie + ", nom=" + nom + ", description=" + description + '}';
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
        final Sous_categorie other = (Sous_categorie) obj;
        return this.id_sous_categorie == other.id_sous_categorie;
    }

  
  
}
