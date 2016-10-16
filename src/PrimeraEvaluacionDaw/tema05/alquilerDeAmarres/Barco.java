
package Tema05.AlquilerDeAmarres;

public class Barco {
    //Declarar variables
    int matricula, metrosEslora, añoFabricacion;
    private double precio;

    //Constructor completo
    public Barco(int matricula, int metrosEslora, int añoFabricacion) {
        this.matricula = matricula;
        this.metrosEslora = metrosEslora;
        this.añoFabricacion = añoFabricacion;
    }
    
    //Metodo calcularAlquiler, que devuelde el precio del alquiler
    public double calcularAlquiler(int numeroDias){
        precio = (metrosEslora*10)*numeroDias+2;
        return precio;
    }
    
    //Sobrescribir el metodo "toString()" pasa mostrar los datos del barco
    @Override
    public String toString(){
        return "Matricula: "+matricula+"\nMetros de eslora: "+metrosEslora+"\nAño de fabricación: "+añoFabricacion;
    }
}
