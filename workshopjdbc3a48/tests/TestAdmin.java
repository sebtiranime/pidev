/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.tests;

import edu.workshopjdbc3a48.entities.Admin;
import edu.workshopjdbc3a48.services.ServiceAdmin;

/**
 *
 * @author pc
 */
public class TestAdmin {
     public static void main(String[] args) {
         Admin a1 = new Admin ("ahmed","abdou","bfgngf","fdvbdf","bfgb");
         Admin a2 = new Admin ("ahmethd","abddghou","bfgtfghngf","fdvbdthf","bdffgb");
        ServiceAdmin sa = new ServiceAdmin();
        /*   sa.ajouter(a1);
        sa.ajouter(a2); */
       sa.supprimer(1);
        sa.supprimer(2);
     }
}
