/*
dado un array con numros aleatorios  calcular tiempo con mi metodo de ordenar array

 */
package tema07.arrays;
import enrique.sources.*;
import java.util.Arrays;
/**
 *
 * @author VESPERTINO
 */
public class Ejercicio04 {
    
    public static void main(String[] args) {
       
        int[ ] array = new int[10000]; 
        Cronometro crono=new Cronometro();      
        UtilidadesArray.arrayInsertatAleatorio(array, 0, 25000);
        crono.start();
        UtilidadesArray.ordenarArray(array);
        crono.stop();
        System.out.println(Arrays.toString(array));

       
        System.out.println("Tiempo tardado es--> "+crono.show());
        crono.reset();       

        
    }
}
