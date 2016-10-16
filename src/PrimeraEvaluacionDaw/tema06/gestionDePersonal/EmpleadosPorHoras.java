package Tema06.GestionDePersonal;
//Hijo de Empleado
public class EmpleadosPorHoras extends Empleado{
    //Atributos
    public static double precioHora=50;
    public int numeroHoras;
    
    //Constructor
    public EmpleadosPorHoras(int numeroHoras, String nif, String nombre, String edad) {
        super(nif, nombre, edad);
        this.numeroHoras = numeroHoras;
    }

    public static void setPrecioHora(double precioHora) {
        EmpleadosPorHoras.precioHora = precioHora;
    }

    @Override
    public String toString() {
        return "EmpleadosPorHoras{" + "numeroHoras=" + numeroHoras + '}';
    }

    @Override
    public double calcularSueldo() {
       return numeroHoras*precioHora;
    }

}
