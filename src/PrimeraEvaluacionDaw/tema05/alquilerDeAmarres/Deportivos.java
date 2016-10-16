
package Tema05.AlquilerDeAmarres;

//Clase Deportivos, que es una extensión de la clase Barco
public class Deportivos extends Barco{
    //Declarar variable
    private int CV;

    //Constructor completo
    public Deportivos(int CV, int matricula, int metrosEslora, int añoFabricacion) {
        super(matricula, metrosEslora, añoFabricacion);
        this.CV = CV;
    }

    //Sobrescribir el metodo calcularAlquiler de la clase Barco
    @Override
    public double calcularAlquiler(int numeroDias){
        return super.calcularAlquiler(numeroDias)+(CV*1);
    }
}
