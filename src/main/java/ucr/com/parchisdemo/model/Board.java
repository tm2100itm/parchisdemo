/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.com.parchisdemo.model;

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import ucr.com.parchisdemo.model.Piece;
import ucr.com.parchisdemo.model.Position;
import ucr.com.parchisdemo.model.Home;
import ucr.com.parchisdemo.model.Square;

/**
 * Clase que maneja el tablero
 *
 * @author ITM
 */
public class Board {

    private Square[] squares;
    // private int[][]  coordenate;
    private Home homeYellow;
    private Home homeRed;
    private Home homeBlue;
    private Home homeGreen;
    private Position[] positions;

    public Board(String color1, String color2) {
        squares = new Square[68];
        positions = new Position[68];
        homeYellow = new Home(color1);
        homeRed = new Home(color2);
        homeBlue = new Home("Azul");
        homeGreen = new Home("Verde");
        setPositions();
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

        for (int index = 0; index < homeYellow.getLength(); index++) {
            if (homeYellow != null) {
                homeYellow.getPiece(index).draw(c, g);
                homeRed.getPiece(index).draw(c, g);
                homeBlue.getPiece(index).draw(c, g);
                homeGreen.getPiece(index).draw(c, g);
            }
        }

    }//Fin del método draw

    public void setPositions() {
        int coordenateX = 360;
        int coordenateY = 590;

        for (int element = 0; element < 8; element++) {
            System.out.println(element);
            System.out.println(coordenateY);
            positions[element] = new Position(coordenateX, coordenateY);
            squares[element] = new Square(positions[element]);
            squares[element].setPiece(new Piece(positions[element], new ImageIcon("./src/main/resources/img/pieceyellow.png")));
            coordenateY -= 30;
        }

        coordenateX = 380;
        coordenateY = 360;
        for (int element = 8; element < 16; element++) {
            positions[element] = new Position(coordenateX, coordenateY);
            squares[element] = new Square(positions[element]);
            squares[element].setPiece(new Piece(positions[element], new ImageIcon("./src/main/resources/img/pieceyellow.png")));
            coordenateX += 30;

        }
        //position 16 Solo tiene la coordenada
        coordenateX = 590;
        coordenateY = 300;
        positions[16] = new Position(coordenateX, coordenateY);
        squares[16] = new SpecialSquare("Avanza Azul", positions[16]);
        squares[16].setPiece(new Piece(positions[16], new ImageIcon("./src/main/resources/img/piecered.png")));

        coordenateX = 590;
        coordenateY = 225;
        for (int element = 17; element < 25; element++) {
            positions[element] = new Position(coordenateX, coordenateY);
            squares[element] = new Square(positions[element]);
            squares[element].setPiece(new Piece(positions[element], new ImageIcon("./src/main/resources/img/pieceyellow.png")));
            coordenateX -= 30;
            System.out.println(coordenateX);
        }
        coordenateX = 360;
        coordenateY = 215;
        for (int element = 25; element < 33; element++) {
            positions[element] = new Position(coordenateX, coordenateY);
            squares[element] = new Square(positions[element]);
            squares[element].setPiece(new Piece(positions[element], new ImageIcon("./src/main/resources/img/pieceyellow.png")));
            coordenateY -= 30;
            System.out.println(coordenateY);
        }
        coordenateX = 290;
        coordenateY = 5;
        positions[33] = new Position(coordenateX, coordenateY);
        squares[33] = new SpecialSquare("Avanza Rojo", positions[33]);
        squares[33].setPiece(new Piece(positions[33], new ImageIcon("./src/main/resources/img/pieceblack.png")));

        coordenateX = 225;
        coordenateY = 5;
        for (int element = 34; element < 42; element++) {
            positions[element] = new Position(coordenateX, coordenateY);
            squares[element] = new Square(positions[element]);
            squares[element].setPiece(new Piece(positions[element], new ImageIcon("./src/main/resources/img/pieceyellow.png")));
            coordenateY += 30;
            System.out.println(coordenateY);
        }

        coordenateX = 215;
        coordenateY = 225;
        for (int element = 42; element < 50; element++) {
            positions[element] = new Position(coordenateX, coordenateY);
            squares[element] = new Square(positions[element]);
            squares[element].setPiece(new Piece(positions[element], new ImageIcon("./src/main/resources/img/pieceyellow.png")));
            coordenateX -= 30;
            System.out.println(coordenateX);
        }
        //position 50 Solo tiene la coordenada
        coordenateX = 5;
        coordenateY = 300;
        positions[50] = new Position(coordenateX, coordenateY);
        squares[50] = new SpecialSquare("Avanza Verde", positions[50]);
        squares[50].setPiece(new Piece(positions[50], new ImageIcon("./src/main/resources/img/pieceblue.png")));

        coordenateX = 5;
        coordenateY = 360;
        for (int element = 51; element < 59; element++) {
            positions[element] = new Position(coordenateX, coordenateY);
            squares[element] = new Square(positions[element]);
            squares[element].setPiece(new Piece(positions[element], new ImageIcon("./src/main/resources/img/pieceyellow.png")));
            coordenateX += 30;
            System.out.println(coordenateX);
        }
        coordenateX = 230;
        coordenateY = 380;
        for (int element = 59; element < 67; element++) {
            positions[element] = new Position(coordenateX, coordenateY);
            squares[element] = new Square(positions[element]);
            squares[element].setPiece(new Piece(positions[element], new ImageIcon("./src/main/resources/img/pieceyellow.png")));
            coordenateY += 30;
            System.out.println(coordenateY);
        }

        //posición 68
        coordenateX = 290;
        coordenateY = 590;
        positions[67] = new Position(coordenateX, coordenateY);
        squares[67] = new SpecialSquare("Avanza Amarillo", positions[67]);
        squares[67].setPiece(new Piece(positions[67], new ImageIcon("./src/main/resources/img/pieceblack.png")));

    }

    public void setQuadrant1() {
        //Amarillo
        homeYellow.setPiece(0, new Piece(new Position(480, 450), new ImageIcon("./src/main/resources/img/pieceyellow.png")));
        homeYellow.setPiece(1, new Piece(new Position(520, 450), new ImageIcon("./src/main/resources/img/pieceyellow.png")));
        homeYellow.setPiece(2, new Piece(new Position(480, 550), new ImageIcon("./src/main/resources/img/pieceyellow.png")));
        homeYellow.setPiece(3, new Piece(new Position(520, 550), new ImageIcon("./src/main/resources/img/pieceyellow.png")));
        //Rojo
        homeRed.setPiece(0, new Piece(new Position(80, 50), new ImageIcon("./src/main/resources/img/piecered.png")));
        homeRed.setPiece(1, new Piece(new Position(120, 50), new ImageIcon("./src/main/resources/img/piecered.png")));
        homeRed.setPiece(2, new Piece(new Position(80, 150), new ImageIcon("./src/main/resources/img/piecered.png")));
        homeRed.setPiece(3, new Piece(new Position(120, 150), new ImageIcon("./src/main/resources/img/piecered.png")));

        //Green
        homeGreen.setPiece(0, new Piece(new Position(480, 50), new ImageIcon("./src/main/resources/img/piecegreen.png")));
        homeGreen.setPiece(1, new Piece(new Position(520, 50), new ImageIcon("./src/main/resources/img/piecegreen.png")));
        homeGreen.setPiece(2, new Piece(new Position(480, 150), new ImageIcon("./src/main/resources/img/piecegreen.png")));
        homeGreen.setPiece(3, new Piece(new Position(520, 150), new ImageIcon("./src/main/resources/img/piecegreen.png")));
        //Blue 
        homeBlue.setPiece(0, new Piece(new Position(80, 450), new ImageIcon("./src/main/resources/img/pieceblue.png")));
        homeBlue.setPiece(1, new Piece(new Position(120, 450), new ImageIcon("./src/main/resources/img/pieceblue.png")));
        homeBlue.setPiece(2, new Piece(new Position(80, 550), new ImageIcon("./src/main/resources/img/pieceblue.png")));
        homeBlue.setPiece(3, new Piece(new Position(120, 550), new ImageIcon("./src/main/resources/img/pieceblue.png")));

    }

    public void start() {
        setQuadrant1();
    }

}
