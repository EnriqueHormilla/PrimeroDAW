
package Tema05.AlquilerDeAmarres;

//Clase Yates, una extensión de la clase Barco
public class Yates extends Barco{
    //Declara variable
    private int CV, numeroCamarotes;

    //Constructor completo
    public Yates(int CV, int numeroCamarotes, int matricula, int metrosEslora, int añoFabricacion) {
        super(matricula, metrosEslora, añoFabricacion);
        this.CV = CV;
        this.numeroCamarotes = numeroCamarotes;
    }
    
    //Sobrescribir el metodo calcularAlquiler de la clase Barco
    public double calcularAlquiler(int numeroDias){
        return super.calcularAlquiler(numeroDias)+(CV*1)+(numeroCamarotes*20);
    }
}
