/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.services;


import edu.workshopjdbc3a48.entities.Annonce;

import edu.workshopjdbc3a48.utils.DataSource;
import java.sql.Connection;
import java.sql.Date;
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
public class ServiceAnnonce implements IService<Annonce> {

 Connection cnx= DataSource.getInstance().getCnx();

    @Override
   public void ajouter(Annonce a) {
    try {
        String req = "INSERT INTO `annonce`(`titre`, `description`, `statut`, `condition-echange`, `etat_article`,`date_publication` ) VALUES(?, ?, ?,CURRENT_TIMESTAMP())";
        PreparedStatement ps = cnx.prepareStatement(req);
        ps.setString(1, a.getTitre());
        ps.setString(2, a.getDescription()); 
        ps.setString(3, a.getStatut());
        ps.setString(4, a.getEtat_article());
        ps.setString(5, a.getCondition_echange());
        ps.executeUpdate();
        System.out.println("annonce ajoutée !");
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
}


    @Override
    public void supprimer(int id) {
        try {
            String req = "DELETE FROM `annonce` WHERE `id_annonce` = ?" ;
          PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1, id);
           ps.executeUpdate();
            System.out.println("annonce supprimé !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void modifier(Annonce a) {
        try {
            String req = "UPDATE `annonce` SET `titre`=?,`description`=?,`statut`=?, `etat_article`=?, `condition-echange`=? WHERE `id_annonce`=" + a.getId_annonce();
            PreparedStatement ps = cnx.prepareStatement(req);
          ps.setString(1, a.getTitre());
           ps.setString(2, a.getDescription()); 
          ps.setString(3, a.getStatut());
           ps.setString(4, a.getEtat_article());
        ps.setString(5, a.getCondition_echange());
            ps.executeUpdate();
            System.out.println("annonce modifiée !");
             } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Annonce> getAll() {
        List<Annonce> list = new ArrayList<>();
        try {
            String req = "SELECT * FROM `annonce`";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                Annonce a = new Annonce(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getDate(8));
                list.add(a);
             }
        }
        
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       for(int i=0;i<list.size();i++)
       
       {
           System.out.println(list.get(i));
       }

        return list;
    }

    @Override
    public Annonce getOneById(int id) {
         Annonce a =new Annonce();
        try {
          String req = "SELECT * FROM `annonce` WHERE `id_annonce`=" + id;
            PreparedStatement ps = cnx.prepareStatement(req);
           // ps.setInt(1,id);
            ResultSet rs = ps.executeQuery(req);
            if (rs.next()) {
                 a = new Annonce(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getDate(8));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         return a; 
    }
    }
 

    
    
    

