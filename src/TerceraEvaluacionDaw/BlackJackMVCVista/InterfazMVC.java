/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJackMVCVista;

import BlackJackMVCControlador.Controlador;
import BlackJackMVCModelo.Carta;
import BlackJackMVCModelo.Mano;

/**
 *
 * @author
 */
public interface InterfazMVC {
    //Gets que necesito
    public abstract String getNombreJugador();
    public abstract float getBoteJugador();
    public abstract float getApuestaPartida();
    public abstract String getNombreGanador();
    public abstract void setNombreGanador(String nombreJanador);
    public abstract void setPoderJugar(boolean poderJugar);
    
    public abstract void iniciarJuego();
    public abstract void iniciarPartida();
    public abstract void pedirCarta();
    public abstract void plantarse();
    public abstract void ganador();
    public abstract void setControlador(Controlador controlador);
    
    //Metodo para mostrar en vista como va la mano
    public abstract void mostrarMano(Mano mano,int numeroTotalMano);

}
