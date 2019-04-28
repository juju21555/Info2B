
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
public class LesCartes {
    private ArrayList<CarteLoto> lst;
    
    public LesCartes(){
        initLesCartes();
    }
    
    public int getTaille(){
        return lst.size();
    }
    public CarteLoto getCarte(int i){
        return lst.get(i);
    }
    public void ajouteCarte(CarteLoto c){
        lst.add(c);
    }
    public void retireCarte(CarteLoto c){
        lst.remove(c);
    }
    public void retireCartes(){
        for (int i=0;i<this.getTaille();i++)
            this.retireCarte(this.getCarte(i));
    }
    public void initLesCartes(){
        lst = new ArrayList<CarteLoto>();
    }
    public LesCartes rechCarte(int k){
        LesCartes l = new LesCartes();
        for (int i=0;i<this.getTaille();i++)
            if (this.getCarte(i).estDans(k))
                l.ajouteCarte(this.getCarte(i));
        return l;
    }
    public String toString(){
        String s = "";
        for (int i=0;i<this.getTaille();i++)
            s += this.getCarte(i).toString();
        return s;
    }
    
    
}
