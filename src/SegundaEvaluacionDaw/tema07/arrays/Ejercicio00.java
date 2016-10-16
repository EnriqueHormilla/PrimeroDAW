/*
Ejercicio propuesto. 
Implementar un programa en Java que cree e inicialice en introduccione separadas un array de tipo float de tamaña 20. 
Rellene dicho array con numeros aletatorios entre 0 y 10.
Y calcule y muestre por pantalla posteriormente la nota media de los elementos del array
 */
package tema07.arrays;
import enrique.sources.*;
/**
 *
 * @author VESPERTINO
 */
public class Ejercicio00 {
    public static void main(String[] args) {
        float count=0,media=0;
        float[ ] nombre = new float[20];
        UtilidadesArray.arrayInsertatAleatorio(nombre, 1, 9);
        for (int i = 0; i < nombre.length; i++) {
           count+=nombre[i];  
           media++;
        }
        
        System.out.println("-----");
        System.out.println("la media es -->"+count+"/"+media+"="+count/media);
    }
    
}
