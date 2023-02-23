/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.tests;

import edu.workshopjdbc3a48.entities.Annonce;
import edu.workshopjdbc3a48.services.ServiceAnnonce;

/**
 *
 * @author pc
 */
public class testAnnoce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Annonce A1 = new Annonce("titre1","c'est ma premiere annonce","activée");
     Annonce A2 = new Annonce("titre2","c'est ma 2eme annonce","activée");
     ServiceAnnonce sa = new ServiceAnnonce();
        
    //sa.ajouter(A1) ; 
    // sa.ajouter(A2) ; 
    /*Annonce a = new Annonce();
             a=sa.getOneById(5);
     System.out.println(a.toString()); */
         //sa.supprimer(4);
         //sa.getAll();
         //sa.modifier(A2);
         System.out.print(sa.getOneById(2));
    }
    
}
