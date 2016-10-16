package BlackJackMVCModelo;

import java.util.ArrayList;
import java.util.Iterator;


public class Baraja {

    final static int TAMAÑO_BARAJA = 52;
    private ArrayList<Carta> cartas;


    public Baraja() {       
        cartas = new ArrayList();
        for (int i = 0; i < TAMAÑO_BARAJA; i++) {
            cartas.add(new Carta(i));
        }
    }


    public void barajar() {
        for (int i = 0; i < TAMAÑO_BARAJA; i++) {
            int r = (int) (Math.random() * i);
           
            Carta cambiar=(Carta) cartas.get(i);
            cartas.set(i, cartas.get(r));
            cartas.set(r, cambiar);
          
        }
    }
    public Carta pedirCarta(){
        int a=cartas.size()-1; 
        Carta auxCarta= cartas.get(a);
        cartas.remove(a);
        return auxCarta;
    }
    
    public String toString() {
        String s = "Baraja  ";        
        for (Iterator iterator = cartas.iterator(); iterator.hasNext();) {            
            Object next = iterator.next();
            s+=next.toString();            
        }        

        return s;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
    

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        System.out.println(baraja);
        for (Iterator iterator = baraja.getCartas().iterator(); iterator.hasNext();) {
            Carta next = (Carta) iterator.next();
            System.out.println(next);
        }
//        baraja.barajar();
//        System.out.println(baraja);
//        System.out.println("---");
       
    }

}
