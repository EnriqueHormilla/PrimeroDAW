/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJackMVCVista;

import BlackJackMVCControlador.Controlador;
import BlackJackMVCModelo.Carta;
import BlackJackMVCModelo.Mano;
import java.awt.event.ActionEvent;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class VistaConsola implements InterfazMVC {

    private Controlador controlador;
    private String nombreJugador;
    private float boteJugador;
    private float apuestaPartida;
    private String nombreGanador;
    private int numeroDePartidas;
    private boolean poderJugar;

    public VistaConsola() {
        nombreJugador = "";
        nombreGanador = "";
        boteJugador = 0;
        apuestaPartida = 0;
        numeroDePartidas = 0;
        poderJugar = true;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    private void setNombreJugador() {
        System.out.print("Digame su nombre--->");
        Scanner sc = new Scanner(System.in);
        this.nombreJugador = sc.nextLine();
    }

    public float getBoteJugador() {
        return boteJugador;
    }

    private void setBoteJugador() {
        System.out.print("Rasquese los bolsillos y digame cuanto tiene --->");
        Scanner sc = new Scanner(System.in);
        this.boteJugador = sc.nextFloat();
    }

    public float getApuestaPartida() {
        return apuestaPartida;
    }

    private void setApuestaPartida() {
        System.out.print("Cuanto quiere apostar--->");
        Scanner sct = new Scanner(System.in);
        this.apuestaPartida = sct.nextFloat();
    }

    public String getNombreGanador() {
        System.out.println("El ganador es "+nombreGanador);
        return nombreGanador;
    }

    public void setNombreGanador(String s1) {
        this.nombreGanador = s1;
    }

    public int getNumeroDePartidas() {
        return numeroDePartidas;
    }

    public void setNumeroDePartidas() {
        this.numeroDePartidas++;
    }


    public boolean volverAJugar() {
        System.out.println("¿Otra partida más?(true o false ) --->");
        Scanner sc = new Scanner(System.in);
        return sc.nextBoolean();
    }

    public boolean otraCarta() {
        System.out.println("¿Otra carta más?(true o false ) --->");
        Scanner sc = new Scanner(System.in);
        return sc.nextBoolean();
    }

    public void mostrarMano(Mano mano, int puntuacion) {
        //Para recorrer el arrayList dentro de mano
        System.out.println("El nombre del ganador es "+nombreGanador);
        for (Carta carta : mano.getMano()) {
            System.out.println(carta);
        }
        System.out.println("Su puntuacion total con esta mano ,ahora es-->" + puntuacion);
    }

    @Override
    public void iniciarJuego() {
        System.out.println("Bienvenido");
        setNombreJugador();
        setBoteJugador();
        setApuestaPartida();
        iniciarPartida();
        controlador.actionPerformed(new ActionEvent(this, 0, "IniciarJuego"));
       
    }

    @Override
    public void iniciarPartida() {
        pedirCarta();
        pedirCarta();
       
        while (poderJugar) {
            if(otraCarta()){
               pedirCarta(); 
            }else{
                plantarse(); 
            }
        }
        if(poderJugar==false){
          getNombreGanador();
        }
       // Empieza el crupier

    }

    public boolean isPoderJugar() {
        return poderJugar;
    }

    public void setPoderJugar(boolean poderJugar) {
        this.poderJugar = poderJugar;
    }
    

    @Override
    public void pedirCarta() {
        controlador.actionPerformed(new ActionEvent(this, 1, "PedirCarta"));
    }

    @Override
    public void plantarse() {
        controlador.actionPerformed(new ActionEvent(this, 2, "Plantarse"));
    }
    @Override
    public void ganador() {
        controlador.actionPerformed(new ActionEvent(this, 2, "Ganador"));
    }

    @Override
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
        // controlador.actionPerformed(new ActionEvent("", 1, "Jugar"));
    }


}
