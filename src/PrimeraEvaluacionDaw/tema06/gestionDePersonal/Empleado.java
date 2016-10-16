package Tema06.GestionDePersonal;

public abstract class Empleado {
   //Atributos
    public String nif,nombre,edad;
        //Atributo que es una constante en este programa.
    public static final  double salarioMinimo=658.00;
    
    //Contructor
    public Empleado(String nif, String nombre, String edad) {    
        this.nif = nif;
        this.nombre = nombre;
        this.edad = edad;
    }

    //Sobreescritura del metodo toString
    @Override
    public String toString() {
        return "Empleado{" + "nif=" + nif + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    //Creaccion del metodo abtracto que no puede instanciarse en empleado.
    public abstract double calcularSueldo();
   
}
