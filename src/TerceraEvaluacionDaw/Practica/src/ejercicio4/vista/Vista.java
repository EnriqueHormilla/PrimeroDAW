/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.vista;

import ejercicio4.controlador.Controlador;

/**
 *
 * @author Enrique Hormilla
 */
public interface Vista {
    public abstract void preguntarRuta();
    public abstract String getRutaFichero1();
    public abstract String getNombreFichero1();
    
    public abstract String getNombreFichero2();
    
    public abstract void activarCheck1();
    public abstract void activarCheck2();
    public abstract void activarCheck3();
    
    public abstract void setControlador(Controlador c);
    
    
}
