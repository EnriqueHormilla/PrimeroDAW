/*
 Realizar un método en la clase StringII que reciba un String con números enteros
positivos + 0 y de una cifra y muestre dichos números en el siguiente orden: el
primero, el último, el segundo, el penúltimo, el tercero etc. (el String que se recibe 
debe tener una longitud par comprobar ese hecho). 
 */
package tema06.trabajandoConCadenas;

public class Ejercicio05 {  
    public static void ejercicio05(String cadenaA){
        //Transforma la cadena Stings en un integer
        int numero = Integer.parseInt(cadenaA);
        StringBuilder cadena = new StringBuilder(cadenaA);
        if(numero>0){
            if((numero%2) ==0){                
               // System.out.println("Es par");
                StringBuffer cadenaIntermedia=new StringBuffer("");
                 for (int i = 0; i < cadena.length()/2; i++) {
                    //public char charAt(int index);
                    cadenaIntermedia.append(cadena.charAt(i));
                    int posicionUltima=cadena.length()-(i+1);
                    cadenaIntermedia.append(cadena.charAt(posicionUltima));                   
                }
                  System.out.print(cadenaIntermedia);     
            }else{
                System.out.println("No es par");
            }
        }else{
            System.out.println("El numero es menor que 0");
        }
    } 
}
