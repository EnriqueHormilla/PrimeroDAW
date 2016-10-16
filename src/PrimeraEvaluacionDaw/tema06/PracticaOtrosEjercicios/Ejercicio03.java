/*
Realiza un método que recibe tres enteros positivos (por referencia) y los convierte en
positivos dentro del método (usando el método abs de la clase Math). Mostrar en el main 
el valor de los 3 enteros antes y después de llamar al método.
 */
package tema06.PracticaOtrosEjercicios;
import enrique.sources.*;
/**
 *
 * @author VESPERTINO
 */
public class Ejercicio03 {
    public static void positivo(MisDatos3 datos){ 
       
        datos.setA(UtilidadesInt.TransformarPositivo(datos.getA()));
        datos.setB(UtilidadesInt.TransformarPositivo(datos.getB()));
        datos.setC(UtilidadesInt.TransformarPositivo(datos.getC()));
    }
    
}
