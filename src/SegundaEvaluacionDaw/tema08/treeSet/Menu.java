
package tema08.treeSet;

import enrique.sources.*;
import java.util.Iterator;

public class Menu {
   
    private Usuario usu;
    private AccionesAlumnos acciones;
    public Menu() {
       acciones=new AccionesAlumnos();
       System.out.println("Digame su nombre");
       usu= new Usuario(PedirValores.pedirString());                    
    }

    public int getOpcion() {
        return usu.getOpcion();
    }
       
    public void mostrartMenu(){
         System.out.println("\n 1. Añadir datos alumno \n 2. Borrar por posicion"
                + " \n 3. Ordenar listado( por expediente) \n 4. Ordenar por nombre \n 5. Ordenar por Nota \n 6. Ordenar por Telefono \n 7. Salir del programa");
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
                acciones.deleteAlumno();
                break;
            case 3:
                acciones.showAlumno();
                break;
            case 4:
                acciones.muestraPorNombre();
                break;
            case 5:
                acciones.muestraPorNota();
                break;
            case 6:
                acciones.muestraPorTelefono();
                break;
                
        }                        
    }

}
