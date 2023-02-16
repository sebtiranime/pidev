/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.services;

import edu.workshopjdbc3a48.entities.Profil;
import edu.workshopjdbc3a48.entities.Reclamation;
import edu.workshopjdbc3a48.entities.Sous_categorie;
import edu.workshopjdbc3a48.utils.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class ServiceSous_categorie implements IService<Sous_categorie>{
    
     Connection cnx= DataSource.getInstance().getCnx(); 

    @Override
    public void ajouter(Sous_categorie s) {
    try {
            String req = "INSERT INTO `sous_catégorie`(`nom`, `description`) VALUES (?,?)";
            PreparedStatement ps = cnx.prepareStatement(req);
           ps.setString(1, s.getNom());
           ps.setString(2, s.getDescription());
            ps.executeUpdate();
            System.out.println("sous_categorie ajoutée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } 
    }

    @Override
    public void supprimer(int id) {
      try {
            String req = "DELETE FROM `sous_catégorie` WHERE `id_sous_categorie` = ?" ;
          PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1, id);
           ps.executeUpdate();
            System.out.println("sous_categorie supprimée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void modifier(Sous_categorie s) {
       try {
            String req = "UPDATE `sous_catégorie` SET `nom`=?,`description`=? WHERE `id_sous_categorie`= " + s.getId_sous_categorie();
            PreparedStatement ps = cnx.prepareStatement(req);
           ps.setString(1, s.getNom());
            ps.setString(2, s.getDescription());
            ps.executeUpdate();
            System.out.println("sous_categorie modifiée !");
             } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } }

    @Override
    public List<Sous_categorie> getAll() {
      List<Sous_categorie> list = new ArrayList<>();
        try {
            String req = "SELECT * FROM `sous_catégorie`";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                Sous_categorie s = new Sous_categorie(rs.getInt(1), rs.getString(2), rs.getString(3));
                list.add(s);
             } }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;}

    @Override
    public Sous_categorie getOneById(int id) {
     Sous_categorie s =null;
        try {
            String req = "SELECT * FROM `sous_catégorie` WHERE `id_sous_categorie`=?" ;
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery(req);
            if (rs.next()) {
                 s = new Sous_categorie(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         return s; 
    }
    
}
