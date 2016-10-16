
package Tema05.AlquilerDeAmarres;

public class Cliente {
    //Declarar variables
    private int dni;
    private String nombre, apellidos;

    //Constructor completo 
    public Cliente(int dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    //Setters para DNI, Nombre y Apellidos
    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    //Sobrescribir del metodo "toString()" para mostrar los datos del cliente
    @Override
    public String toString(){
        return "DNI: "+dni+"\nNombre: "+nombre+"\nApellidos: "+apellidos;
    }
}
