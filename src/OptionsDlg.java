

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
public class OptionsDlg extends javax.swing.JDialog {

    /**
     * Creates new form OptionsDlg
     */
    public OptionsDlg(java.awt.Frame parent, boolean modal, boolean ca, int nc, int nn) {
        super(parent, modal);
        initComponents();
        remplirComboCol();
        rb1.setSelected(true);
        this.fin = false;
        if (!ca){
            this.nbCol = 5;
            this.nbNum = 5;
            NbNumero.setText(""+this.nbNum);
            ComboNbCol.setSelectedItem(this.nbCol);
        }
        else{
            this.nbCol = nc;
            this.nbNum = nn;
            NbNumero.setText(""+this.nbNum);
            ComboNbCol.setSelectedItem(this.nbCol);
            NbNumero.setEnabled(false);
            ComboNbCol.setEnabled(false);
            Message.setText("Nb de colonnes et de numéros non modifiables");
        }
    }
    
    private void remplirComboCol(){
        ComboNbCol.removeAllItems();
        for (int i=5;i<10;i++)
            ComboNbCol.addItem(i+"");
    }
    
    
    public int      getNbCol()  {return this.nbCol;    }
    public int      getChoix()  {return this.choixOpt; }
    public int      getNbNum()  {return this.nbNum;    }
    public boolean  getFin()    {return this.fin;      }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Annuler = new javax.swing.JButton();
        Valider = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ComboNbCol = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        NbNumero = new javax.swing.JTextField();
        Message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Options du jeu");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        Annuler.setText("Annuler");
        Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnulerActionPerformed(evt);
            }
        });
        jPanel2.add(Annuler);

        Valider.setText("Valider");
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });
        jPanel2.add(Valider);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        jPanel4.setLayout(new java.awt.GridLayout(4, 1));

        jLabel2.setText("Comment voulez-vous jouer ?");
        jPanel4.add(jLabel2);

        buttonGroup1.add(rb1);
        rb1.setText("Quine - Une ligne complète");
        jPanel4.add(rb1);

        buttonGroup1.add(rb2);
        rb2.setText("Double Quine - Deux lignes complètes");
        jPanel4.add(rb2);

        buttonGroup1.add(rb3);
        rb3.setText("Carton plein - Trois lignes complètes");
        jPanel4.add(rb3);

        jPanel3.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(4, 2));

        jLabel3.setText("Configuration des cartons");
        jPanel5.add(jLabel3);
        jPanel5.add(jLabel4);

        jLabel5.setText("Combien de colonnes ?");
        jPanel5.add(jLabel5);

        ComboNbCol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel5.add(ComboNbCol);

        jLabel6.setText("Combien de numéros ?");
        jPanel5.add(jLabel6);
        jPanel5.add(NbNumero);
        jPanel5.add(Message);

        jPanel3.add(jPanel5);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        if (rb1.isSelected())
            this.choixOpt = 1;
        else if (rb2.isSelected())
            this.choixOpt = 2;
        else
            this.choixOpt = 3;
        this.nbCol = Integer.parseInt((String) (ComboNbCol.getSelectedItem()));
        if (NbNumero.getText().equals(""))
            Message.setText("La zone d'édition est vide");
        else
            if (Integer.parseInt(NbNumero.getText()) < 5 || Integer.parseInt(NbNumero.getText()) > this.nbCol*3)
                Message.setText("Erreur sur le nombre de numéro");
            else
                this.nbNum = Integer.parseInt(NbNumero.getText());
        this.fin = true;
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_ValiderActionPerformed

    
    private void AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnulerActionPerformed
        this.fin = false;
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_AnnulerActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if (this.fin == false && ComboNbCol.isEnabled()){ // Si on ferme la fenetre au debut du jeu, autrement qu'en ayant valider les options, on finit le jeu
            this.getParent().setVisible(false);
            this.getParent().setEnabled(false);
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosed

    private int choixOpt; // entier qui représente le choix de l'utilisateur (Quine , Double Quine ou carton plein via les JRadioButton)
    private int nbCol;    // entier qui représente le nombre de colonnes choisit par l'utilisateur (via la JComboBox)
    private int nbNum;    // entier qui représente le nombre de numéro choisit par l'utilsateur (via le JTextField)
    private boolean fin;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JComboBox<String> ComboNbCol;
    private javax.swing.JLabel Message;
    private javax.swing.JTextField NbNumero;
    private javax.swing.JButton Valider;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    // End of variables declaration//GEN-END:variables
}
