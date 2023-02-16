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
public class Favoris {
  	int id_favoris,id_annonce,id_article,id_user;

    public Favoris(int id_favoris, int id_annonce, int id_article, int id_user) {
        this.id_favoris = id_favoris;
        this.id_annonce = id_annonce;
        this.id_article = id_article;
        this.id_user = id_user;
    }

    public Favoris(int id_annonce, int id_article, int id_user) {
        this.id_annonce = id_annonce;
        this.id_article = id_article;
        this.id_user = id_user;
    }

    public int getId_favoris() {
        return id_favoris;
    }

    public int getId_annonce() {
        return id_annonce;
    }

    public int getId_article() {
        return id_article;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_annonce(int id_annonce) {
        this.id_annonce = id_annonce;
    }

    public void setId_article(int id_article) {
        this.id_article = id_article;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    @Override
    public String toString() {
        return "Favoris{" + "id_favoris=" + id_favoris + ", id_annonce=" + id_annonce + ", id_article=" + id_article + ", id_user=" + id_user + '}';
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
        final Favoris other = (Favoris) obj;
        if (this.id_favoris != other.id_favoris) {
            return false;
        }
        return true;
    }
        
}
