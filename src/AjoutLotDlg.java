
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
public class AjoutLotDlg extends javax.swing.JDialog {

    /**
     * Creates new form VisuLotDlg
     */
    public AjoutLotDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.bon = true;
        this.niveau = 1;
        switchTypeLot();
    }
    
    public void switchTypeLot(){
        if (this.bon){
            btnImage.setVisible(false);
            btnParcourir.setVisible(false);
            comboValeur.setVisible(true);
        }
        else{
            btnImage.setVisible(true);
            btnParcourir.setVisible(true);
            comboValeur.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAnnuler = new javax.swing.JButton();
        btnValider = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textDescription = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        radioBon = new javax.swing.JRadioButton();
        readioObjet = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        radioN1 = new javax.swing.JRadioButton();
        radioN2 = new javax.swing.JRadioButton();
        radioN3 = new javax.swing.JRadioButton();
        jPanel13 = new javax.swing.JPanel();
        btnImage = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        comboValeur = new javax.swing.JComboBox<>();
        btnParcourir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Saisie d'un nouveau lot");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        btnAnnuler.setText("Annuler");
        jPanel3.add(btnAnnuler);

        btnValider.setText("Valider");
        btnValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValiderActionPerformed(evt);
            }
        });
        jPanel3.add(btnValider);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel12.setLayout(new java.awt.GridLayout(2, 0));

        jPanel1.setLayout(new java.awt.GridLayout(3, 2));

        jLabel2.setText("Descriptif");
        jPanel4.add(jLabel2);

        jPanel1.add(jPanel4);

        textDescription.setText("Bon d'achat Carrefour");
        textDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDescriptionActionPerformed(evt);
            }
        });
        jPanel1.add(textDescription);

        jLabel3.setText("Catégorie");
        jPanel5.add(jLabel3);

        jPanel1.add(jPanel5);

        jPanel7.setLayout(new java.awt.GridLayout(1, 2));

        buttonGroup1.add(radioBon);
        radioBon.setSelected(true);
        radioBon.setText("Bon cadeau");
        radioBon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBonActionPerformed(evt);
            }
        });
        jPanel7.add(radioBon);

        buttonGroup1.add(readioObjet);
        readioObjet.setText("Objet");
        readioObjet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readioObjetActionPerformed(evt);
            }
        });
        jPanel7.add(readioObjet);

        jPanel1.add(jPanel7);

        jLabel4.setText("Niveau");
        jPanel8.add(jLabel4);

        jPanel1.add(jPanel8);

        jPanel9.setLayout(new java.awt.GridLayout(1, 3));

        buttonGroup2.add(radioN1);
        radioN1.setSelected(true);
        radioN1.setText("1");
        radioN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioN1ActionPerformed(evt);
            }
        });
        jPanel9.add(radioN1);

        buttonGroup2.add(radioN2);
        radioN2.setText("2");
        radioN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioN2ActionPerformed(evt);
            }
        });
        jPanel9.add(radioN2);

        buttonGroup2.add(radioN3);
        radioN3.setText("3");
        radioN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioN3ActionPerformed(evt);
            }
        });
        jPanel9.add(radioN3);

        jPanel1.add(jPanel9);

        jPanel12.add(jPanel1);

        jPanel13.setLayout(new java.awt.GridLayout(1, 2));
        jPanel13.add(btnImage);

        jPanel14.setLayout(new java.awt.GridLayout(2, 1));

        comboValeur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30€", "50€", "70€" }));
        jPanel14.add(comboValeur);

        btnParcourir.setText("Parcourir");
        btnParcourir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParcourirActionPerformed(evt);
            }
        });
        jPanel14.add(btnParcourir);

        jPanel13.add(jPanel14);

        jPanel12.add(jPanel13);

        getContentPane().add(jPanel12, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDescriptionActionPerformed
        
    }//GEN-LAST:event_textDescriptionActionPerformed

    private void readioObjetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readioObjetActionPerformed
        this.bon = false;
        switchTypeLot();
    }//GEN-LAST:event_readioObjetActionPerformed

    private void radioBonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBonActionPerformed
        this.bon = true;
        switchTypeLot();
    }//GEN-LAST:event_radioBonActionPerformed

    private void radioN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioN1ActionPerformed
        this.niveau = 1;
    }//GEN-LAST:event_radioN1ActionPerformed

    private void radioN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioN2ActionPerformed
        this.niveau = 2;
    }//GEN-LAST:event_radioN2ActionPerformed

    private void radioN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioN3ActionPerformed
        this.niveau = 3;
    }//GEN-LAST:event_radioN3ActionPerformed

    private void btnValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValiderActionPerformed
        desc = textDescription.getText();
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_btnValiderActionPerformed

    private void btnParcourirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParcourirActionPerformed
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION){
            im = new ImageIcon(fc.getSelectedFile().getAbsolutePath());
            btnImage.setIcon(im);
        }    
    }//GEN-LAST:event_btnParcourirActionPerformed

    public Lot getValue(){
        return new Lot(this.desc, this.niveau, this.bon, this.im);
    }
    
    private boolean bon;
    private int niveau;
    private ImageIcon im;
    private String desc;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnuler;
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnParcourir;
    private javax.swing.JButton btnValider;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> comboValeur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton radioBon;
    private javax.swing.JRadioButton radioN1;
    private javax.swing.JRadioButton radioN2;
    private javax.swing.JRadioButton radioN3;
    private javax.swing.JRadioButton readioObjet;
    private javax.swing.JTextField textDescription;
    // End of variables declaration//GEN-END:variables
}