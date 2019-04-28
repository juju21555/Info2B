import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Justin
 */
public class Lot {
    
    private String description;
    private int niveau;
    private boolean bon;
    private ImageIcon icon;
    
    public Lot(String d, int n, boolean b,ImageIcon i){
        this.description = d;
        this.niveau      = n;
        this.bon         = b;
        this.icon        = i;
    }
    public Lot(String d, int n, boolean b){
        this(d,n,b,null);
    }
    
    public String getDesc(){ return this.description;}
    public ImageIcon getIcon() { return this.icon;}
        
}
