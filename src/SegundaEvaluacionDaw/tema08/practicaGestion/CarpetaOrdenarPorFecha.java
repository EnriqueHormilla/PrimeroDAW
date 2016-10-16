/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08.practicaGestion;

import java.util.Comparator;

/**
 *
 * @author Enrique
 */
public class CarpetaOrdenarPorFecha implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
       Apunte a=(Apunte) t;
       Apunte b=(Apunte)t1;
       return (a.getFecha().compareTo(b.getFecha()));
    }
    
}
