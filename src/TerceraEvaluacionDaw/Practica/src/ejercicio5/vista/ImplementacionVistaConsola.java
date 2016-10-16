/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.vista;

import ejercicio5.controlador.Controlador;
import java.awt.event.ActionEvent;
import java.util.Scanner;

/**
 *
 * @author VESPERTINO
 */
public class ImplementacionVistaConsola implements InterfazVista{
    private Controlador controlador;
    private char caracter;
    private int numero;
    
    public ImplementacionVistaConsola() {
        
    }

    @Override
    public char caracter() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime el caracter");
        caracter = sc.nextLine().charAt(0);
        return  caracter;
    }

    @Override
    public int numeroDeLinea() {
         Scanner sc=new Scanner(System.in);
        System.out.println("Dime cuantas lineas");
        numero=sc.nextInt();   
        return numero;
        
    }

    @Override
    public void totalCaracterCaja(int caracterCaja) {
        System.out.println("El tota d ecaracteres es -->"+caracterCaja);
    }

    @Override
    public void totalPalabraCaja(int palabraCaja) {
       System.out.println("La spalabras en esas lineas -->"+palabraCaja);
    }

    @Override
    public void setControlador(Controlador c) {
        this.controlador = c;       
    }

    @Override
    public void iniciarVista() {
        controlador.actionPerformed(new ActionEvent(this, 1, "Ejecutar"));
    }
    
    
}
