/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema12.MVCpatronMain;

import tema12.MVCpatronControlador.CalculadoraControlador;
import tema12.MVCpatronModelo.Modelo;
import tema12.MVCpatronVista.*;

/**
 *
 * @author VESPERTINO
 */
public class main {
    public static void main(String[] args) {
        VistaSwing v=new VistaSwing();
        Modelo m=new Modelo();
        CalculadoraControlador c=new CalculadoraControlador(v, m);        
    }
}
