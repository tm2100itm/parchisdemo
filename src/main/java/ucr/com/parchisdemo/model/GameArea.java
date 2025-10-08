/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.com.parchisdemo.model;

import javax.swing.ImageIcon;

/**
 *
 * @author ITM
 */
public class GameArea {

    private Board board;
    private Player player1;
    private Player player2;
    private Home homePlayer1;
    private Home homePlayer2;
     private int turno=1;

    public GameArea(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        makeHome();
    }

    public void makeHome() {
        String color = player1.getColor();

        switch (color) {
            case "Rojo":
                homePlayer1=new Home("Rojo");
                homePlayer1.setPiece(0, new Piece(new Position(49, 54), new ImageIcon("./src/main/resources/img/piecered.png")));
                homePlayer1.setPiece(1, new Piece(new Position(120, 54), new ImageIcon("./src/main/resources/img/piecered.png")));
                homePlayer1.setPiece(2, new Piece(new Position(49, 130), new ImageIcon("./src/main/resources/img/piecered.png")));
                homePlayer1.setPiece(3, new Piece(new Position(120, 130), new ImageIcon("./src/main/resources/img/piecered.png")));

                homePlayer2=new Home("Amarillo");
                homePlayer2.setPiece(0, new Piece(new Position(452, 464), new ImageIcon("./src/main/resources/img/pieceyellow.png")));
                homePlayer2.setPiece(1, new Piece(new Position(545, 464), new ImageIcon("./src/main/resources/img/pieceyellow.png")));
                homePlayer2.setPiece(2, new Piece(new Position(452, 550), new ImageIcon("./src/main/resources/img/pieceyellow.png")));
                homePlayer2.setPiece(3, new Piece(new Position(545, 550), new ImageIcon("./src/main/resources/img/pieceyellow.png")));
                break;
            case "Amarillo":
                homePlayer1=new Home("Amarillo");
                homePlayer1.setPiece(0, new Piece(new Position(452, 464), new ImageIcon("./src/main/resources/img/pieceyellow.png")));
                homePlayer1.setPiece(1, new Piece(new Position(545, 464), new ImageIcon("./src/main/resources/img/pieceyellow.png")));
                homePlayer1.setPiece(2, new Piece(new Position(452, 550), new ImageIcon("./src/main/resources/img/pieceyellow.png")));
                homePlayer1.setPiece(3, new Piece(new Position(545, 550), new ImageIcon("./src/main/resources/img/pieceyellow.png")));

                homePlayer2=new Home("Rojo");
                homePlayer2.setPiece(0, new Piece(new Position(49, 54), new ImageIcon("./src/main/resources/img/piecered.png")));
                homePlayer2.setPiece(1, new Piece(new Position(120, 54), new ImageIcon("./src/main/resources/img/piecered.png")));
                homePlayer2.setPiece(2, new Piece(new Position(49, 130), new ImageIcon("./src/main/resources/img/piecered.png")));
                homePlayer2.setPiece(3, new Piece(new Position(120, 130), new ImageIcon("./src/main/resources/img/piecered.png")));
                break;
            case "Azul":
                homePlayer1=new Home("Azul");
                homePlayer1.setPiece(0, new Piece(new Position(452, 51), new ImageIcon("./src/main/resources/img/pieceblue.png")));
                homePlayer1.setPiece(1, new Piece(new Position(545, 51), new ImageIcon("./src/main/resources/img/pieceblue.png")));
                homePlayer1.setPiece(2, new Piece(new Position(452, 130), new ImageIcon("./src/main/resources/img/pieceblue.png")));
                homePlayer1.setPiece(3, new Piece(new Position(545, 130), new ImageIcon("./src/main/resources/img/pieceblue.png")));

                homePlayer2=new Home("Verde");
                
                homePlayer2.setPiece(0, new Piece(new Position(49, 464), new ImageIcon("./src/main/resources/img/piecegreen.png")));
                homePlayer2.setPiece(1, new Piece(new Position(120, 464), new ImageIcon("./src/main/resources/img/piecegreen.png")));
                homePlayer2.setPiece(2, new Piece(new Position(49, 550), new ImageIcon("./src/main/resources/img/piecegreen.png")));
                homePlayer2.setPiece(3, new Piece(new Position(120, 550), new ImageIcon("./src/main/resources/img/piecegreen.png")));
                break;
            case "Verde":
                homePlayer1=new Home("Verde");
                 homePlayer1.setPiece(0, new Piece(new Position(49, 464), new ImageIcon("./src/main/resources/img/piecegreen.png")));
                homePlayer1.setPiece(1, new Piece(new Position(120, 464), new ImageIcon("./src/main/resources/img/piecegreen.png")));
                homePlayer1.setPiece(2, new Piece(new Position(49, 550), new ImageIcon("./src/main/resources/img/piecegreen.png")));
                homePlayer1.setPiece(3, new Piece(new Position(120, 550), new ImageIcon("./src/main/resources/img/piecegreen.png")));

                homePlayer2=new Home("Azul");
                homePlayer2.setPiece(0, new Piece(new Position(452, 51), new ImageIcon("./src/main/resources/img/pieceblue.png")));
                homePlayer2.setPiece(1, new Piece(new Position(545, 51), new ImageIcon("./src/main/resources/img/pieceblue.png")));
                homePlayer2.setPiece(2, new Piece(new Position(452, 130), new ImageIcon("./src/main/resources/img/pieceblue.png")));
                homePlayer2.setPiece(3, new Piece(new Position(545, 130), new ImageIcon("./src/main/resources/img/pieceblue.png")));
                break;

        }
       player1.setHome(homePlayer1);
       player2.setHome(homePlayer2);
       board = new Board(homePlayer1,homePlayer2);
    }

    public Board getBoard() {
        return board;
    }
    
    public void setPlay(){
        int numDado=(int)(Math.random()*6+1);
        System.out.println(numDado);
        numDado=5;
       if(turno==1){
           if(numDado==5){
                board.exit(homePlayer1.getColor());
           }
           turno=2;
       }
       else{
       
           turno=1;
       }
    }

}
