/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.ejemploDataObject;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Enrique
 */
public class run {
    public static void main(String[] args) {
        ArrayList arraylist=new ArrayList();
        Acciones acciones=new Acciones();
        Punto putno1=new Punto(0, 0);
        Punto putno2=new Punto(5, 5);
        Punto putno3=new Punto(7, 7);          
        arraylist.add(putno1);
        arraylist.add(putno2);
        arraylist.add(putno3);
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println(next);
        }
        acciones.escribirRegistro(arraylist);
        arraylist=acciones.leerRegistro();
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println(next);
        }
         
       
    }
}
