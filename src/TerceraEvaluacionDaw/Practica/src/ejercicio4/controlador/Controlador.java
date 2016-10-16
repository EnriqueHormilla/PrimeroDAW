/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.controlador;

import ejercicio4.modelo.Modelo;
import ejercicio4.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

/**
 *
 * @author Enrique Hormilla
 */
public class Controlador implements ActionListener {

    private Vista v;
    private Modelo m;
    //private HashSet<Integer> coleccion;

    public Controlador(Vista v, Modelo m) {
        this.v = v;
        this.m = m;
        v.setControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand() == "go") {
            m.inicializarModelo(v.getRutaFichero1(), v.getNombreFichero1(), v.getNombreFichero2());
            if (m.filtradoNumeros()) {
                v.activarCheck1();
            }
            if (m.filtraColecion()) {
                v.activarCheck2();
            }
            if (m.rellenaDestino()) {
                v.activarCheck3();
            }
        } else {
            v.preguntarRuta();
        }

    }

}
