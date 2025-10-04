/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.com.parchisdemo.model;

/**
 *
 * @author ITM
 */
public class GameArea {
    private Board board;
    private Player player1;
    private Player player2;

    public GameArea() {
        board= new Board();
    }

    public Board getBoard() {
        return board;
    }
    
    
    
}
