/*
Realizar un método que recibe un String con 10 números aleatorios entre 0 y 9, y
calcula y retorna la suma y la media de esos 10 números.
 */
package tema06.PracticaOtrosEjercicios;
import enrique.sources.*;
public class Ejercicio04 {
    public static MisDatos4 ejercicio4(String cadena){
        
        StringBuilder cadena1=new StringBuilder(cadena);
        int suma=0,media=0,count=0;
        MisDatos4 d;      
        for (int i = 0; i < cadena.length(); i++) {
            count++;
            suma=suma+ Character.getNumericValue(cadena.charAt(i));                                              
        }
        media=suma/count;
        d = new MisDatos4(suma, media);
        return d;
    }

   
    
}
