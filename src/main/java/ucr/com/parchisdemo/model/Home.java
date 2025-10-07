/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.com.parchisdemo.model;

import ucr.com.parchisdemo.model.Piece;
import ucr.com.parchisdemo.model.Position;

/**
 *
 * @author ITM
 */
public class Home {
    private String color;
    private Piece[] pieces;

    public Home(String color) {
        this.color = color;
        pieces= new Piece[4];
    }
    
    public void setPiece(int index,Piece piece){
          pieces[index]=piece;
    
    }
    
    public Piece getPiece(int index){
      return pieces[index];
    }
    
   public int getLength(){
      return pieces.length;
   } 
    
    
}
