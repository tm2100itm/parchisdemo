/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.com.parchisdemo.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.com.parchisdemo.view.GUIMain;

/**
 *
 * @author ITM
 */
public class MainController implements ActionListener{
    
    private GUIMain guiMain;

    public MainController() {
        guiMain = new GUIMain(this);
        guiMain.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
       switch(e.getActionCommand()){
           case "Jugar":
               System.out.println("Presionó el botón jugar");
               break;
           case "Salir":
               System.exit(0);
               break;
           case "Instrucciones":
               System.out.println("Instrucciones");
               break;
       
       
       }
    }
    
}
