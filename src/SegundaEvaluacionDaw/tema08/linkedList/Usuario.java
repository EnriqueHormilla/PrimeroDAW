package tema08.linkedList;
import tema08.treeSet.*;
import tema08.alumno.enrique.*;
import enrique.sources.*;
public class Usuario {
    private String nombre;
    private int opcion;
    
    public Usuario() {
        
    }
    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }
    
    public void pedirOpcion(){
        System.out.println("Por favor "+this.nombre+" escoja un opcion");
        setOpcion(PedirValores.pedirInt());
    }
    public static void main(String[] args) {
        Usuario usu=new Usuario(PedirValores.pedirString());
        usu.pedirOpcion();
        System.out.println(usu.getOpcion());
    }
}
