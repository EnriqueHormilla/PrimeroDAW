/*
Consegir una fecha tipo Logroño a 29 de enero de 1999

https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

 */
package tema06.dateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author VESPERTINO
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Date fechaActual=new Date();
        DateFormat fechaEntera=new SimpleDateFormat("'Logroño a' dd 'de ' MMMMM ' de ' YYYY 'en concreto a .' HH:mm:ss");
        DateFormat fechaEntera1=new SimpleDateFormat("'Logroño a' EEEEE dd 'de ' MMMMM ' de ' YYYY 'en concreto a :' HH:mm:ss");
       // System.out.println("Logroño a "+dia.format(fechaActual)+" de "+mes.format(fechaActual)+" de "+anio.format(fechaActual));
         System.out.println(fechaEntera.format(fechaActual));
         System.out.println(fechaEntera1.format(fechaActual));

       
    }
    
}
