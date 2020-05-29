/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import BDD.CBDD;
import BDD.CParametresStockageBDD;
import Entities.CLivre;
import IHM.JFrameAjouter;
import IHM.JFrameLivre;
import Services.CTableLivre;

/**
 *
 * @author Coco
 */
public class App {
    
    public JFrameLivre jFrameLivre;
    public JFrameAjouter jFrameAjouter;
    public CLivreMetier livreMetier;
    private CTableLivre tableLivre;
    
    
        public void runMediathequeIHM() {

        livreMetier = new CLivreMetier();
        jFrameAjouter = new JFrameAjouter();
        jFrameAjouter.app = this;
        tableLivre = new CTableLivre(new CBDD(new CParametresStockageBDD("parametresBdd.properties")));
        this.majBiblio();
  

    }
    
    
    public void ajouterLivreIHM() {
        //this.jFrameBiblio.getjTableSelection().setValueAt(this.jFrameBiblio.getjTableSelection().getValueAt(0, 0), 0, 1);
        //String str = this.jFrameBiblio.getjTableSelection().getValueAt(0, 0).toString();
        //System.out.println(str);
        
        String auteur = this.jFrameAjouter.getjTextFieldAuteur().toString();
        String titre = this.jFrameAjouter.getjTextFieldTitre().toString();
        String synopsis = this.jFrameAjouter.getjTextAreaSynopsis().toString();
        String nombrePages = this.jFrameAjouter.getjSpinnerNombrePages().toString();
        String iSBN = this.jFrameAjouter.getjTextFieldISBN().toString();
        String anneePublication = this.jFrameAjouter.getjTextFieldAnneePublication().toString();
        String valide = this.jFrameAjouter.getjTextFieldValide().toString();
        String editeur = this.jFrameAjouter.getjTextFieldEditeur().toString();
        String langue = this.jFrameAjouter.getjTextFieldLangue().toString();
        String NombrePages = this.jFrameAjouter.getjSpinnerNombrePages().toString();
        String categories = this.jFrameAjouter.getjTextFieldCategories().toString();

        CLivre livre = this.livreMetier.enregistrerUnNouveauLivre(titre, synopsis, nombrePages, iSBN, anneePublication, valide, editeur, langue);
        this.tableLivres.insererLivre(livre);
        this.majBiblio();
        System.out.println("Point d'arrêt");
        this.afficherListejTableBiblio();
    }
    
}
