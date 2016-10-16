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
public class Crupier extends Persona{

    public Crupier() {
        super();
    }    
    
    
    public Crupier(String nombre, Mano mano) {
        super(nombre, mano);
    }
    
    
    public boolean juega(int puntutacion,Baraja baraja)  {        
        while (this.getMano().getValorTotal()<puntutacion) {            
            Carta c = baraja.pedirCarta();
            addCarta(c);
            
        }
        if(this.getMano().getValorTotal()<=21){
            //Significa que tiene mas cartas que el jugador y menos o igual a 21 por lo tanto gana
             return true;
        }else{
            //Se a pasado de 21 ,pierde.
             return false;
        }
        // Pedir cartas
        // Añadirlas al mano
        // CalculaPuntuación hashta superar o igualar puntuacion

    }           

   

    public int compruebaGanador(Jugador jugador) {
        int pj = jugador.getMano().getValorTotal();
        int pc = this.getMano().getValorTotal();
        //comprobar quien gana etc.. 0=ninguno 1=jugador 2=crupier
        return 0;
    }

}
