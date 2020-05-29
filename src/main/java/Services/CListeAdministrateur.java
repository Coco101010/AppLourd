/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.CAdministrateur;
import java.util.ArrayList;

/**
 *
 * @author Coco
 */
public class CListeAdministrateur {

    public ArrayList<CAdministrateur> listAdmin = new ArrayList();

    public ArrayList<CAdministrateur> getListAdmin() {
        return listAdmin;
    }

    public void setListAdmin(ArrayList<CAdministrateur> listAdmin) {
        this.listAdmin = listAdmin;
    }

    public int insererAdmin(CAdministrateur administrateur) {
        if (administrateur != null) {
            this.listAdmin.add(administrateur);
            return 1;
        }
        return -1;
    }

    public int supprimerAdmin(CAdministrateur administrateur) {
        if (administrateur != null) {
            this.listAdmin.remove(administrateur);
            return 1;
        }
        return -1;
    }

    public void afficherAdmin() {
        for (int i = 0; i < this.listAdmin.size(); i++) {
            System.out.println(this.listAdmin.get(i).getIdAdmin());
            System.out.println(this.listAdmin.get(i).getIdentifiantAdmin());
            System.out.println(this.listAdmin.get(i).getMdpAdmin());
            System.out.println(this.listAdmin.get(i).getNomAdmin());
            System.out.println(this.listAdmin.get(i).getPrenomAdmin());
        }
    }

    public int modifierMedicament(CAdministrateur administrateur) {
        if (administrateur != null) {
            for (int i = 0; i < this.getListAdmin().size(); i++) {
                this.getListAdmin().set(i, administrateur);
                return 1;
            }
        }
        return -1;
    }
}
