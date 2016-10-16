
package Tema05.AlquilerDeAmarres;

//Clase Veleros, es una clase que es una extensión de la clase Barco
public class Veleros extends Barco{
    //Declarar variable
    private int numeroMastiles;

    //Constructor completo 
    public Veleros(int matricula, int metrosEslora, int añoFabricacion, int numeroMastiles) {
        super(matricula, metrosEslora, añoFabricacion);
        this.numeroMastiles = numeroMastiles;
    }

    //Sobrescribir el metodo "calcularAlquiler" de la clase Barco
    @Override
    public double calcularAlquiler(int numeroDias) {
        return super.calcularAlquiler(numeroDias)+(numeroMastiles*5);
    }
    
    
}
