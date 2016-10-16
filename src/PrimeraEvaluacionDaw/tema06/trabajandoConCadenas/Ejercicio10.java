/*
Realizar un método que recibe un número N (entero + 0) y devuelve un String. El
método creará inicialmente un String con números entre 1 y 100 y posteriormente 
eliminará el número N del String retornándolo.
 */
package tema06.trabajandoConCadenas;
import enrique.sources.*;

public class Ejercicio10 {
    public static String ejercicio10(int n,int min ,int max){
        String respuesta="";
        StringBuilder s=new StringBuilder(UtilidadesString.cadenaNumerica(min, max));
        StringBuilder s1=new StringBuilder("");
        if(UtilidadesInt.numeroEntre(n, min, max)==false){
           respuesta="El numero introducido no esta en el rango de entre "+min+" y "+max;     
        }else{
            for (int i =0 ; i < s.length(); i++) {    
                //no comparar el contador sino lo que hay dentro de el asi si i=18 leere primero el uno y luego el 8 
                if (i!=n-1){
                     s1.append(s.charAt(i));
                }
                respuesta=s1.toString();
             
            }
        }
        return respuesta;
    }
    public static void main(String[] args) {
        System.out.println(ejercicio10(8,1,20));
    }
    
}
