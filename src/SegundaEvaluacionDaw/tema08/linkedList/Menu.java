
package tema08.linkedList;

import enrique.sources.*;
import java.util.Iterator;


public class Menu {
   
    private Usuario usu;
    private AccionesAlumnos acciones;
    
    public Menu() {
       System.out.println("Digame si quiere un maximo en la coleccion,(Si no pon -1)");
       acciones=new AccionesAlumnos(PedirValores.pedirInt());       
       System.out.println("Digame su nombre");
       usu= new Usuario(PedirValores.pedirString());                    
    }

    public int getOpcion() {
        return usu.getOpcion();
    }
       
    public void mostrartMenu(){
         System.out.println("\n 1. Añadir datos alumno \n 2. Mostrar ordenacion FIFO "
                + " \n 3. Mostrar ordenacion LIFO  \n 4. Sacar el objeto correspondiente de la lista \n 5. Enseñar el objeto ultimo incorporado "
                 +"\n 6. Numero de elemntos de la listas \n 7. Salir");
    }

    public void ejecutarOpcion(){
        usu.getNombre();
        usu.getOpcion();
        usu.pedirOpcion(); 
        switch(usu.getOpcion()){
            case 1:
                acciones.addAlumno();
                break;
            case 2:
                System.out.println("Posicion \t nExpediente \t Nombre \t Nota \t Telefono");
                acciones.imprimirCola();
                break;
            case 3:
                System.out.println("Posicion \t nExpediente \t Nombre \t Nota \t Telefono");
                acciones.imprimirPila();
                break;
            case 4:   
                System.out.println("Objeto de cola");
                System.out.println(acciones.colaPasar().pop().toString());
                System.out.println("Objeto de Pila");
                System.out.println(acciones.pilaPasar().pop().toString());
                break;
            case 5:
                System.out.println("Objeto de cola");
                System.out.println( acciones.colaPasar().cima());
                System.out.println("Objeto de Pila");
                System.out.println( acciones.pilaPasar().cima());
                break;
            case 6:
                System.out.println("Size de cola");
                System.out.println(acciones.colaPasar().size());
                System.out.println("Size de Pila");
                System.out.println(acciones.pilaPasar().size());
        }                        
    }

}
