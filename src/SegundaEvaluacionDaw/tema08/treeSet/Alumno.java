/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08.treeSet;

/**
 *
 * @author PROF_VESPERTINO
 * @para
 */
public class Alumno implements Comparable {
    private int nExpediente;
    private String nombre, apellido;
    private int edad;
    private int nota;
    private long telefono;

    /**
     *
     * @return
     */
    public int getNota() {
        return nota;
    }

    /**
     *
     * @param nota
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     *
     * @return
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }    
    
    /**
     *
     * @return
     */
    public int getnExpediente() {
        return nExpediente;
    }

    /**
     *
     * @param nExpediente aaa
     */
    public void setnExpediente(int nExpediente) {
        this.nExpediente = nExpediente;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre aaa
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public String getApellido() {
        return apellido;
    }

    /**
     *
     * @param apellido aa
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nExpediente + "\t" + nombre + "\t" + nota + "\t" + telefono;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.nExpediente != other.nExpediente) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) { // Yujuuuu he establecido el "orden natural" de Alumno
        int aux;
        Alumno alumno = (Alumno)o;
        
        aux = this.getnExpediente() - alumno.getnExpediente();
        return aux;        
    }

    int get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
