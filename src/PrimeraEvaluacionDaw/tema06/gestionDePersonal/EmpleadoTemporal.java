package Tema06.GestionDePersonal;

//Importacion del calendario gregoriano
import java.util.GregorianCalendar;

//Clase hijo de empleado
public class EmpleadoTemporal extends Empleado{
    //Atributos 
    public GregorianCalendar fechaAlta,fechaBaja;
    
    //Constructor completo
    public EmpleadoTemporal(String nif, String edad, String nombre, int diaAlta, int diaBaja, int mesAlta, int mesBaja, int añoAlta, int añoBaja) {
        super(nif, edad, nombre);
        this.fechaAlta = new GregorianCalendar(añoAlta, mesAlta, diaAlta);
        this.fechaBaja = new GregorianCalendar(añoBaja, mesBaja, diaBaja);
    }
    
    //Rescritura del metodo calcularSueldo
    @Override
    public double calcularSueldo(){
       return Empleado.salarioMinimo;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
