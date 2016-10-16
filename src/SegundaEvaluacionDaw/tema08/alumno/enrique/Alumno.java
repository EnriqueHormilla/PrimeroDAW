/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08.alumno.enrique;

import java.util.Objects;

public class Alumno {
    private String nombre,telefono,dni;
    
    public Alumno() {       
    }
    public Alumno(String nombre, String telefono, String dni) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 43 * hash + Objects.hashCode(this.nombre);
//        hash = 43 * hash + Objects.hashCode(this.telefono);
//        hash = 43 * hash + Objects.hashCode(this.dni);
//        return hash;
//    }

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
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "" + "nombre=" + nombre + ", telefono=" + telefono + ", dni=" + dni ;
    }
    
    
}
