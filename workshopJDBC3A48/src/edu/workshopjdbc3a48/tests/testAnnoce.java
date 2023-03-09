/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.workshopjdbc3a48.tests;

import edu.workshopjdbc3a48.entities.Annonce;
import edu.workshopjdbc3a48.entities.Article;
import edu.workshopjdbc3a48.services.ServiceAnnonce;
import edu.workshopjdbc3a48.services.ServiceArticle;

/**
 *
 * @author pc
 */
public class testAnnoce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Annonce A1 = new Annonce("titre1","c'est ma premiere annonce","activée");
    // Annonce A2 = new Annonce("titre2","c'est ma 2eme annonce","activée");
    // ServiceAnnonce sa = new ServiceAnnonce();
        
    //sa.ajouter(A1) ; 
    // sa.ajouter(A2) ; 
    /*Annonce a = new Annonce();
             a=sa.getOneById(5);
     System.out.println(a.toString()); */
         //sa.supprimer(4);
         //sa.getAll();
         //sa.modifier(A1);
      //  Annonce A3=sa.getOneById(2);
      // A3.setTitre("ranime");
       // sa.modifier(A3);
        
       Article B1 = new Article("aa","aa","aa","aa","aa");
      Article B2 = new Article("bb","bb","bb","bb","bb");
      Article B3 = new Article("cc","cc","cc","cc","cc");
      ServiceArticle sb = new ServiceArticle();  
     // sb.ajouter(B1) ;
      //sb.ajouter(B1) ;
      //sb.ajouter(B3) ;
      sb.getAll();
    }
    
}
