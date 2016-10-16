/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJackMVCModelo;


/**
 *
 * @author VESPERTINO
 */
public class Persona {
    private String nombre;
    private Mano mano;

    public Persona() {
        nombre = "";
        mano = new Mano();
    }
    
    public Persona(String nombre, Mano mano) {
        this.nombre = nombre;
        this.mano = mano;
    }                

    public int addCarta(Carta carta){
        mano.addCarta(carta);
        return mano.getValorTotal();
    }
    public Mano getMano() {
        return mano;
    }

    public void setManoJugador(Mano manoJugador) {
        this.mano = manoJugador;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    
}
