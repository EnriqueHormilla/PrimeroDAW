/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema12.MVCpatronVista;

import tema12.MVCpatronControlador.CalculadoraControlador;

/**
 *
 * @author VESPERTINO
 */
public interface InterfazVistas {

    public abstract String getOperando1();

    public abstract String getOperando2();

    public abstract String getOperador();

    public abstract void setResultado(String dato);

    public void setControlador(CalculadoraControlador aThis);
    
    public void salir();
}
