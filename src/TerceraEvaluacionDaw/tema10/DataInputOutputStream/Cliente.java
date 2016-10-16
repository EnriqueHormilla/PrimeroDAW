
package tema10.DataInputOutputStream;

import java.util.Objects;



public class Cliente {
    //Declarar variables
    private int dni;
    private String nombre, apellidos;

    public Cliente() {
    }

    
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

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.dni;
        hash = 43 * hash + Objects.hashCode(this.nombre);
        hash = 43 * hash + Objects.hashCode(this.apellidos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }
    
    //Sobrescribir del metodo "toString()" para mostrar los datos del cliente
    @Override
    public String toString(){
        return "DNI: "+dni+"\nNombre: "+nombre+"\nApellidos: "+apellidos;
    }
}
