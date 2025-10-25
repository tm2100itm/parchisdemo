/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.com.parchisdemo.controller;


import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Yuliana
 */
public class AudioController {
    public Clip principalSonido = null;
    public boolean ejecutandose = true;
    
    public AudioController(){
    }
    
    public void iniciarMusica(String nombreSonido){ //Entra un parametro que será la ruta del audio
        try{ //Este evalua diferentes excepcione que podrían haber
            if(ejecutandose){
                URL url = getClass().getResource(nombreSonido); //getClass() = clase actual,  getResource(nombreSonido)= busca un archivo de resources

                if(url == null){
                    throw new IOException("No se encontro el audio "+nombreSonido);
                }
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(url);/*AudioSystem = Maneja todo lo relacionado con audios (reproducir, 
                                                                                           grabaciones,cargar audios,etc) y getAudioInputStream(url)=lee el 
                                                                                           archivo y verifica si es compatible */
                principalSonido = AudioSystem.getClip();
                principalSonido.open(audioInputStream);
                principalSonido.loop(10);/* inicia la reproducción en bucle desde la posición actual, en este caso el audio se reproduce la primera vez y 
                                          10 veces más (luego se detiene).*/
                principalSonido.start();
            }
        }catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex){ /* Evalua formato (siempre debe de ser .wav)/problemas con el archivo (archivos dañados
                                                                                              no existe, rutas incorrectas, etc)/Si hay más de un audio reproduciendose*/
            // Si se desea saber cual es la exepción exacta usar: ex.printStackTrace(); 
            System.out.print("Error al reproducir el sonido");
        }
    }
    
    //retorna si se esta ejecutando
    public boolean isEjecutandose(){
        return ejecutandose;
    }
    
    //cambia el estado/ valor de la variable ejecutandose
    public void setEjecutandose(boolean ejecutandose){
        this.ejecutandose = ejecutandose;
    }
}
