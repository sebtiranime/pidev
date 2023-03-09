/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.tests;

import edu.workshopjdbc3a48.entities.Avis;
import edu.workshopjdbc3a48.services.ServiceAvis;

/**
 *
 * @author pc
 */
public class testAvis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
    Avis A1 = new Avis("like","c'est mon premier avis");
    Avis A2 = new Avis("dislike","c'est mon 2eme avis");

     ServiceAvis sa = new ServiceAvis();  
      //sa.ajouter(A1);
      //sa.ajouter(A2);
      //sa.supprimer(2);  
      //sa.getAll();
     // System.out.print(sa.getOneById(2));
      Avis A3=sa.getOneById(2);
        A3.setNote("like");
        sa.modifier(A3);
      
    }
    
}
