/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.run;

import ejercicio4.controlador.Controlador;
import ejercicio4.modelo.Modelo;
import ejercicio4.vista.VistaSwing;

/**
 *
 * @author Enrique Hormilla
 */
public class Run {
    public static void main(String[] args) {
        VistaSwing v=new VistaSwing();
        Modelo m=new Modelo();
        Controlador a=new Controlador(v, m);
       
    }
    
}
