
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
public class LesJoueurs {
    
    private ArrayList<Joueur> lst;
    
    public LesJoueurs(){
        lst = new ArrayList<Joueur>();
    }
    
    public Joueur getJoueur(int i){
        return lst.get(i);
    }
    public int getNbJoueur(){
        return lst.size();
    }
    public void ajouteJoueur(Joueur j){
        lst.add(j);
    }
    public void supprimeJoueur(Joueur j){
        lst.remove(j);
    }
    
    public Joueur rechJoueur(String ps){
        Joueur j = null;
        for (int i=0;i<this.getNbJoueur();i++)
            if (this.getJoueur(i).getPseudo().equals(ps))
                j = this.getJoueur(i);
        return j;
    }
    public String toString(){
        String s = "";
        for (int i=0;i<this.getNbJoueur();i++)
            s += this.getJoueur(i).toString();
        return s;
    }
    
    
    
    
}
