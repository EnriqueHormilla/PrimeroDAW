/*
Realizar un metodo que pida el usuario 1 cadena que muestre el numero de 
palabras 
calcule y muestre por pantallla el numero de frases.
Se hace con string tokennizer
 */
package tema06.trabajandoConCadenas;

import java.util.StringTokenizer;

/**
 *
 * @author Enrique
 */
public class EjercicioTokenizer {
     public static void ejercicioTokenizer(String s){
        int countPalabras=0,countFrases=0;
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
         System.out.println(st.nextToken());
         countPalabras++;
        }
        StringTokenizer st1 = new StringTokenizer(s, ".");
        while(st.hasMoreTokens()) {
        System.out.println(st1.nextToken());
        countFrases++;
        }
        System.out.println("Numero de palabras "+countPalabras+" Numero de frases "+countFrases);
    }
    public static void main(String[] args) {
        ejercicioTokenizer("hola que tal . Yo estoy bien");
    }
}
