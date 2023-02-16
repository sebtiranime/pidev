/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.services;

import edu.workshopjdbc3a48.entities.Compte;
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
public class ServiceCompte implements IService<Compte>{
Connection cnx= DataSource.getInstance().getCnx();


    @Override
    public void ajouter(Compte c) {
         try {
            String req = "INSERT INTO `compte`(`date_creation`, `duree_validite`) VALUES (?,?)";
            PreparedStatement ps = cnx.prepareStatement(req);
           ps.setString(1, c.getDate_creation());
            ps.setString(2, c.getDuree_validite());
            ps.executeUpdate();
            System.out.println("compte ajouté !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void supprimer(int id) {
         try {
            String req = "DELETE FROM `compte` WHERE `id_compte` = ?" ;
          PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1, id);
           ps.executeUpdate();
            System.out.println("compte supprimé !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void modifier(Compte c) {
          try {
            String req = "UPDATE `compte` SET `date_creation`=?,`duree_validite`=? WHERE `id_compte`= " + c.getId_compte();
            PreparedStatement ps = cnx.prepareStatement(req);
           ps.setString(1, c.getDate_creation());
            ps.setString(2, c.getDuree_validite());
            ps.executeUpdate();
            System.out.println("compte modifié !");
             } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Compte> getAll() {
        List<Compte> list = new ArrayList<>();
        try {
            String req = "Select * from `compte`";
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(req);
            while (rs.next()) {
                Compte c = new Compte(rs.getInt(1), rs.getString(2), rs.getString(3));
                list.add(c);
             } }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return list;
    }

    @Override
    public Compte getOneById(int id) {
        Compte c =null;
        try {
            String req = "SELECT * FROM `admin` WHERE `id_admin`=?" ;
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery(req);
            if (rs.next()) {
                 c = new Compte(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
         return c; 
    }
    }
    

