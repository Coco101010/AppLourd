/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entities.CEditeur;
import Entities.CLangue;
import Entities.CLivre;
import Services.CTableLivre;
import metier.CLivreMetier;

/**
 *
 * @author Coco
 */
public class Main {

    public static void main(String[] args) {
        CTableLivre tableLivre1 = new CTableLivre();
        CLivreMetier tableLivre = new CLivreMetier();
        CLivre livre = new CLivre();
        livre.setTitreLivre("metier");
        livre.setSynopsisLivre("modification du metier blablablalblalblalba");
        livre.setNombrePagesLivre(789);
        livre.setISBN(7890);
        livre.setAnneePublicationLivre(1978);
        livre.setValidationLivre("VALIDE");
        livre.setEditeur(new CEditeur(1));
        livre.setLangue(new CLangue(1));
        tableLivre.enregistrerUnNouveauLivre(livre);
    }

    
    
}
