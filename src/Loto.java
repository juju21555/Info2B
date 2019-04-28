
import java.util.ArrayList;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
public class Loto {
    
    private int                 nbColonne, nbNumero, nbOptions;
    private LesJoueurs          lstJ;
    private ArrayList<Lot>      lstL;
    private ArrayList<Integer>  boulesRestantes;
    private ArrayList<String>   historiqueBoulesTires;
    private boolean             enjeu;

    public int              getNbColonne()  {return nbColonne; }
    public int              getNbNumero()   {return nbNumero;  }
    public int              getNbOptions()  {return nbOptions; }
    public LesJoueurs       getLstJ()       {return lstJ;      }
    public ArrayList<Lot>   getLstL()       {return lstL;      }
    public boolean          getEnjeu()      {return enjeu;     }

    public void setNbColonne(int nbColonne)     {this.nbColonne = nbColonne;}
    public void setNbNumero(int nbNumero)       {this.nbNumero = nbNumero;  }
    public void setNbOptions(int nbOptions)     {this.nbOptions = nbOptions;}
    
    public Loto(){
        this.lstJ = new LesJoueurs();
        this.lstL = new ArrayList<Lot>();
        this.boulesRestantes = new ArrayList<Integer>();
        this.historiqueBoulesTires = new ArrayList<String>();
        this.enjeu = false;
        for (int i=0;i<90;i++)
            this.boulesRestantes.add((i+1));
    }
    
    public void joueJeu(){this.enjeu = true;}
    public void arretJeu(){this.enjeu = false;}
    
    public void nouveauJeu(){
        this.boulesRestantes.clear();
        for (int i=0;i<90;i++)
            this.boulesRestantes.add((i+1));
        this.enjeu = true;
        this.historiqueBoulesTires.clear();
    }
    
    public int tireBoule(){
        int n = this.boulesRestantes.get((int) (Math.random()*this.boulesRestantes.size()));
        this.boulesRestantes.remove((Integer) (n));
        this.historiqueBoulesTires.add(n+" ");
        return n;
    }
    
    public void nouveauJoueur(String pseudo){
        this.addJoueur(new Joueur(pseudo));
    }
    
    public void addJoueur(Joueur j) {
        if (!j.aDesCartes())
            j.ajouteCarte(new CarteLoto(this.nbColonne, this.nbNumero));
        this.lstJ.ajouteJoueur(j); 
    }
    
    public JPanel toPanel(int i, int j){
        if (i < this.lstJ.getNbJoueur() && j < this.lstJ.getJoueur(i).getLesCartes().getTaille())
            return this.lstJ.getJoueur(i).panelAt(j);
        else
            return new JPanel();
    }
    
    public void addLot(Lot l){
        this.lstL.add(l);
    }
    
    public String toString(){
        String s="";
        for (int i=0;i<this.historiqueBoulesTires.size();i++)
            s += this.historiqueBoulesTires.get(i)+"  ";
        return s;
    }
    
}
