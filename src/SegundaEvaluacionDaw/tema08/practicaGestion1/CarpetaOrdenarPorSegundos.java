
package tema08.practicaGestion1;

import tema08.practicaGestion.*;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class CarpetaOrdenarPorSegundos implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
       Apunte ap1=(Apunte) o1;
       Apunte ap2=(Apunte) o2;
       
             int aux;
        
        aux =(int) (ap1.getFecha().get(GregorianCalendar.SECOND) -  ap2.getFecha().get(GregorianCalendar.SECOND));
        //aux = a1.getNombre().compareTo(a2.getNombre());
        return aux;   
    }
    
    
    
}
