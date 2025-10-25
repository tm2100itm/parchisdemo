/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.com.parchisdemo.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.com.parchisdemo.model.Player;
import ucr.com.parchisdemo.view.GUIIntrucciones;
import ucr.com.parchisdemo.view.GUIMain;

/**
 *
 * @author ITM
 */
public class MainController implements ActionListener {

    private GUIMain guiMain;
    private GUIIntrucciones guiInstrucciones;
    private Player player1;
    private Player player2;
    private GameController gameController;
    private AudioController audio;

    public MainController() {
        guiMain = new GUIMain(this);
        guiInstrucciones = new GUIIntrucciones();
        audio = new AudioController();
        guiMain.setResizable(false);
        guiMain.setLocationRelativeTo(guiMain);
        guiMain.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Jugar":
                guiMain.setVisible(false);
                gameController = new GameController();
                System.out.println("Presionó el botón jugar");
                break;
            case "Salir":
                System.exit(0);
                break;
            case "Instrucciones":
                guiInstrucciones.setResizable(false);
                guiInstrucciones.setLocationRelativeTo(guiMain);
                guiInstrucciones.setVisible(true);
                break;
            case "Sonido":
               this.audio.iniciarMusica("/img/audio.wav");
                if((audio.principalSonido != null) && (audio.isEjecutandose() == false)){
                    audio.principalSonido.stop();
                    audio.setEjecutandose(true);
                }else{
                    audio.setEjecutandose(false);
                }
                break;
           

        }
    }//Fin del método actionPerformed

    

}
