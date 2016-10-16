/*
Realizar un método que reciba un número N (entero positivo + 0) y retorne un
String. El método rellenará inicialmente un String con la tabla del 5. Posteriormente 
recorrerá dicho String insertando el número N de forma ordenada en el String y 
retornándolo.
 */
package tema06.trabajandoConCadenas;

import enrique.sources.*;

public class Ejercicio09 {   
    public static String ejercicio9(int n ,int min ,int max ){
        StringBuilder s = new StringBuilder(UtilidadesString.cadenaNumerica(min, max));
        StringBuilder s1 = new StringBuilder("");
        String respuesta="";
        if((UtilidadesInt.numeroMayorIgual(n, 0))&& (UtilidadesInt.numeroMayorIgual(min,0)) && (UtilidadesInt.numeroMayorIgual(max,0))){
            if(UtilidadesInt.numeroEntre(n, min, max)==false){              
                respuesta="El numero introducido no esta en el rango de entre "+min+" y "+max;                            
            }else{
                for (int i = 0; i <= max; i++) {
                    if(i==n){
                      s1.append(s.charAt(i));                       
                    }
                     s1.append(s.charAt(i));                        
                } 
                respuesta=s1.toString();
            }  
        }else{
            respuesta="Los numeros introducidos no son positivos";
        }
                      
         return respuesta ;
    }
    
    public static void main(String[] args) {
        System.out.println(ejercicio9(4, 0, 9));

    }
    
}
