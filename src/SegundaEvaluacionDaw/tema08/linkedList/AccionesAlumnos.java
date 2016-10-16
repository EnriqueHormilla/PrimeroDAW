/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08.linkedList;

import enrique.sources.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author PROF_VESPERTINO
 */
public class AccionesAlumnos {
    private Pila pila;
    private Cola cola;

    public AccionesAlumnos() {
        cola=new Cola();
        pila=new Pila();
    }

    public AccionesAlumnos(int maximo) {
        
        cola=new Cola(maximo);
        pila=new Pila(maximo);
    }
        
    public void addAlumno(){
        Alumno alum = new Alumno();
        
        System.out.print("Numero expediente: ");
        alum.setnExpediente(PedirValores.pedirInt());
        System.out.print("Nombre: ");
        alum.setNombre(PedirValores.pedirString());
        System.out.print("Nota: ");
        alum.setNota(PedirValores.pedirInt());
        System.out.print("Teledono: ");
        alum.setTelefono(PedirValores.pedirInt());
        //Añadimos a la coleccion el objeto que acabamos de inicializar
        if((cola.push(alum))&&(pila.push(alum))){
            System.out.println("Han sido insertados corectamente");
        }else{
            System.out.println("Esta llenita mamacita");
        }
        
        
    }
    public void imprimirCola(){
        cola.imprimir();
    }
    public void imprimirPila(){
        pila.imprimir();
    }
    public Cola colaPasar(){
        return cola;
    }
    public Pila pilaPasar(){
        return pila;
    }
    public static void main(String[] args) {
        AccionesAlumnos aciones=new AccionesAlumnos(1);
        aciones.colaPasar().size();
        System.out.println( aciones.colaPasar().estaLlena());
         aciones.colaPasar().push("pepe");
         aciones.colaPasar().push("pepe");
         aciones.colaPasar().size();
        System.out.println( aciones.colaPasar().estaLlena());
    }
//    public void deleteAlumno(){
//        Iterator it = alumnos.iterator();
//        int numero, count = 0;
//        Alumno aux;
//        
//        System.out.println("¿Qué elemento quieres borrar?");
//        numero = PedirValores.pedirInt();
//        //Numero marca en qué posición está el elemento a eliminar. Se copia el resto de elementos a otro.
//        while (it.hasNext()) { 
//            aux = (Alumno)it.next();
//            if (count == numero) {
//                alumnos.remove(aux);
//                break;
//            }
//            count++;
//        }                
//    }

}
