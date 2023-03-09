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
public class Compte {
    private int	id_compte;
    private String date_creation,duree_validite;

    public Compte(int id_compte, String date_creation, String duree_validite) {
        this.id_compte = id_compte;
        this.date_creation = date_creation;
        this.duree_validite = duree_validite;
    }

    
    public Compte(String date_creation, String duree_validite) {
        this.date_creation = date_creation;
        this.duree_validite = duree_validite;
    }

    public int getId_compte() {
        return id_compte;
    }

    public String getDate_creation() {
        return date_creation;
    }

    public String getDuree_validite() {
        return duree_validite;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public void setDuree_validite(String duree_validite) {
        this.duree_validite = duree_validite;
    }

    @Override
    public String toString() {
        return "compte{" + "id_compte=" + id_compte + ", date_creation=" + date_creation + ", duree_validite=" + duree_validite + '}';
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
        final Compte other = (Compte) obj;
        if (this.id_compte != other.id_compte) {
            return false;
        }
        return true;
    }
    
    
    
    
}
