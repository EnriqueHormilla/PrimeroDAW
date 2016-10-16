/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema12.MVCpatronControlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tema12.MVCpatronModelo.Modelo;
import tema12.MVCpatronVista.InterfazVistas;

/**
 *
 * @author VESPERTINO
 */
public class CalculadoraControlador implements ActionListener{
    private InterfazVistas v;
    private Modelo m;

    public CalculadoraControlador(InterfazVistas a, Modelo m) {
        this.v = a;
        this.m = m;
        this.v.setControlador(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getID()==1) {                        
           int a= m.calcular(v.getOperando1(),v.getOperador(),v.getOperando2());            
           v.setResultado(""+a);
        } else { // Salir
            v.salir();
        }
        
    }
    
}
