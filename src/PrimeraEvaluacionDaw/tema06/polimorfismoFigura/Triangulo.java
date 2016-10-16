package Tema06.PolimorfismoFigura;



public class Triangulo extends Figura{
    //Declaramos las variables
    private double base, altura;

    //Constructor completo
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Sobrescribimos el metodo "calcularArea()" y nos devuelve el area del triangulo
    @Override
    public double calcularArea(){
        return (base*altura)/2.0;
    }
    
    //Sobrescribimos el metodo "calcularPerimetro()" y nos devuelve el perimetro del triangulo
    @Override
    public double calcularPerimetro(){
        return 3*base;
    }
}

