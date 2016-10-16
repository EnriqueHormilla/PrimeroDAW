/*
Realizar un método que reciba dos número N y M (entero positivo + 0). Rellene un
String con 10 números aleatorios de una cifra y añada en el String de aleatorios N 
asteriscos a partir de la posición M del String, retornando el resultado.
 */
package tema06.trabajandoConCadenas;

import enrique.sources.PedirValores;

public class Ejercicio08 {

    public static String ejercicio08(int n1,int n2){
        int bucle,anado;  
        PedirValores s=new PedirValores();
        long numeroAleatorio= s.pedirAleatorioLong(10);
        StringBuilder texto=new StringBuilder(""); 
        texto.append(numeroAleatorio);
        if(((n2<=10)&& (n2>0)) && (n1>=0)){            
            if(n1+n2>10){
                anado=(n1+n2)-10;
                bucle=10-n2;
                for (int i = 0; i <bucle; i++) {    
                     texto.setCharAt(n2-1,'*');
                     n2++;            
                }
                for (int x = 0; x <= anado ; x++) {
                    texto.append('*');                
                }          
            }else{
                bucle=n1;
                for (int i = 0; i <bucle; i++) {    
                     texto.setCharAt(n2-1,'*');
                     n2++;            
                } 
            }              
            return texto.toString();  
        }else{
            return "el segundo valor tiene que estar entre 1 y 10 y el primer valor como minimo un 0";
        }    
    }

    

}
