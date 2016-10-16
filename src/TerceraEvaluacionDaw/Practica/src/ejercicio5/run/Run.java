/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.run;


import ejercicio5.controlador.Controlador;
import ejercicio5.modelo.ImplementacionDAOFicheros;
import ejercicio5.vista.ImplementacionVistaConsola;
import ejercicio5.vista.ImplementacionVistaSwing;

/**
 *
 * @author VESPERTINO
 */
public class Run {
    public static void main(String[] args) {
        ImplementacionVistaConsola v=new ImplementacionVistaConsola();
        //ImplementacionVistaSwing v = new ImplementacionVistaSwing();
        ImplementacionDAOFicheros m=new ImplementacionDAOFicheros();
        Controlador con=new Controlador(v, m);
    }
    
}
