/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author sisir
 */

public class Imagen extends javax.swing.JPanel {
    
    int x, y;

    public Imagen(JPanel jPanel1) {
        this.x = jPanel1.getWidth();
        this.y = jPanel1.getHeight();
        this.setSize(x, y);
    }

    @Override
    public void paint(Graphics graf) {
        ImageIcon Img = new ImageIcon(getClass().getResource("/Imagenes/Logo.png"));
        graf.drawImage(Img.getImage(), 0, 0, x, y, null);
    }    

}

