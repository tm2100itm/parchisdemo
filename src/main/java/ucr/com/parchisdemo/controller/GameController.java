/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.com.parchisdemo.controller;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import ucr.com.parchisdemo.model.Board;
import ucr.com.parchisdemo.model.GameArea;
import ucr.com.parchisdemo.model.Player;
import ucr.com.parchisdemo.view.BoardPanel;
import ucr.com.parchisdemo.view.ControlPanel;

import ucr.com.parchisdemo.view.GUIGame;
import ucr.com.parchisdemo.view.OptionGUI;

/**
 *
 * @author ITM
 */
public class GameController implements ActionListener, MouseListener {

    private Board board;
    private BoardPanel boardPanel;
    private ControlPanel controlPanel;
    private GUIGame guiGame;
    private GameArea gameArea;
    private Player player1;
    private Player player2;
    private OptionGUI optionGUI;
   

    public GameController() {
        guiGame = new GUIGame(this);
        boardPanel=guiGame.getBoardPanel();
        controlPanel=guiGame.getControlPanel();
        optionGUI = new OptionGUI(this);
        optionGUI.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Continuar":
                makePlayer();
                gameArea = new GameArea(player1, player2);
                board = gameArea.getBoard();
                optionGUI.setVisible(false);
                controlPanel.setJlNamePlayer1(player1.getName());
                controlPanel.setJlNamePlayer2(player2.getName());
                guiGame.setVisible(true);
                //Seleccionar jugador
                System.out.println("Presionó jugar");
                break;
            case "exit":
                System.out.println("Fin del juego");
                System.exit(0);
                break;
            case "dado":
                gameArea.setPlay();
                
                break;
        }
        boardPanel.repaint();
    }//Fin del actionPerformed

    public void makePlayer() {
        String color = optionGUI.getCbxColor();
        player1 = new Player(optionGUI.getCbxColor(), optionGUI.getTxtNamePlayer1());
        switch (color) {
            case "Rojo":
                player2 = new Player("Amarillo", optionGUI.getTxtNamePlayer2());
                break;
            case "Amarillo":
                player2 = new Player("Rojo", optionGUI.getTxtNamePlayer2());
                break;
            case "Azul":
                player2 = new Player("Verde", optionGUI.getTxtNamePlayer2());
                break;
            case "Verde":
                player2 = new Player("Azul", optionGUI.getTxtNamePlayer2());
                break;

        }
    }

    public void draw(Component c, Graphics g) {
        board.draw(c, g);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       System.out.println("x "+e.getX()+" "+" y "+e.getY());
       System.out.println(gameArea.isInHome(e.getX(), e.getY()));
       System.out.println(gameArea.getIndexPiece(e.getX(), e.getY()));
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    

}
