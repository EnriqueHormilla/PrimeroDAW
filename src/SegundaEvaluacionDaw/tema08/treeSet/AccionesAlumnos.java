/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08.treeSet;

import enrique.sources.PedirValores;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author PROF_VESPERTINO
 */
public class AccionesAlumnos {
    private TreeSet alumnos;

    public AccionesAlumnos() {
        alumnos = new TreeSet();
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
        alumnos.add(alum);
        
    }
    public void deleteAlumno(){
        Iterator it = alumnos.iterator();
        int numero, count = 0;
        Alumno aux;
        
        System.out.println("¿Qué elemento quieres borrar?");
        numero = PedirValores.pedirInt();
        //Numero marca en qué posición está el elemento a eliminar. Se copia el resto de elementos a otro.
        while (it.hasNext()) { 
            aux = (Alumno)it.next();
            if (count == numero) {
                alumnos.remove(aux);
                break;
            }
            count++;
        }                
    }

    public void showAlumno(){
        Iterator ite=alumnos.iterator();
        int count=0;
        Alumno aux;
         while (ite.hasNext()) {
             aux= (Alumno) ite.next();
             System.out.println("(" + count+") "+aux.toString()); 
             count++;
         }
    }
    public void muestraPorNumeroDeExpeciente() {
        showAlumno();
    }
    
    public void muestraPorNombre() {
        AlumnoOrdenadoPorNombre ordenNombre = new AlumnoOrdenadoPorNombre();
        TreeSet aux = new TreeSet(ordenNombre);
        aux.addAll(alumnos);
        
        Iterator i = aux.iterator();
        System.out.println("Te los muestro por nombre va");
        // Mostraremos listado haciendo uso del "orden natural"
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    public void muestraPorNota() {
        AlumnoOrdenarPorNota ordenNota= new AlumnoOrdenarPorNota();
        TreeSet aux = new TreeSet(ordenNota);
        aux.addAll(alumnos);
        
        Iterator i = aux.iterator();
        // Mostraremos listado haciendo uso del "orden natural"
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
     public void muestraPorTelefono() {
        AlumnoOrdenarPorTelefono ordenTelefono= new AlumnoOrdenarPorTelefono();
        TreeSet aux = new TreeSet(ordenTelefono);
        aux.addAll(alumnos);
        
        Iterator i = aux.iterator();
        // Mostraremos listado haciendo uso del "orden natural"
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    

    
}
