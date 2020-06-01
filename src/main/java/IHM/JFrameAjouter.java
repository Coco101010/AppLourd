/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;


import Entities.CAuteur;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import metier.App;
import metier.CLivreMetier;

/**
 *
 * @author Coco
 */
public class JFrameAjouter extends javax.swing.JFrame {
    
    public CLivreMetier livreMetier;
    public App app;
    public ArrayList<CAuteur> listeAuteurs = new ArrayList<CAuteur>();
    public String[] idLivres;

    /**
     * Creates new form JFrameAjouter
     */
    public JFrameAjouter() {
        initComponents();
        
        String[] auteurs = this.livreMetier.RecuperereTableauDesAuteurs();
        DefaultComboBoxModel dm = new DefaultComboBoxModel(auteurs);
        jComboBoxAuteur.setModel(dm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldTitre = new javax.swing.JTextField();
        jLabelTitre = new javax.swing.JLabel();
        jLabelSynopsis = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSynopsis = new javax.swing.JTextArea();
        jLabelNombrePages = new javax.swing.JLabel();
        jSpinnerNombrePages = new javax.swing.JSpinner();
        jTextFieldISBN = new javax.swing.JTextField();
        jLabelISBN = new javax.swing.JLabel();
        jTextFieldAnneePublication = new javax.swing.JTextField();
        jLabelAnneePublication = new javax.swing.JLabel();
        jTextFieldValide = new javax.swing.JTextField();
        jLabelValide = new javax.swing.JLabel();
        jLabelLangue = new javax.swing.JLabel();
        jTextFieldLangue = new javax.swing.JTextField();
        jTextFieldEditeur = new javax.swing.JTextField();
        jLabelEditeur = new javax.swing.JLabel();
        jLabelAuteur = new javax.swing.JLabel();
        jTextFieldCategories = new javax.swing.JTextField();
        jLabelCategories = new javax.swing.JLabel();
        jComboBoxAuteur = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldTitre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTitreActionPerformed(evt);
            }
        });

        jLabelTitre.setText("Titre");

        jLabelSynopsis.setText("Synopsis");

        jTextAreaSynopsis.setColumns(20);
        jTextAreaSynopsis.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSynopsis);

        jLabelNombrePages.setText("Nombre_Pages");

        jLabelISBN.setText("ISBN");

        jTextFieldAnneePublication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnneePublicationActionPerformed(evt);
            }
        });

        jLabelAnneePublication.setText("Année Publication");

        jLabelValide.setText("Valide");

        jLabelLangue.setText("Langue");

        jTextFieldEditeur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEditeurActionPerformed(evt);
            }
        });

        jLabelEditeur.setText("Editeur");

        jLabelAuteur.setText("Auteur");

        jTextFieldCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCategoriesActionPerformed(evt);
            }
        });

        jLabelCategories.setText("Catégories");

        jComboBoxAuteur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxAuteur.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAuteurItemStateChanged(evt);
            }
        });
        jComboBoxAuteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAuteurActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelValide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelEditeur)
                                .addComponent(jLabelLangue))
                            .addComponent(jLabelCategories))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldCategories, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jTextFieldValide)
                            .addComponent(jTextFieldLangue)
                            .addComponent(jTextFieldEditeur)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelSynopsis, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelAnneePublication)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldAnneePublication, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelAuteur, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelNombrePages))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSpinnerNombrePages, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldTitre, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(jComboBoxAuteur, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelAuteur)
                        .addGap(34, 34, 34)
                        .addComponent(jLabelTitre))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxAuteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabelSynopsis)
                        .addGap(51, 51, 51)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerNombrePages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombrePages))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelISBN)
                    .addComponent(jTextFieldISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAnneePublication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnneePublication))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelValide)
                    .addComponent(jTextFieldValide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelLangue)
                    .addComponent(jTextFieldLangue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEditeur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEditeur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCategories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCategories))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldTitreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTitreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTitreActionPerformed

    private void jTextFieldAnneePublicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnneePublicationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnneePublicationActionPerformed

    private void jTextFieldEditeurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEditeurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEditeurActionPerformed

    private void jTextFieldCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCategoriesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCategoriesActionPerformed

    private void jComboBoxAuteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAuteurActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_jComboBoxAuteurActionPerformed

    private void jComboBoxAuteurItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAuteurItemStateChanged
        // TODO add your handling code here:
        String genderStr = jComboBoxAuteur.getSelectedItem().toString();
        
    }//GEN-LAST:event_jComboBoxAuteurItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameAjouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAjouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAjouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAjouter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAjouter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxAuteur;
    private javax.swing.JLabel jLabelAnneePublication;
    private javax.swing.JLabel jLabelAuteur;
    private javax.swing.JLabel jLabelCategories;
    private javax.swing.JLabel jLabelEditeur;
    private javax.swing.JLabel jLabelISBN;
    private javax.swing.JLabel jLabelLangue;
    private javax.swing.JLabel jLabelNombrePages;
    private javax.swing.JLabel jLabelSynopsis;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JLabel jLabelValide;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerNombrePages;
    private javax.swing.JTextArea jTextAreaSynopsis;
    private javax.swing.JTextField jTextFieldAnneePublication;
    private javax.swing.JTextField jTextFieldCategories;
    private javax.swing.JTextField jTextFieldEditeur;
    private javax.swing.JTextField jTextFieldISBN;
    private javax.swing.JTextField jTextFieldLangue;
    private javax.swing.JTextField jTextFieldTitre;
    private javax.swing.JTextField jTextFieldValide;
    // End of variables declaration//GEN-END:variables

    
    
    
    public JSpinner getjSpinnerNombrePages() {
        return jSpinnerNombrePages;
    }

    public JTextArea getjTextAreaSynopsis() {
        return jTextAreaSynopsis;
    }

    public JTextField getjTextFieldAnneePublication() {
        return jTextFieldAnneePublication;
    }

    public JTextField getjTextFieldEditeur() {
        return jTextFieldEditeur;
    }

    public JTextField getjTextFieldISBN() {
        return jTextFieldISBN;
    }

    public JTextField getjTextFieldLangue() {
        return jTextFieldLangue;
    }

    public JTextField getjTextFieldTitre() {
        return jTextFieldTitre;
    }

    public JTextField getjTextFieldValide() {
        return jTextFieldValide;
    }


    public JTextField getjTextFieldCategories() {
        return jTextFieldCategories;
    }

    public JComboBox<String> getjComboBoxAuteur() {
        return jComboBoxAuteur;
    }
    
    
    

}
