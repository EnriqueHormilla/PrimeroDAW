package Tema06.GestionDePersonal;

public class EmpleadoFijo extends Empleado{
    private int anioAlta,anioActual;  
    private static double complemento=40;

    public EmpleadoFijo(int anioAlta, int anioActual, String nif, String nombre, String edad) {
        super(nif, nombre, edad);
        this.anioAlta = anioAlta;
        this.anioActual = anioActual;
    }
    
    public static void setComplemento(double complemento) {
        EmpleadoFijo.complemento = complemento;
    }
    
    //Rescritura del metodo calcularSueldo
    @Override
    public double calcularSueldo() {
       return ((anioActual-anioAlta)*40)+salarioMinimo;
    }

    @Override
    public String toString() {
        return "EmpleadoFijo{" + "anioAlta=" + anioAlta + ", anioActual=" + anioActual + '}';
    }

   
}
