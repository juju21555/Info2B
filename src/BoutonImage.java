
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
public class BoutonImage extends JButton{
    
    private Image im;
    
    public BoutonImage(){
        super();
        im = null;
    }
    
    public void setImage(Image im){
        this.im = im;
    }
    
    @Override
    public void paint(Graphics g){
        
    }
}
