
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jb778790
 */
public class CarteLoto {
    private int tab[][];
    private int jetons[][];
    private int nbCol;
    private int nbLig;
    private int nbNumeros;
    private double prix;
    private final int valMax=90;
    
    public CarteLoto(){  
        this.nbNumeros=15;
        this.nbCol = 5;
        this.nbLig=3;
        this.tab = new int[nbLig][nbCol];
        this.jetons = new int[nbLig][nbCol];
        this.prix=5;
        initMaCarte();
    }
    
    public CarteLoto(int nbc, int nbVal){  
        this.nbNumeros = nbVal;
        this.nbCol = nbc;
        this.nbLig=3;
        this.tab = new int[nbLig][nbCol];
        this.jetons = new int[nbLig][nbCol];
        this.prix=5;
        initMaCarte();
    }
    
    public double getPrix()     { return this.prix;     } 
    public int getNum()         { return this.nbNumeros;}
    public int getCol()         { return this.nbCol;    } 
    public int getLig()         { return this.nbLig;    }
    public int[][] getTab()     { return this.tab;      }
    public int[][] getJetons()  { return this.jetons;   }
    
    public void setPrix(double p)   { this.prix = p; } 
    public void setCol(int c)       { this.nbCol = c;} 
    public void setLig(int l)       { this.nbLig = l;}
    
    public void setNum(int n){ 
        if (n >= 3 && n < nbCol*nbLig)
            this.nbNumeros = n;
    }
    
    public String toString(){  
        String res="";
        for(int i=0; i<this.nbLig; i++){
            for(int j=0; j<this.nbCol; j++)
                if(tab[i][j] < 10)
                    res+="  "+tab[i][j];
            else
                    res+=" "+tab[i][j];
            res+="\n";
            }
        return res;
    }
    
    public void initMaCarte(){
        int[] t = new int[90];
        int l = t.length ,idx , x, y, e=0;
        for (int i=0;i<l;i++)
            t[i] = (i+1);
        while (e < this.nbNumeros){
            x = (int) (Math.random()*this.nbCol);
            y = (int) (Math.random()*this.nbLig);
            if (this.tab[y][x] == 0){
                idx = (int) (Math.random()*l);
                this.tab[y][x] = t[idx];
                t[idx] = t[l-1];
                l--;
                e++;
            }
        }
    }
    
    public JPanel toPanel(Color couleur){
        JPanel pan = new JPanel();
        JButton b = null;
        pan.setLayout(new GridLayout(this.getLig(), this.getCol()));
        pan.setBorder(BorderFactory.createMatteBorder( 1, 1, 1, 1, Color.BLACK));
        for (int u=0;u<this.getLig();u++)
            for (int v=0;v<this.getCol();v++){
                b = new JButton(""+this.getTab()[u][v]);
                b.setName(u+","+v);
                b.setBackground(couleur);
                if (this.getTab()[u][v] == 0)
                    b.setEnabled(false);
                pan.add(b);
            }
        return pan;
    }
    
    public boolean estDans(int val){ 
        boolean res=false;
        for(int i=0; i<this.nbLig; i++)
            for(int j=0; j<this.nbCol; j++)
                if (tab[i][j]==val) res=true;
        return res; 
    }
    
    
    public boolean placePion(int val) { 
        boolean res=false;
        for(int i=0; i<this.nbLig; i++)
            for(int j=0; j<this.nbCol; j++)
                if (tab[i][j]==val) { 
                    res=true; 
                    jetons[i][j]=val;
                }
        return res;
    }
    
    public boolean estLignePleine(int lig){ 
        boolean res=true;
        for(int j=0; j<this.nbCol; j++)
            if (jetons[lig][j]!=tab[lig][j]) res=false;
        return res;        
    }
    
    
    public int getNbLignesPleines (){
        int n = 0;
        for (int i=0;i<3;i++){
            if (estLignePleine(i))
                n++;
        }   
        return n;
    }
    
    public boolean cartonGagnant(int option){  
        return option==getNbLignesPleines(); 
    }
   
}
