/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.com.parchisdemo.model;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 * Clase que maneja el tablero
 *
 * @author ITM
 */
public class Board {

    private Square[] squares;

    public Board() {
        squares = new Square[68];
        start();
    }

    /**
     * Método encargado de dibujar una figura
     *
     * @param g Es el objeto gráfico
 *
     */
    public void draw(Component c, Graphics g) {
        for (int element = 0; element < squares.length; element++) {
            if (squares[element] != null) {
                if (squares[element].getPiece() != null) {
                    squares[element].getPiece().draw(c, g);
                }
            }
        }

    }

    public void start() {
        int coordenateX = 360;
        int coordenateY = 620;
        for (int element = 0; element < 4; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered.png")));
            coordenateY -= 30;
        }
        squares[4] = new SpecialSquare("salida amarilla", null, new Position(coordenateX, coordenateY));
        squares[4].setPiece(new Piece(squares[4].getPosition(), "left", new ImageIcon("./src/main/resources/img/pieceyellow.png")));
        coordenateY -= 30;

        for (int element = 5; element < 8; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/pieceblue.png")));
            coordenateY -= 40;
        }
        coordenateY+=15;
        coordenateX = 390;
        for (int element = 8; element <= 10; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered.png")));
            coordenateX += 25;
        }
        coordenateX+=10;
        squares[11] = new SpecialSquare("descanso", null, new Position(coordenateX, coordenateY));
        squares[11].setPiece(new Piece(squares[11].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecegreen.png")));
        coordenateX += 30;

        for (int element = 12; element <= 15; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered.png")));
            coordenateX += 30;
        }
        coordenateX -= 30;
        coordenateY -= 70;
        squares[16] = new SpecialSquare("avanza azul", null, new Position(coordenateX, coordenateY));
        squares[16].setPiece(new Piece(squares[16].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecegreen.png")));
        //coordenateY += 30;
        coordenateY -= 70;
        for (int element = 17; element <= 20; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered.png")));
            coordenateX -= 30;
        }
        squares[21] = new SpecialSquare("salida azul", null, new Position(coordenateX, coordenateY));
        squares[21].setPiece(new Piece(squares[21].getPosition(), "left", new ImageIcon("./src/main/resources/img/pieceblue.png")));
        coordenateX -= 10;
        for (int element = 22; element <= 24; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered.png")));
            coordenateX -= 30;
        }
        coordenateX -= 10;
        coordenateY -= 18;

        for (int element = 25; element <= 27; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered.png")));
            coordenateY -= 30;
        }
        squares[28] = new SpecialSquare("descanso", null, new Position(coordenateX, coordenateY));
        squares[28].setPiece(new Piece(squares[28].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecegreen.png")));
        coordenateY -= 30;

        for (int element = 29; element < 33; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered.png")));
            coordenateY -= 30;
        }
        coordenateY += 30;
        coordenateX -= 60;
        squares[33] = new SpecialSquare("avanza rojo", null, new Position(coordenateX, coordenateY));
        squares[33].setPiece(new Piece(squares[33].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecegreen.png")));
        coordenateX -= 70;
        for (int element = 34; element < 38; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered.png")));
            coordenateY += 30;
        }

        squares[38] = new SpecialSquare("salida roja", null, new Position(coordenateX, coordenateY));
        squares[38].setPiece(new Piece(squares[38].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered1.png")));

        coordenateY += 30;
        for (int element = 39; element < 42; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered.png")));
            coordenateY += 30;
        }

        coordenateY -= 15;
        coordenateX -= 30;
        for (int element = 42; element < 45; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered.png")));
            coordenateX -= 30;

        }
       // coordenateY -= 1;
        squares[45] = new SpecialSquare("descanso", null, new Position(coordenateX, coordenateY));
        squares[45].setPiece(new Piece(squares[45].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecegreen.png")));
        coordenateX -= 30;

        for (int element = 46; element < 50; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered.png")));
            coordenateX -= 30;

        }
        coordenateX += 30;
        coordenateY += 60;
        squares[50] = new SpecialSquare("avanza verde", null, new Position(coordenateX, coordenateY));
        squares[50].setPiece(new Piece(squares[50].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecegreen.png")));
        coordenateY += 90;

        for (int element = 51; element < 55; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered.png")));
            coordenateX += 30;

        }

        squares[55] = new SpecialSquare("salida verde", null, new Position(coordenateX, coordenateY));
        squares[55].setPiece(new Piece(squares[55].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecegreen1.png")));

        coordenateX += 30;
        for (int element = 56; element < 59; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered.png")));
            coordenateX += 30;
        }
        coordenateY += 15;
        for (int element = 59; element < 62; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered.png")));
            coordenateY += 25;
        }

        squares[62] = new SpecialSquare("descanso", null, new Position(coordenateX, coordenateY));
        squares[62].setPiece(new Piece(squares[62].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecegreen.png")));
        coordenateY += 30;

        for (int element = 63; element < 67; element++) {
            squares[element] = new Square(null, new Position(coordenateX, coordenateY));
            squares[element].setPiece(new Piece(squares[element].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecered.png")));
            coordenateY += 30;
        }
        coordenateX += 70;
        coordenateY -= 30;
        squares[67] = new SpecialSquare("avanza amarillo", null, new Position(coordenateX, coordenateY));
        squares[67].setPiece(new Piece(squares[67].getPosition(), "left", new ImageIcon("./src/main/resources/img/piecegreen.png")));

    }

}
