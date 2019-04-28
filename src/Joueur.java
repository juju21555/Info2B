
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;

public class Joueur {
    private String pseudo;
    private Color couleur;
    private double solde;
    private ImageIcon photo;
    private LesCartes lc;
    private ArrayList<Lot> collection;

    
    public LesCartes        getLesCartes()      { return lc;             }
    public String           getPseudo()         { return this.pseudo;    }
    public Color            getCouleur()        { return this.couleur;   }
    public double           getSolde()          { return this.solde;     }
    public ImageIcon        getPhoto()          { return this.photo;     }
    public ArrayList<Lot>   getCollection()     { return this.collection;}
    
    public void setLesCartes(LesCartes lc)  { this.lc = lc;     }
    public void setPseudo(String p)         { this.pseudo=p;    }
    public void setCouleur(Color c)         { this.couleur = c; }
    public void setPhoto(ImageIcon p)       { this.photo = p;   }
    public void setSolde(double s)          { this.solde = s;   }
    
    public Joueur(String p, Color c, ImageIcon im) {
        this.lc = new LesCartes();
        this.collection = new ArrayList<Lot>();
        this.pseudo = p;
        this.couleur= c;
        this.solde = 20;
        this.photo = im;
    }
    public Joueur() {
        this("", 
             (new Color((int) (Math.random()*255),(int) (Math.random()*255),(int) (Math.random()*255))), 
             (new ImageIcon(ImageIcon.class.getClass().getResource("/joueurDefaut.png"))) 
        );
    }
    public Joueur(String p) {
        this(p,
             (new Color((int) (Math.random()*255),(int) (Math.random()*255),(int) (Math.random()*255))),
             (new ImageIcon(ImageIcon.class.getClass().getResource("/joueurDefaut.png"))) 
        );
    }
    public Joueur(String p, Color c) {
        this(p,
             c,
             (new ImageIcon(ImageIcon.class.getClass().getResource("/joueurDefaut.png"))) 
        );
    }
    public Joueur(String p, ImageIcon im) {
        this(p,
             (new Color((int) (Math.random()*255),(int) (Math.random()*255),(int) (Math.random()*255))),
             im
        );
    }
    public boolean acheter(CarteLoto c){
        if (this.solde >= c.getPrix()){
            this.solde -= c.getPrix();
            this.ajouteCarte(c);
            return true;
        }
        return false;
    }
    
    public void ajouteCarte(CarteLoto c){
        lc.ajouteCarte(c);
    }
    
    public boolean aDesCartes(){
        return this.lc.getTaille() > 0;
    }
    
    public JPanel panelAt(int i){
        JPanel pan = null;
        if (i < lc.getTaille()){
            pan = this.lc.getCarte(i).toPanel(this.couleur);
        }
        return pan;
    }
    
    public String toString() {
        String res= "\nJoueur " + this.pseudo;
        res+= "\nSolde " + this.solde;
        res+="\nCollection de lots : ";
        for (int i=0;i<this.getCollection().size();i++)
            res+="\n"+this.getCollection().get(0).getDesc();
        return res;
    }  
}