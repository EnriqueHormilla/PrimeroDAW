/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.controlador;

import ejercicio5.modelo.InterfazDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ejercicio5.vista.InterfazVista;

/**
 *
 * @author VESPERTINO
 */
public class Controlador implements ActionListener{
    private InterfazVista v;
    private InterfazDAO m;

    public Controlador(InterfazVista v, InterfazDAO m) {
        this.v = v;
        this.m = m;
        v.setControlador(this);
        v.iniciarVista();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand()=="Ejecutar"){
            char carh1=v.caracter();
            int num=v.numeroDeLinea();
            int numeroCaracteres=m.consultarConCaracter(carh1,num);
            int numeroDePalabras=m.consultarCantidadPalabras(num);
            v.totalCaracterCaja(numeroCaracteres);
            v.totalPalabraCaja(numeroDePalabras);
            
        }
    }
    
}
