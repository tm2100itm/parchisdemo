/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.com.parchisdemo.model;

import java.awt.Color;

/**
 *
 * @author ITM
 */
public class Player {
    private String color;
    private String name;
    private Home home;
    private int score;

    public Player(String color, String name) {
        this.color = color;
        this.name = name;
        score=5;
    }
    
    

    public Player(String color,String name, Home home) {
        this.color = color;
        this.name=name;
        this.home = home;
        score=5;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
    
   
}
