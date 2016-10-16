/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.vista;

import ejercicio5.controlador.Controlador;

/**
 *
 * @author VESPERTINO
 */
public interface InterfazVista {
    
    public char caracter();
    public int numeroDeLinea();
    public void totalCaracterCaja(int caracterCaja);
    public void totalPalabraCaja(int palabraCaja);
    public void iniciarVista();
    public void setControlador(Controlador c);
   
}
