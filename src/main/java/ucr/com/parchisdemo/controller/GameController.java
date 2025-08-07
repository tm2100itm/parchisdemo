/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.com.parchisdemo.controller;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.com.parchisdemo.model.Board;
import ucr.com.parchisdemo.view.GUIGame;

/**
 *
 * @author ITM
 */
public class GameController implements ActionListener{
    private Board board;
    private GUIGame guiGame;

    public GameController() {
        guiGame=new GUIGame(this);
        board = new Board();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {


    }
    
    public void draw(Graphics g){
      board.draw(g);
    }
    
}
