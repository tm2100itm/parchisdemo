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
    private int turno = 1;

    public GameArea(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        makeHome();
    }

    public void makeHome() {
        String color = player1.getColor();
        ImageIcon pieceRed = new ImageIcon("./src/main/resources/img/piecered.png");
        ImageIcon pieceYellow = new ImageIcon("./src/main/resources/img/pieceyellow.png");
        ImageIcon pieceBlue = new ImageIcon("./src/main/resources/img/pieceblue.png");
        ImageIcon pieceGreen = new ImageIcon("./src/main/resources/img/piecegreen.png");
        switch (color) {

            case "Rojo":
                homePlayer1 = new Home("Rojo", 38);
                homePlayer1.setPiece(0, new Piece(new Position(49, 54), pieceRed));
                homePlayer1.setPiece(1, new Piece(new Position(120, 54), pieceRed));
                homePlayer1.setPiece(2, new Piece(new Position(49, 130), pieceRed));
                homePlayer1.setPiece(3, new Piece(new Position(120, 130), pieceRed));

                homePlayer2 = new Home("Amarillo", 4);
                homePlayer2.setPiece(0, new Piece(new Position(452, 464), pieceYellow));
                homePlayer2.setPiece(1, new Piece(new Position(545, 464), pieceYellow));
                homePlayer2.setPiece(2, new Piece(new Position(452, 550), pieceYellow));
                homePlayer2.setPiece(3, new Piece(new Position(545, 550), pieceYellow));
                break;
            case "Amarillo":
                homePlayer1 = new Home("Amarillo", 4);
                homePlayer1.setPiece(0, new Piece(new Position(452, 464), pieceYellow));
                homePlayer1.setPiece(1, new Piece(new Position(545, 464), pieceYellow));
                homePlayer1.setPiece(2, new Piece(new Position(452, 550), pieceYellow));
                homePlayer1.setPiece(3, new Piece(new Position(545, 550), pieceYellow));

                homePlayer2 = new Home("Rojo", 38);
                homePlayer2.setPiece(0, new Piece(new Position(49, 54), pieceRed));
                homePlayer2.setPiece(1, new Piece(new Position(120, 54), pieceRed));
                homePlayer2.setPiece(2, new Piece(new Position(49, 130), pieceRed));
                homePlayer2.setPiece(3, new Piece(new Position(120, 130), pieceRed));
                break;
            case "Azul":
                homePlayer1 = new Home("Azul", 21);
                homePlayer1.setPiece(0, new Piece(new Position(452, 51), pieceBlue));
                homePlayer1.setPiece(1, new Piece(new Position(545, 51), pieceBlue));
                homePlayer1.setPiece(2, new Piece(new Position(452, 130), pieceBlue));
                homePlayer1.setPiece(3, new Piece(new Position(545, 130), pieceBlue));

                homePlayer2 = new Home("Verde", 56);

                homePlayer2.setPiece(0, new Piece(new Position(49, 464), pieceGreen));
                homePlayer2.setPiece(1, new Piece(new Position(120, 464), pieceGreen));
                homePlayer2.setPiece(2, new Piece(new Position(49, 550), pieceGreen));
                homePlayer2.setPiece(3, new Piece(new Position(120, 550), pieceGreen));
                break;
            case "Verde":
                homePlayer1 = new Home("Verde", 56);
                homePlayer1.setPiece(0, new Piece(new Position(49, 464), pieceGreen));
                homePlayer1.setPiece(1, new Piece(new Position(120, 464), pieceGreen));
                homePlayer1.setPiece(2, new Piece(new Position(49, 550), pieceGreen));
                homePlayer1.setPiece(3, new Piece(new Position(120, 550), pieceGreen));

                homePlayer2 = new Home("Azul", 21);
                homePlayer2.setPiece(0, new Piece(new Position(452, 51), pieceBlue));
                homePlayer2.setPiece(1, new Piece(new Position(545, 51), pieceBlue));
                homePlayer2.setPiece(2, new Piece(new Position(452, 130), pieceBlue));
                homePlayer2.setPiece(3, new Piece(new Position(545, 130), pieceBlue));
                break;

        }
        player1.setHome(homePlayer1);
        player2.setHome(homePlayer2);
        board = new Board(homePlayer1, homePlayer2);
    }

    public Board getBoard() {
        return board;
    }

    public void setPlay(int numDado, Position posicion) {
        Piece piece = null;
        System.out.println(numDado);
        // piece = board.getPiece(posicion, turno);
        //numDado=5;
        if (turno == 1) {
            if (homePlayer1.isInHome(posicion.getX(), posicion.getY())) {
                if (numDado == 5) {
                    board.exit(homePlayer1.getColor());
                } else {
                    //hacer el movimiento de la jugada

                }

            }

            turno = 2;
        } else {
//            board.exit(homePlayer1.getColor(), posicion);
            if (homePlayer2.isInHome(posicion.getX(), posicion.getY())) {
                if (numDado == 5) {
                    board.exit(homePlayer1.getColor());
                } else {
                    //hacer el movimiento de la jugada

                }
                turno = 1;
            }
        }
    }

    public boolean isInHomePlayer(int x, int y) {
        boolean found = false;
        if (homePlayer1.isInHome(x, y)) {
            return true;
        }
        if (homePlayer2.isInHome(x, y)) {
            return true;
        }
        if (board.isInBoard(x, y)) {
            return true;
        }
        return false;

    }

    public int getIndexPiece(int x, int y) {
        if (homePlayer1.getIndexPiece(x, y) != -1) {
            return homePlayer1.getIndexPiece(x, y);
        }
        if (homePlayer2.getIndexPiece(x, y) != -1) {
            return homePlayer2.getIndexPiece(x, y);
        }
        if (board.getIndexPiece(x, y) != -1) {
            return board.getIndexPiece(x, y);
        }
        return -1;
    }

}
