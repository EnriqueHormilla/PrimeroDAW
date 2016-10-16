/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema06.trabajandoConCadenas;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio12 {
    public static String ejercicio12(String s1,String s2){

        StringBuilder cadenaLarga=new StringBuilder("");
        StringBuilder cadenaCorta=new StringBuilder("");      
        StringBuilder sb4=new StringBuilder();
        //Es una solucion pero poco eficiente 
//StringBuilder sb3=new StringBuilder(s1+s2);        
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < sb3.length(); j++) {
//                System.out.println(i+"=="+sb3.charAt(j));
//                if(i==Integer.parseInt("" + sb3.charAt(j))){
//                    sb4.append(sb3.charAt(j));
//                    System.out.println("Es igual");
//                }                
//            }            
//        }
                        
        int countX=0,countY=0,bucle;
        if(s1.length()<s2.length()){
           bucle=s1.length();
           cadenaCorta.append(s1);
           cadenaLarga.append(s2);
        }else{
           bucle=s2.length(); 
          cadenaCorta.append(s2);
          cadenaLarga.append(s1);
        }
        //Hace un do while para que no compare desde el principio el i con el countX
        int i=0;
        do {            
             if(s1.charAt(countX)<s2.charAt(countY)){
                sb4.append(s1.charAt(countX));
                countX++;
            }else{
               sb4.append(s2.charAt(countY));
                countY++; 
            }
        } while (countX<cadenaCorta.length());
        //El profesor hace que si una de los contadores es igual a la cadena  pare por que ya la a agotado yo lo hago arriba
       sb4.append(cadenaLarga.substring(countY));       
        return sb4.toString();
    }
    public static void main(String[] args) {
        System.out.println(ejercicio12("1346", "12457"));
         System.out.println(ejercicio12("135", "2469"));
    }
}
