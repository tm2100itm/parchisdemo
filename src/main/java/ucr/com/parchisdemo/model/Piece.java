/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.com.parchisdemo.model;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author ITM
 */
public class Piece {
   private Position position;
    private String direction;
    private ImageIcon image;

    public Piece() {
        
    }

    
    public Piece(Position position, String direction, ImageIcon image) {
        this.position=position;
        this.direction = direction;
        this.image = image;
    }
    
    public void draw(Graphics g){
    image.paintIcon(null, g, position.getX(), position.getY());
    }
    
}
