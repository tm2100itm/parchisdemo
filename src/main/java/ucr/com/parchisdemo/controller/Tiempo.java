/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.com.parchisdemo.controller;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Yuliana
 */
public class Tiempo {
    private int tiempoRestante = 5;
    private Timer timer;
    
    public Tiempo(){
    }
    
    public JLabel iniciarTimer(JLabel txtTimer){
        System.out.println("entro al time");
        timer = new Timer(2000, e-> {
            System.out.println("entro al time 2");
           tiempoRestante--;
           txtTimer.setText(""+tiempoRestante);
           if(tiempoRestante<=0){
               System.out.println("entro al time3");
               timer.stop();
               JOptionPane.showMessageDialog(null, "Tiempo agotado!");
               txtTimer.setText(""+tiempoRestante);
               return;
           }
        });
        timer.start();
        reiniciarTime();
        return txtTimer;
    }
    
    public void reiniciarTime(){
        tiempoRestante=5;
    }
}
