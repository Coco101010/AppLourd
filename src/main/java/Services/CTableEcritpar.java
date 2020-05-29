/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import BDD.CBDD;
import BDD.CParametresStockageBDD;
import Entities.CAuteur;
import Entities.CEcrit_par;
import Entities.CEditeur;
import Entities.CLangue;
import Entities.CLivre;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Coco
 */
public class CTableEcritpar {
    
     protected CBDD bdd;
    protected ArrayList<CLivre> listeEcritPar;

    public CBDD getBdd() {
        return bdd;
    }

    public void setBdd(CBDD bdd) {
        this.bdd = bdd;
    }

    public CTableEcritpar(CBDD bdd) {
        this.setBdd(bdd);
    }

    public CTableEcritpar() {
    }

    /**
     * méthode permettant l'insertion d'un nouveau livre dans la table en
     * prenant pour parametre un objet
     *
     * @param int idAuteur, int idLivre
     * @return retourne un int, '-1' si il y a une erreur
     */
    public int insererEcritpar(int idAuteur,int idLivre) {
        String req = "INSERT INTO `ecrit_par`(`Id_Auteur`, `Id_Livre`)"
                + "VALUES ('"
                + idAuteur + "', '"
                + idLivre + "');";
        int res = -1;
        if (bdd.connecter() == true) {
            res = bdd.executerRequeteUpdate(req);
            System.out.println("Res = " + res);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO");
        }
        return res;
    }

    public int supprimerLivre(CLivre livre) {
        //Rqt a executer
        String req = "DELETE FROM `livre` WHERE `Id_Livre` = '" + livre.getIdLivre() + "';";
        int res = -1;
        if (bdd.connecter() == true) {//Execution de la rqt
            res = bdd.executerRequeteUpdate(req);
            System.out.println("Res supprimer admin = " + res);
            bdd.deconnecter();
        } else {//Si connexion impossible a la BDD renvoi un message d'erreur
            System.out.println("Connexion KO suppression admin impossible");
        }
        return res;
    }

    public int supprimerLivre(String id) {
        //Rqt a executer
        String req = "DELETE FROM `livre` WHERE `Id_Livre` = '" + id + "';";
        int res = -1;
        if (bdd.connecter() == true) {//Execution de la rqt
            res = bdd.executerRequeteUpdate(req);
            System.out.println("Res supprimer admin = " + res);
            bdd.deconnecter();
        } else {//Si connexion impossible a la BDD renvoi un message d'erreur
            System.out.println("Connexion KO suppression admin impossible");
        }
        return res;
    }

    public int modifierLivre(CLivre livre) {
        //Requête "Modifier un Visiteur" à exécuter
        String req = "UPDATE `livre` SET Id_Livre = '"
                + livre.getIdLivre()
                + "' , Titre = '"
                + livre.getTitreLivre()
                + "' , Synopsis = '"
                + livre.getSynopsisLivre()
                + "' , Nombre_Pages = '"
                + livre.getNombrePagesLivre()
                + "' , ISBN = '"
                + livre.getISBN()
                + "' , Annee_Publication = '"
                + livre.getAnneePublicationLivre()
                + "' , Validation_Livre = '"
                + livre.getValidationLivre()
                + "' , Id_Editeur = '"
                + livre.getEditeur().getId_Editeur()
                + "' , Id_Langue = '"
                + livre.getLangue().getId_Langue()
                + "' WHERE Id_Livre = '" + livre.getIdLivre() + "';";
        System.out.println(req);              //Affichage dans la console de la requête
        int res = -1;
        if (bdd.connecter() == true) {         //Exécution de la requête d'insertion
            res = bdd.executerRequeteUpdate(req);
            System.out.println("Modifier Visiteur = " + res);
            bdd.deconnecter();
        } else {                               // Message d'erreur si impossibilité d'accès
            System.out.println("Connexion KO - Impossible d'accèder à la BDD");
        }
        return res;
    }

    public int modifierLivreId(int id) {
        //Requête "Modifier un Visiteur" à exécuter
        String req = "UPDATE FROM `livre` WHERE `Id_Livre` = '" + id + "';";
        System.out.println(req);              //Affichage dans la console de la requête
        int res = -1;
        if (bdd.connecter() == true) {         //Exécution de la requête d'insertion
            res = bdd.executerRequeteUpdate(req);
            System.out.println("Modifier Livre = " + res);
            bdd.deconnecter();
        } else {
            System.out.println("Connexion KO - Impossible d'accèder à la BDD");
        }
        return res;
    }

    CLivre convertirRsLivre(ResultSet rs) {
        try {
            String titreLivre = rs.getString("Titre");
            String synopsisLivre = rs.getString("Synopsis");
            int nombrePagesLivre = rs.getInt("Nombre_Pages");
            int isbn = rs.getInt("ISBN");
            int anneePublication = rs.getInt("Annee_Publication");
            String validationLivre = rs.getString("Validation_Livre");

            return new CLivre(titreLivre, synopsisLivre, nombrePagesLivre, isbn, anneePublication, validationLivre);
        } catch (SQLException ex) {
            Logger.getLogger(CLivre.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * Méthode qui permet de modifier un enregistrement livre dans la BDD.
     *
     * @param livre modifierLivre prend en paramètre un objet Livre
     * préalablement crée. Elle modifie cet élément au sein de la BDD.
     * @return int , retourne "-1" s'il y a une erreur.
     */
    public int modifierLivreInserer3(CLivre livre) {
        //Rqt a executer
        String req = "UPDATE `livre` SET Id_Livre ='"
                + livre.getIdLivre()
                + "' , Titre = '"
                + livre.getTitreLivre()
                + "' , Synopsis = '"
                + livre.getSynopsisLivre()
                + "' , Nombre_Pages= '"
                + livre.getNombrePagesLivre()
                + "' , ISBN = '"
                + livre.getISBN()
                + "' , Annee_Publication = '"
                + livre.getAnneePublicationLivre()
                + "' , Validation_Livre = '"
                + livre.getValidationLivre()
                + "' WHERE Id_Livre = '" + livre.getIdLivre() + "';";
        int res = -1;
        if (bdd.connecter() == true) {//Execution de la rqt
            res = bdd.executerRequeteUpdate(req);
            System.out.println("Res modifierLivre = " + res);
            bdd.deconnecter();
        } else {//Si connexion impossible a la BDD renvoi un message d'erreur
            System.out.println("Connexion KO modifierLivre");
        }
        return res;
    }

    public ArrayList<CLivre> lireLesLivres() {//Permet de lire tous les livres de la BDD
        if (bdd.connecter() == true) {
            ArrayList<CLivre> listeDesLivres = new ArrayList();
            ResultSet rs = bdd.executerRequeteQuery("SELECT * FROM `livre`");
            try {
                while (rs.next()) {//Ajout des données a une liste
                    CLivre livre = convertirRsLivre(rs);
                    listeDesLivres.add(livre);
                }
                if (listeDesLivres.isEmpty()) {//Si bbd vide renvoi un msg d'erreur
                    System.out.println("La liste des livres est vide.");
                }
            } catch (SQLException ex) {
            }
            bdd.deconnecter();
            return listeDesLivres;
        } else {//Si connexion impossible a la BDD renvoi un message d'erreur
            System.out.println("Connexion impossible bdd lire tous les livres");
        }
        return null;
    }

    public ArrayList<CLivre> lireUnLivre(int id) {//Permet de lire un livre de la BDD
        if (bdd.connecter() == true) {
            ArrayList<CLivre> listeLivre = new ArrayList();
            ResultSet rs = bdd.executerRequeteQuery("SELECT * FROM `mediatheque`.`livre` WHERE `Id_Livre` = '" + id + "';");
            try {
                while (rs.next()) {//Ajout des données a la liste
                    CLivre livre = convertirRsLivre(rs);
                    listeLivre.add(livre);
                }
                if (listeLivre.isEmpty()) {//Si données introuvables renvoi un msg d'erreur
                    System.out.println("404 Livre non trouvé");
                }
            } catch (SQLException ex) {
            }
            bdd.deconnecter();
            return listeLivre;
        } else {//Si connexion impossible a la BDD renvoi un message d'erreur
            System.out.println("Connexion KO");
        }
        return null;
    }

    public void printLivre(ArrayList<CLivre> liste) {//Permet d'afficher les lectures de la BDD
        liste.forEach((livre) -> {
            System.out.println("Titre du livre : " + livre.getTitreLivre());
            System.out.println("Synopsis du livre : " + livre.getSynopsisLivre());
            System.out.println("Nombre pages livre : " + livre.getValidationLivre());
            System.out.println("ISBN : " + livre.getISBN());
            System.out.println("Année publication : " + livre.getAnneePublicationLivre());
            System.out.println("Validation du livre : " + livre.getValidationLivre());
        });
    }

    public static void main(String[] args) {
        CTableEcritpar table = new CTableEcritpar(new CBDD(new CParametresStockageBDD("parametresBdd.properties")));
        //table.setBdd(new CBDD(new CParametresStockageBDD("parametresBdd.properties")));
        CAuteur auteur = new CAuteur("Victor","Hugo");
        auteur.setIdAuteur(1);
        CLivre livre = new CLivre();
        livre.setIdLivre(4);
        livre.setTitreLivre("fssfdsf");
        livre.setSynopsisLivre("modification");
        livre.setNombrePagesLivre(789);
        livre.setISBN(7890);
        livre.setAnneePublicationLivre(1978);
        livre.setValidationLivre("VALIDE");
        livre.setEditeur(new CEditeur(1));
        livre.setLangue(new CLangue(1));
        table.insererEcritpar(auteur.getIdAuteur(),livre.getIdLivre());
        
        
        //table.insererLivre(test);
        //table.supprimerLivre("5");
        //table.modifierLivre(4);
        //table.modifierLivre(test);
        //table.modifierLivre(test);
        //table.printLivre(table.lireLesLivres());
    }
    
}
