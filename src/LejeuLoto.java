

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;

/**
 *
 * @author Justin
 */
public class LejeuLoto extends javax.swing.JFrame {

    /**
     * Creates new form Loto
     */
    public LejeuLoto() {
        initComponents();
        this.loto = new Loto();
        optionCall(false,0,0);
        initLoto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void initLoto(){
        lblLot.setText("Pas de lot définit");
        initJoueur();
        initCartes();
        refreshJMenu();
    }
    
    private void initJoueur(){
        this.loto.nouveauJoueur("Jonathan"); // on ajoute un nouveau joueur nommé jonathan
        this.loto.nouveauJoueur("Louis"); // on ajoute un nouveau joueur nommé louis
        refreshJoueur(); // on actualise l'affichage des joueurs
    }
    
    private void initCartes(){
        panCartes.removeAll();
        for (int i=0;i<4;i++){
            for (int j=0;j<2;j++){
                panCartes.add(this.loto.toPanel(i,j));
            }
        }
        pack();
        this.setBounds(100, 100, 1080, 720);
    }
    
    public void addJoueur(Joueur j){
        if (this.loto.getLstJ().getNbJoueur()< 4) // si il y a moins de 4 joueurs, on peut en ajouter un
            this.loto.addJoueur(j);
        refreshJoueur(); // on actualise la liste des joueurs
        initCartes();
    }
    
    private void refreshJMenu(){
        if (!this.loto.getEnjeu()){
            itemContinuer.setEnabled(true);
            itemContinuer.setEnabled(false);
            itemRecommencer.setEnabled(false);
        }
        else{
            itemContinuer.setEnabled(false);
            itemContinuer.setEnabled(true);
            itemRecommencer.setEnabled(true);
        }
    }
    
    public void refreshJoueur(){
        for (int i=0;i<this.loto.getLstJ().getNbJoueur();i++){
            ((JButton) (jPanel8.getComponent(i)) ).setName(this.loto.getLstJ().getJoueur(i).getPseudo()); // sinon on peut l'ajouté (les anciens ne seront pas actualisés)
            ((JButton) (jPanel8.getComponent(i)) ).setText(this.loto.getLstJ().getJoueur(i).getPseudo());
            ((JButton) (jPanel8.getComponent(i)) ).setBackground(this.loto.getLstJ().getJoueur(i).getCouleur());
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panCartes = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnJ1 = new javax.swing.JButton();
        btnJ2 = new javax.swing.JButton();
        btnJ3 = new javax.swing.JButton();
        btnJ4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textHistorique = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        btnTirage = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        numeroTire = new javax.swing.JLabel();
        photoLot = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblLot = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mAjout = new javax.swing.JMenu();
        itemJoueur = new javax.swing.JMenuItem();
        itemLot = new javax.swing.JMenuItem();
        mAction = new javax.swing.JMenu();
        itemOptions = new javax.swing.JMenuItem();
        itemDemarrer = new javax.swing.JMenuItem();
        itemAcheter = new javax.swing.JMenuItem();
        itemLots = new javax.swing.JMenuItem();
        itemContinuer = new javax.swing.JMenuItem();
        itemRecommencer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panCartes.setLayout(new java.awt.GridLayout(4, 2));
        getContentPane().add(panCartes, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Voici les cartes dont vous disposez");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel8.setLayout(new java.awt.GridLayout(4, 1));

        btnJ1.setText("Joueur1");
        btnJ1.setName(""); // NOI18N
        btnJ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ1ActionPerformed(evt);
            }
        });
        jPanel8.add(btnJ1);

        btnJ2.setText("Joueur2");
        btnJ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ2ActionPerformed(evt);
            }
        });
        jPanel8.add(btnJ2);

        btnJ3.setText("Joueur3");
        btnJ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ3ActionPerformed(evt);
            }
        });
        jPanel8.add(btnJ3);

        btnJ4.setText("Joueur4");
        btnJ4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJ4ActionPerformed(evt);
            }
        });
        jPanel8.add(btnJ4);

        getContentPane().add(jPanel8, java.awt.BorderLayout.EAST);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        jPanel4.setLayout(new java.awt.GridLayout(1, 2));

        textHistorique.setColumns(20);
        textHistorique.setRows(5);
        jScrollPane1.setViewportView(textHistorique);

        jPanel4.add(jScrollPane1);

        jPanel3.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(1, 3));

        btnTirage.setText("Tirage");
        btnTirage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTirageActionPerformed(evt);
            }
        });
        jPanel5.add(btnTirage);

        numeroTire.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(numeroTire);

        jPanel5.add(jPanel1);
        jPanel5.add(photoLot);

        jPanel3.add(jPanel5);

        jPanel6.add(jPanel3, java.awt.BorderLayout.SOUTH);

        jPanel9.setLayout(new java.awt.GridLayout(1, 2));

        jLabel4.setText("Historique du tirage des boules");
        jPanel9.add(jLabel4);

        jLabel5.setText("Option Choisie :");
        jPanel9.add(jLabel5);

        jPanel6.add(jPanel9, java.awt.BorderLayout.CENTER);

        lblLot.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        lblLot.setText("Cadeau:");
        jPanel7.add(lblLot);

        jPanel6.add(jPanel7, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel6, java.awt.BorderLayout.SOUTH);

        mAjout.setText("Ajout");

        itemJoueur.setText("Joueur");
        itemJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemJoueurActionPerformed(evt);
            }
        });
        mAjout.add(itemJoueur);

        itemLot.setText("Lot");
        itemLot.setToolTipText("");
        itemLot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLotActionPerformed(evt);
            }
        });
        mAjout.add(itemLot);

        jMenuBar1.add(mAjout);

        mAction.setText("Action");

        itemOptions.setText("Options Jeu");
        itemOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemOptionsActionPerformed(evt);
            }
        });
        mAction.add(itemOptions);

        itemDemarrer.setText("Démarrer Jeu");
        itemDemarrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDemarrerActionPerformed(evt);
            }
        });
        mAction.add(itemDemarrer);

        itemAcheter.setText("Acheter cartes");
        itemAcheter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAcheterActionPerformed(evt);
            }
        });
        mAction.add(itemAcheter);

        itemLots.setText("Visualiser lots");
        itemLots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLotsActionPerformed(evt);
            }
        });
        mAction.add(itemLots);

        itemContinuer.setText("Continuer");
        itemContinuer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemContinuerActionPerformed(evt);
            }
        });
        mAction.add(itemContinuer);

        itemRecommencer.setText("Recommencer");
        itemRecommencer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRecommencerActionPerformed(evt);
            }
        });
        mAction.add(itemRecommencer);

        jMenuBar1.add(mAction);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemJoueurActionPerformed
        AjoutJoueurDlg frame = new AjoutJoueurDlg(this,true); // on créé une boite AjoutJoueurDlg quand l'utilisateur clique sur Joueur
        frame.setBounds(400, 200, 480, 360); // on définit sa position et sa taille
        frame.setVisible(true); // on l'affiche
        if (frame.getFin())
            addJoueur(frame.getValue());
        refreshJoueur();
    }//GEN-LAST:event_itemJoueurActionPerformed

    private void btnJ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ1ActionPerformed
        if (this.loto.getLstJ().getNbJoueur() > 0){ // on vérifie qu'il y a un joueur, et on affiche le premier de la liste
            VisuJoueurDlg frame = new VisuJoueurDlg(this, true, this.loto.getLstJ().getJoueur(0));
            frame.setBounds(400, 200, 480, 360);
            frame.setVisible(true);
        }
    }//GEN-LAST:event_btnJ1ActionPerformed

    private void btnJ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ2ActionPerformed
        if (this.loto.getLstJ().getNbJoueur() > 1){ // on vérifie qu'il y a un joueur, et on affiche le deuxième de la liste    
            VisuJoueurDlg frame = new VisuJoueurDlg(this, true, this.loto.getLstJ().getJoueur(1));
            frame.setBounds(400, 200, 480, 360);
            frame.setVisible(true);
        }
    }//GEN-LAST:event_btnJ2ActionPerformed

    private void btnJ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ3ActionPerformed
        if (this.loto.getLstJ().getNbJoueur() > 2){  // on vérifie qu'il y a un joueur, et on affiche le troisième de la liste
            VisuJoueurDlg frame = new VisuJoueurDlg(this, true, this.loto.getLstJ().getJoueur(2));
            frame.setBounds(400, 200, 480, 360);
            frame.setVisible(true);
        }
    }//GEN-LAST:event_btnJ3ActionPerformed

    private void btnJ4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJ4ActionPerformed
        if (this.loto.getLstJ().getNbJoueur() > 3){  // on vérifie qu'il y a un joueur, et on affiche le quatrième de la liste
            VisuJoueurDlg frame = new VisuJoueurDlg(this, true, this.loto.getLstJ().getJoueur(3));
            frame.setBounds(400, 200, 480, 360);
            frame.setVisible(true);
        }
    }//GEN-LAST:event_btnJ4ActionPerformed

    private void itemLotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLotActionPerformed
        AjoutLotDlg frame = new AjoutLotDlg(this,true);
        frame.setBounds(400, 200, 480, 360);
        frame.setVisible(true);
        this.loto.addLot(frame.getValue());
        lblLot.setText("Lot : "+this.loto.getLstL().get(this.loto.getLstL().size()-1).getDesc());
    }//GEN-LAST:event_itemLotActionPerformed

    private void itemContinuerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemContinuerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemContinuerActionPerformed

    private void itemOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemOptionsActionPerformed
        int nc = this.loto.getLstJ().getJoueur(0).getLesCartes().getCarte(0).getCol();
        int nn = this.loto.getLstJ().getJoueur(0).getLesCartes().getCarte(0).getNum();
        optionCall(true,nc,nn);
    }//GEN-LAST:event_itemOptionsActionPerformed

    private void itemAcheterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAcheterActionPerformed
        AcheterCarteDlg frame = new AcheterCarteDlg(this,true,this.loto);
        frame.setBounds(400, 200, 480, 360);
        frame.setVisible(true);
        this.initCartes();
    }//GEN-LAST:event_itemAcheterActionPerformed

    private void btnTirageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTirageActionPerformed
        if (loto.getEnjeu()){
            int numTire = this.loto.tireBoule();
            numeroTire.setText(numTire+"");
            for (int i=0;i<this.loto.getLstJ().getNbJoueur();i++)
                for (int j=0;j<this.loto.getLstJ().getJoueur(i).getLesCartes().getTaille();j++){
                    this.loto.getLstJ().getJoueur(i).getLesCartes().getCarte(j).placePion(numTire);
                    if (this.loto.getLstJ().getJoueur(i).getLesCartes().getCarte(j).cartonGagnant(this.loto.getNbOptions()))
                        this.loto.getLstJ().getJoueur(i).getCollection().add(this.loto.getLstL().get(0));
                }
            textHistorique.setText(this.loto.toString());
        }
    }//GEN-LAST:event_btnTirageActionPerformed

    private void itemDemarrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDemarrerActionPerformed
        if (!this.loto.getLstL().isEmpty()){
            this.loto.joueJeu();
            refreshJMenu();
        }
    }//GEN-LAST:event_itemDemarrerActionPerformed

    private void itemRecommencerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRecommencerActionPerformed
        this.loto.nouveauJeu();
        textHistorique.setText("");
    }//GEN-LAST:event_itemRecommencerActionPerformed

    private void itemLotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLotsActionPerformed
        VisuLotsDlg frame = new VisuLotsDlg(this,true,this.loto);
        frame.setBounds(400, 200, 480, 360);
        frame.setVisible(true);
    }//GEN-LAST:event_itemLotsActionPerformed

    public void optionCall(boolean bool, int nc, int nn){
        OptionsDlg frame = new OptionsDlg(this,true,bool,nc,nn);
        frame.setBounds(400, 200, 480, 360);
        frame.setVisible(true);
        if (frame.getFin()){
            this.loto.setNbColonne(frame.getNbCol());
            this.loto.setNbNumero(frame.getNbNum());
            this.loto.setNbOptions(frame.getChoix());
            switch (this.loto.getNbOptions()){
                case 1 : {jLabel5.setText("Option Choisie : Quine");       break;}
                case 2 : {jLabel5.setText("Option Choisie : Double Quine");break;}
                case 3 : {jLabel5.setText("Option Choisie : Carton plein");break;}
            }
        }
    }
    
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
            java.util.logging.Logger.getLogger(LejeuLoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LejeuLoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LejeuLoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LejeuLoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LejeuLoto().setVisible(true);
            }
        });
    }

    public Loto loto;
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJ1;
    private javax.swing.JButton btnJ2;
    private javax.swing.JButton btnJ3;
    private javax.swing.JButton btnJ4;
    private javax.swing.JButton btnTirage;
    private javax.swing.JMenuItem itemAcheter;
    private javax.swing.JMenuItem itemContinuer;
    private javax.swing.JMenuItem itemDemarrer;
    private javax.swing.JMenuItem itemJoueur;
    private javax.swing.JMenuItem itemLot;
    private javax.swing.JMenuItem itemLots;
    private javax.swing.JMenuItem itemOptions;
    private javax.swing.JMenuItem itemRecommencer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLot;
    private javax.swing.JMenu mAction;
    private javax.swing.JMenu mAjout;
    private javax.swing.JLabel numeroTire;
    private javax.swing.JPanel panCartes;
    private javax.swing.JButton photoLot;
    private javax.swing.JTextArea textHistorique;
    // End of variables declaration//GEN-END:variables
}
