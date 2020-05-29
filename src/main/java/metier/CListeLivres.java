/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import Entities.CLivre;
import java.util.ArrayList;

/**
 *
 * @author Coco
 */
public class CListeLivres {

    public ArrayList<CLivre> listeLivres = new ArrayList();

    CLivre selectionnerVisiteurs(int id) {
        for (CLivre livre : this.listeLivres) {
            if (id == livre.getIdLivre()) {
                return livre;
            }
        }
        return null;
    }

    public boolean insererVisiteurs(CLivre livre) {
        if (livre == null) {
            return false;

        }
        this.listeLivres.add(livre);
        return true;
    }

    public boolean supprimerEntreprise(CLivre livre) {
        if (livre == null) {
            return false;
        }
        this.listeLivres.remove(livre);
        return true;
    }

    public boolean mettreAJourEntreprise(CLivre livreMaj) {
        if (livreMaj == null) {
            return false;
        }
        for (int i = 0; i < listeLivres.size(); i++) {
            if (listeLivres.get(i).getIdLivre() == livreMaj.getIdLivre()) {
                listeLivres.remove(i);
                listeLivres.add(i, livreMaj);

            }
        }
        return true;
    }

    public ArrayList<CLivre> lireVisiteurs() {
        return this.listeLivres;
    }

    public CLivre lireVisiteur(int id) {
        for (CLivre livre : this.listeLivres) {
            if (livre.getIdLivre() == id) {
                return livre;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        CListeLivres laliste = new CListeLivres();

        // laliste.insererVisiteurs(new CVisiteurs("1", "Nom" + ((int) (Math.random() * 100)), CUtilVisiteurs.genererMatricule(), "commune" + ((int) (Math.random() * 100)), "22000", "" + ((int) (Math.random() * 100)), "rue", "de la Pointe", "pouet@pouet.pouet", "0222222222"));
        //  laliste.insererVisiteurs(new CVisiteurs("2", "Nom" + ((int) (Math.random() * 100)), CUtilVisiteurs.genererMatricule(), "commune" + ((int) (Math.random() * 100)), "22000", "" + ((int) (Math.random() * 100)), "rue", "de la Pointe", "pouet@pouet.pouet", "0222222222"));
        //  laliste.insererVisiteurs(new CVisiteurs("3", "Nom" + ((int) (Math.random() * 100)), CUtilVisiteurs.genererMatricule(), "commune" + ((int) (Math.random() * 100)), "22000", "" + ((int) (Math.random() * 100)), "rue", "de la Pointe", "pouet@pouet.pouet", "0222222222"));
        //   laliste.insererVisiteurs(new CVisiteurs("4", "Nom" + ((int) (Math.random() * 100)), CUtilVisiteurs.genererMatricule(), "commune" + ((int) (Math.random() * 100)), "22000", "" + ((int) (Math.random() * 100)), "rue", "de la Pointe", "pouet@pouet.pouet", "0222222222"));
        laliste.listeLivres.stream().forEach((livre) -> {
            System.out.println("" + livre.toString());
        });

        System.out.println("\n");

        //   laliste.mettreAJourVisteur(new CVisiteurs("1", "NomMisÀJour" + ((int) (Math.random() * 100)), CUtilVisiteurs.genererMatricule(), "commune" + ((int) (Math.random() * 100)), "22000", "" + ((int) (Math.random() * 100)), "rue", "de la Pointe", "pouet@pouet.pouet", "0222222222"));
        laliste.listeLivres.forEach((livre) -> {
            System.out.println("" + livre.getTitreLivre());
        });

        System.out.println("\n");

        /*   laliste.supprimerVisiteurs(laliste.selectionnerVisiteurs("3")); */
        laliste.listeLivres.forEach((livre) -> {
            System.out.println("" + livre.getTitreLivre());
        });

        System.out.println("\n");

        System.out.println("" + laliste.lireVisiteur(2));
    }

    private void supprimerVisiteurs(CLivre selectionnerVisiteurs) {

    }

    private void mettreAJourVisteur(CLivre CVisiteurs) {

    }

}
