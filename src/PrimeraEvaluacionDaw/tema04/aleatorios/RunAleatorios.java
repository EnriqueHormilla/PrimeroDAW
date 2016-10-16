
package Tema04.aleatorios;

public class RunAleatorios {
    public static void main(String[] args) {
        Aleatorios a=new Aleatorios(10,28);   //Números aleatorios entre el primero y el segundo
        System.out.println("Número aleatorios");
        System.out.println("--------------------");
        a.calcAleatorios(50);        //Cantidad de números aleatorios y muestra esa cantidad
        System.out.println();
    }
}
