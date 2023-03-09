/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.services;

import edu.workshopjdbc3a48.entities.Avis;
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
public class ServiceAvis implements IService<Avis>{
 Connection cnx= DataSource.getInstance().getCnx();

    @Override
    public void ajouter(Avis a) {
     try {
            String req = "INSERT INTO `avis`(`note`, `date_creation`,`commentaire`) VALUES (?,CURRENT_TIMESTAMP(),?)";
            PreparedStatement ps = cnx.prepareStatement(req);
           ps.setString(1, a.getNote());
            ps.setString(2, a.getCommentaire());
             ps.executeUpdate();
            System.out.println("avis ajoutée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } 
    }

    @Override
    public void supprimer(int id) {
      try {
            String req = "DELETE FROM `avis` WHERE `id_avis`= ?" ;
          PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1, id);
           ps.executeUpdate();
            System.out.println("avis supprimé !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }}

    @Override
    public void modifier(Avis a) {
     try {
            String req = "UPDATE `avis` SET `note`=?,`commentaire`=? WHERE `id_avis`=" + a.getId_avis();
            PreparedStatement ps = cnx.prepareStatement(req);
           ps.setString(1, a.getNote());
            ps.setString(2, a.getCommentaire());
            ps.executeUpdate();
            System.out.println("avis modifié !");
             } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }  }

    @Override
    public List<Avis> getAll() {
      List<Avis> list = new ArrayList<>();
        try {
            String req = "SELECT * FROM `avis`";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
               Avis a = new Avis(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getString(4));
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
        return list;}

    @Override
    public Avis getOneById(int id) {
     Avis a =new Avis();
        try {
            String req = "SELECT * FROM `avis` WHERE `id_avis` = " + id ;
            PreparedStatement ps = cnx.prepareStatement(req);
            //ps.setInt(1,id);
            ResultSet rs = ps.executeQuery(req);
            if (rs.next()) {
                 a = new Avis(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getString(4));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         return a; 
    } }

  
  
  

