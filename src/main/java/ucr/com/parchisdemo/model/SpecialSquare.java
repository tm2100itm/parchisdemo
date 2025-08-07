/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.com.parchisdemo.model;

/**
 *
 * @author ITM
 */
public class SpecialSquare extends Square{
    
    private String type;

    public SpecialSquare(String type) {
        this.type = type;
    }

    public SpecialSquare(String type, Piece piece, Position position) {
        super(piece, position);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
   
    
}
