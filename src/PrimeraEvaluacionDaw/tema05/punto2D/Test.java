
package Tema05.Punto2D;

public class Test {
    public static void main(String[] args) {
        //Inicializa los dos puntos
        Punto p1=new Punto(1,5);
        Punto p2=new Punto(7,6);
        
        //Muestra los dos puntos por pantalla
        System.out.println("Punto 1: "+p1);
        System.out.println("Punto 2: "+p2);
        
        System.out.println("----------------");
        
        //Muestra si son o no las coordenadas iguales
        if(p1.equals(p2)){
            System.out.println("Las dos son iguales");
        }else{
            System.out.println("Las dos no son iguales");
        }
        
        System.out.println("----------------");
        
        //Muestra el punto mayor de cada coordenada
        System.out.println("El mayor de la primera coordenada: "+p1.equals());
        System.out.println("El mayor de la segunda coordenada: "+p2.equals());
    }
}
