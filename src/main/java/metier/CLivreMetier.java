/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import BDD.CBDD;
import BDD.CParametresStockageBDD;
import Entities.CAuteur;
import Entities.CEditeur;
import Entities.CLangue;
import Entities.CLivre;
import Entities.CVignette;
import Services.CTableAuteur;
import Services.CTableEcritpar;
import Services.CTableLivre;
import java.util.ArrayList;

/**
 *
 * @author Coco
 */
public class CLivreMetier {

    private CTableLivre tableLivre;
    private CTableAuteur tableAuteur;
    private CTableEcritpar tableEcritpar;
    public ArrayList<CLivre> listeLivres = new ArrayList<CLivre>();

    public CLivreMetier() {
        this.tableLivre = new CTableLivre(new CBDD(new CParametresStockageBDD("parametresBdd.properties")));
        this.tableAuteur = new CTableAuteur(new CBDD(new CParametresStockageBDD("parametresBdd.properties")));
        this.tableEcritpar = new CTableEcritpar(new CBDD(new CParametresStockageBDD("parametresBdd.properties")));
    }

    public void enregistrerUnNouveauLivre(CLivre livre, CAuteur auteur) {
        tableLivre.insererLivre(livre);
        tableEcritpar.insererEcritpar(auteur.getIdAuteur(), livre.getIdLivre());       
    }

    public void supprimerLivre(CLivre livre) {
        tableLivre.supprimerLivre(livre);
    }

    public void modifierLivre(CLivre livre) {
        tableLivre.modifierLivre(livre);
    }

    /**
     * méthode permettant de retourner la liste de tous les médicament sous
     * forme de tableau d'objet.
     *
     * @return retourne tableau d'objet comprenant tous les médicaments.
     */
    public ArrayList<CLivre> RecupererListeDesLivres() {
        ArrayList<CLivre> listeLivres = tableLivre.lireLesLivres();
        tableLivre.printLivre(listeLivres);
        return listeLivres;
    }

//    /**
//     * Méthode de recherche globale (tout attribut) à partir d'un mot-clé. Elle
//     * va créer une liste des livres qui peuvent correspondre à la recherche et
//     * la retourner. On passe en revue chaque attribut et dès qu'un contient le
//     * mot-clé de recherche on change l'état d'ajout à la liste de résultat.
//     *
//     * @param recherche Mot-clé de recherche
//     */
//    public ArrayList<CLivre> globaSearch(String recherche) {
//        //Préparation de la liste de résultats
//        ArrayList<CLivre> resultatDeRecherche = new ArrayList();
//        //Boucle sur la liste de livres complète
//        for (CLivre livre : listeLivres) {
//            //Creation (et initialisation éventuelle) du boolean gérant l'ajout
//            boolean ajout/* = false*/;
//            //Liste de vérifications
//            if (this.verifContainStr(livre.getTitreLivre(), recherche)) {
//                ajout = true;
//            } else if (this.verifContainStr(livre.getSynopsisLivre(), recherche)) {
//                ajout = true;
//            } else if (this.verifContainStr(String.valueOf(livre.getNombrePagesLivre()), recherche)) {
//                ajout = true;
//            } else if (this.verifContainStr(String.valueOf(livre.getISBN()), recherche)) {
//                ajout = true;
//            } else if (this.verifContainStr(String.valueOf(livre.getAnneePublicationLivre()), recherche)) {
//                ajout = true;
//            } else if (this.verifContainStr(livre.getEditeur().getNom_Editeur(), recherche)) {
//                ajout = true;
//            } else if (this.verifContainStr(livre.getAnneeEdition(), recherche)) {
//                ajout = true;
//            } else if (this.verifContainStr(livre.getLangue(), recherche)) {
//                ajout = true;
//            } else if (this.verifContainStr(livre.getFormat(), recherche)) {
//                ajout = true;
//            } else {
//                /*
//                Pour être "sûr" on refixe le booleen déterminant l'ajout à 
//                false dans le cas ou rien ne convient. Si le boolean est initialisé
//                à false, cette partie est redondante.
//                 */
//                ajout = false;
//            }
//            //ajout à la liste de résultats conditionnel à chaque itération
//            if (ajout) {
//                resultatDeRecherche.add(livre);
//            }
//        }//Sortie de la boucle for
//        return resultatDeRecherche;
//    }

    /**
     * Méthode de vérification qu'une String contenant contient une String
     * contenu ignorant la casse
     *
     * @param contenant La String dans laquelle on recherche
     * @param contenu La String que l'on essaie de retrouver
     */
    public boolean verifContainStr(String contenant, String contenu) {
        return contenant.toLowerCase().contains(contenu.toLowerCase());
    }

    /**
     * Méthode pour enregistre un livre dans la liste en attribut.
     *
     * @param livre le livre à ajouter
     */
    public void enregistrerLivre(CLivre livre) {
        this.listeLivres.add(livre);
    }

//    /**
//     *
//     * @param titre
//     * @param auteur
//     * @param ref
//     * @param nbrePages
//     * @param edition
//     * @param genre
//     * @param anneeEdition
//     * @param langue
//     * @param format
//     * @return
//     */
//    public CLivre creationLivre(String titre, String auteur, String ref, String nbrePages, String edition, String genre, String anneeEdition, String langue, String format) {
//        CLivre livre = new CLivre(titre, auteur, ref, nbrePages, edition, genre, anneeEdition, langue, format);
//        return livre;
//    }

//    public ArrayList<CLivre> uniSearch(String recherche, int critere) {
//        //Préparation de la liste de résultats
//        ArrayList<CLivre> resultatDeRecherche = new ArrayList();
//        //Boucle sur la liste de livres complète
//        listeLivres.forEach((livre) -> {
//            //Creation (et initialisation éventuelle) du boolean gérant l'ajout
//            boolean ajout/* = false*/;
//            //Liste de vérifications
//            if (this.verifContainStr(livre.getTitre(), recherche) && critere == 1) {
//                ajout = true;
//            } else if (this.verifContainStr(livre.getAuteur(), recherche) && critere == 2) {
//                ajout = true;
//            } else if (this.verifContainStr(livre.getRef(), recherche) && critere == 3) {
//                ajout = true;
//            } else if (this.verifContainStr(livre.getNbrePages(), recherche) && critere == 4) {
//                ajout = true;
//            } else if (this.verifContainStr(livre.getEdition(), recherche) && critere == 5) {
//                ajout = true;
//            } else if (this.verifContainStr(livre.getGenre(), recherche) && critere == 6) {
//                ajout = true;
//            } else if (this.verifContainStr(livre.getAnneeEdition(), recherche) && critere == 7) {
//                ajout = true;
//            } else if (this.verifContainStr(livre.getLangue(), recherche) && critere == 8) {
//                ajout = true;
//            } else if (this.verifContainStr(livre.getFormat(), recherche) && critere == 9) {
//                ajout = true;
//            } else {
//                /*
//                Pour être "sûr" on refixe le booleen déterminant l'ajout à
//                false dans le cas ou rien ne convient. Si le boolean est initialisé
//                à false, cette partie est redondante.
//                 */
//                ajout = false;
//            }
//            //ajout à la liste de résultats conditionnel à chaque itération
//            if (ajout) {
//                resultatDeRecherche.add(livre);
//            }
//        }); //Sortie de la boucle for
//        return resultatDeRecherche;
//    }

    public static void main(String[] args) {
        //CTableLivre table = new CTableLivre(new CBDD(new CParametresStockageBDD("parametresBdd.properties")));
        CLivreMetier tableLivre = new CLivreMetier();
        CLivre livre = new CLivre();
        livre.setTitreLivre("metierApresModification");
        livre.setSynopsisLivre("modification du metier ");
        livre.setNombrePagesLivre(789);
        livre.setISBN(7890);
        livre.setAnneePublicationLivre(1978);
        livre.setValidationLivre("VALIDE");
        livre.setVignette(new CVignette(1));
        livre.setEditeur(new CEditeur(2));
        livre.setLangue(new CLangue(1));
        CAuteur auteur = new CAuteur("Victor","Hugo");

        tableLivre.enregistrerUnNouveauLivre(livre, auteur);
    }

}
