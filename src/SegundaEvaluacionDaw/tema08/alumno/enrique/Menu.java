
package tema08.alumno.enrique;

import enrique.sources.PedirValores;
import java.util.HashSet;
import java.util.Iterator;

public class Menu {
    private HashSet alumnos;
    private Usuario usu;
    public Menu() {
       System.out.println("Digame su nombre");
       usu= new Usuario(PedirValores.pedirString());        
       alumnos = new HashSet();    
    }

    public int getOpcion() {
        return usu.getOpcion();
    }
       
    public void mostrartMenu(){
         System.out.println("\n 1. Añadir datos alumno \n 2. Borrar por posicion"
                + " \n 3. Mostrar listado \n 4. Salir del programa");
    }
    public void addAlumno(){
        Alumno alum = new Alumno();
        System.out.print("Nombre: ");
        alum.setNombre(PedirValores.pedirString());
        System.out.print("Telefono: ");
        alum.setTelefono(PedirValores.pedirString());
        System.out.print("Dni: ");
        alum.setDni(PedirValores.pedirString());
        //Añadimos a la coleccion el objeto que acabamos de inicializar
        alumnos.add(alum);
        
    }
    public void deleteAlumno(){
        Iterator it = alumnos.iterator();
        int numero, count = 0;

        System.out.println("¿Qué elemento quieres borrar?");
        numero = PedirValores.pedirInt()-1;

        //Numero marca en qué posición está el elemento a eliminar. Se copia el resto de elementos a otro.
        while (it.hasNext()) {
           // System.out.println("Count "+count+" numero"+numero);
            if (count == numero) {
               
                //System.out.println("Quero borrar la opcion "+count);
                alumnos.remove(it.next());
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
             System.out.println(count+".-"+aux); 
             count++;
         }
    }
    
    public void ejecutarOpcion(){
        usu.getNombre();
        usu.getOpcion();
        usu.pedirOpcion(); 
        switch(usu.getOpcion()){
            case 1:
                addAlumno();
                break;
            case 2:
                deleteAlumno();
                break;
            case 3:
                showAlumno();
        }                        
    }
    public static void main(String[] args) {
        Menu menu =new Menu();
        menu.addAlumno();
        menu.addAlumno();
         menu.addAlumno();
        menu.deleteAlumno();
    }
}
