
package Tema05.CuentasBancarias;

public class Titular {
    //Declarar variables
    private String nombre, apellidos;
    private int edad;

    //Constructor completo
    public Titular(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //Setters y getters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
        
    //Sobreescribir metodo toString()
    @Override
    public String toString(){
        return "Nombre: \t\t"+nombre+"\nApellidos: \t\t"+apellidos+"\nEdad: \t\t\t"+edad;
    }
}
