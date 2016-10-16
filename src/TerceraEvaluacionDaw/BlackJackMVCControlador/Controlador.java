/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJackMVCControlador;

import BlackJackMVCModelo.*;
import BlackJackMVCVista.InterfazMVC;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author VESPERTINO
 */
public class Controlador implements ActionListener {

    private Baraja baraja;
    private Crupier crupier;
    private Jugador jugador;
    private InterfazMVC vista;
    private Carta cartaAux;
    public int ganador;//0=ninguno 1=jugador 2=crupier

    public Controlador(Baraja baraja, Crupier crupier, Jugador jugador, InterfazMVC vista) {
        this.baraja = baraja;
        this.crupier = crupier;
        this.jugador = jugador;
        this.vista = vista;
        vista.setControlador(this);
        vista.iniciarJuego();
        cartaAux = null;
        ganador = 0;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("iniciarJuego")) {
            jugador.setNombre(vista.getNombreJugador());
            jugador.setBote(vista.getBoteJugador());
            jugador.setApuesta(vista.getApuestaPartida());
        }
        if (e.getActionCommand().equals("PedirCarta")) {
            Carta c = baraja.pedirCarta();
            int a = jugador.addCarta(c); // Añadir a la mano
            vista.mostrarMano(jugador.getMano(), jugador.getMano().getValorTotal());
            //En crupier comprobar ganador
            int aux2 = crupier.compruebaGanador(jugador);
            if (aux2 == 1) {
                vista.setPoderJugar(true);
            } else if (aux2 == 2) {
                if (a > 21) {
                    vista.setPoderJugar(false);
                    ganador = 2;
                    metodo();
                }
            }
            if (e.getActionCommand().equals("Ganador")) {
                metodo();
            }

            if (e.getActionCommand().equals("Plantarse")) {
                vista.setPoderJugar(false);
                boolean aux = crupier.juega(jugador.getMano().getValorTotal(), baraja);
                vista.mostrarMano(crupier.getMano(), crupier.getMano().getValorTotal());
                if (aux) { // True ha ganado cruiper
                    ganador = 2;
                    jugador.setBote(jugador.getBote() - jugador.getApuesta());
                    vista.setNombreGanador("Croupier");
                    // vista.setBoteJugador(jugador.getBote());                
                } else {
                    ganador = 1;
                    vista.setNombreGanador("" + jugador.getNombre());
                    jugador.setBote(jugador.getBote() + jugador.getApuesta());
                }

            }
            if (e.getActionCommand().equals("Salir")) {
                System.exit(0);
            }
        }
    }

    private void metodo() {
        if (ganador == 0) {
            vista.setNombreGanador("ninguno");
        } else if (ganador == 1) {
            vista.setNombreGanador("" + jugador.getNombre());
        } else {
            vista.setNombreGanador("Croupier");
        }
    }

}
