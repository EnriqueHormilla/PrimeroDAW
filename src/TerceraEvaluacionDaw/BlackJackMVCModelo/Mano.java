/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJackMVCModelo;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 *
 * @author VESPERTINO
 */
public class Mano {
    private ArrayList<Carta> mano;
    private int valorTotal;

    public Mano() {
        mano = new ArrayList();
        valorTotal = 0;
    }

    public ArrayList<Carta> getMano() {
        return mano;
    }

    public void setMano(Carta carta) {
        this.mano = mano;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int ValorTotal) {
        this.valorTotal = ValorTotal;
    }
    public void addCarta(Carta carta){
        int aux = carta.getValor();
        valorTotal+=aux;
        this.mano.add(carta);
    }
    
    
    
}
