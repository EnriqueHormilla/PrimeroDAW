package Tema06.PolimorfismoFigura;

public class Cuadrado extends Figura{
    //Declarar variables
    private double lado;

    //Constructor completo
    public Cuadrado(double lado) {
        this.lado = lado;
    }
        
    //Sobrescribimos el metodo "calcularArea()" y nos devuelde el area del cuadrado
    @Override
    public double calcularArea(){
        return Math.pow(lado, 2);
    }
    
    //Sobrescribimos el metodo "calcularPerimetro()" y nos devuelve el perimetro del cuardrado 
    @Override
    public double calcularPerimetro(){
        return 4*lado;
    }
    
    
}
