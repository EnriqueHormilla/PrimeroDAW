/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08.treeSet;

import java.util.Comparator;

/**
 *
 * @author PROF_VESPERTINO
 */
public class AlumnoOrdenarPorNota implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Alumno a1 = (Alumno)o1;
        Alumno a2 = (Alumno)o2;        
        int aux;
        
        aux = a1.getNota()-a2.getNota();
        return aux;    
    }
    
}
