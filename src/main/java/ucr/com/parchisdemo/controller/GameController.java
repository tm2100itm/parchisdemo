/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.com.parchisdemo.controller;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.com.parchisdemo.model.Board;
import ucr.com.parchisdemo.model.GameArea;

import ucr.com.parchisdemo.view.GUIGame;

/**
 *
 * @author ITM
 */
public class GameController implements ActionListener{
    private Board board;
    private GUIGame guiGame;
    private GameArea gameArea;

    public GameController() {
        guiGame=new GUIGame(this);
        gameArea= new GameArea();
        board = gameArea.getBoard();
        guiGame.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    switch(e.getActionCommand()){
        case "playGame":
            String color=guiGame.getMessage("Escoja su color");
            //Seleccionar jugador
            System.out.println("Presionó jugar");
            break;
        case "exit":
            System.out.println("Fin del juego");
            System.exit(0);
            break;
    
    }

    }
    
    public void draw(Component c,Graphics g){
      board.draw(c,g);
    }
    
}
