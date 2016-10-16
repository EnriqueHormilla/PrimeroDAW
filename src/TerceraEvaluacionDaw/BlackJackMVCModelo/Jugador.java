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
public class Jugador extends Persona{
    private float bote;
    private float apuesta;

    public Jugador() {
        super();
        bote=0;
        apuesta=0;
    }

    public Jugador(String nombre, Mano mano) {
        super(nombre, mano);
    }

    public float getBote() {
        return bote;
    }

    public void setBote(float bote) {
        this.bote = bote;
    }

    public float getApuesta() {
        return apuesta;
    }

    public boolean setApuesta(float apuesta) {
        if(apuesta<this.bote){
            this.apuesta = apuesta;
            return true;       
        }else{
            return false;
        }
            
    }
    

    
   
    
}
