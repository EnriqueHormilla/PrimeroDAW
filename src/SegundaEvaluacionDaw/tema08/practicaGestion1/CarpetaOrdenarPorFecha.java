
package tema08.practicaGestion1;

import tema08.practicaGestion.*;
import java.util.Comparator;

public class CarpetaOrdenarPorFecha implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
       Apunte a=(Apunte) t;
       Apunte b=(Apunte)t1;
       return (a.getFecha().compareTo(b.getFecha()));
    }
    
}
