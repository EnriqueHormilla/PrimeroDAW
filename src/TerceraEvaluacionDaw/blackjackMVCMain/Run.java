/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackMVCMain;

import BlackJackMVCControlador.Controlador;
import BlackJackMVCModelo.*;
import BlackJackMVCVista.*;

/**
 *
 * @author VESPERTINO
 */
public class Run {
    public static void main(String[] args) {
        VistaConsola v = new VistaConsola();
        
        // Instanciamos objetos del modelo
        Jugador j = new Jugador();
        Baraja b = new Baraja();
        b.barajar();
        Crupier crupier=new Crupier();
        
        Controlador c=new Controlador(b, crupier, j, v);
        
    }
    
}
