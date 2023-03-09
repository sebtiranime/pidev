/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abdelazizmezri
 */
public class DataSource {
    
    private Connection cnx;
    private static DataSource instance;
    
    private final String USER = "root";
    private final String PWD = "";
    private final String URL = "jdbc:mysql://localhost:3306/esprit";   //jbdc : c stands for connectivity

    private DataSource() {
        try {
            cnx = DriverManager.getConnection(URL, USER, PWD);    // atron de concetion desigh atten : singleton
            System.out.println("Connected !");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static DataSource getInstance() {
        if(instance == null)
            instance = new DataSource();
        return instance;
    }

    public Connection getCnx() {
        return cnx;
    }
    
}
