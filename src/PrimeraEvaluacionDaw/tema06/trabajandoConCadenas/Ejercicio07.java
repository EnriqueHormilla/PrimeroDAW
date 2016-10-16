/*
Idem a ejercicio 6 pero retorna: tres números de A, tres de B ... suponemos que el
tamaño de ambos es múltiplo de tres y del mismo tamaño (comprobad) 
 */
package tema06.trabajandoConCadenas;

import enrique.sources.UtilidadesString;

public class Ejercicio07 {

    public static String ejercicio07(String s1,String s2){
        StringBuilder sb = new StringBuilder("");        
        //Reutilizar el codigo es mucho mejor 
        if((UtilidadesString.comprobarNumeroEntero(s1)==true) && (UtilidadesString.comprobarNumeroEntero(s2)==true)){
            if(UtilidadesString.comprobarIgualadTamanioCadenas(s1, s2)==true){
                //Comprobar que es multiplo de 3
                int n1 = s1.length();
                int n2 = Integer.parseInt(s2);
                if((n1%3!=0) && (n2%3!=0)){
                  System.out.println("No son multiplos de 3");
                   return null;  
                }
                // Hacer la mezcla 
                int bucle=s1.length()/3;
                int contador=0;
                for (int i = 0; i < bucle;i++) {

                sb.append(s1.substring(contador,contador+3));
                sb.append(s2.substring(contador,contador+3));        
                contador=+3;
                }  
            } 
        }                            
        return sb.toString();   
        
       
    }
}
