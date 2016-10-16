package Tema06.PolimorfismoFigura;

public class RunFigura {
     public static void main(String[] args) {
        //Inicializamos la clase Matematico
        Matematico mate = new Matematico();
        
        //Mostramos el area y el perimetro de cuadrado
        System.out.println("Cuadrado");
        //Inicializamos el metodo averiguarPerimetro creando un objeto "Cuadrado"
        System.out.println("Perimetro: \t"+mate.averiguarPerimetro(new Cuadrado(2))); 
        //Inicializamos el metodo averiguarArea creando un objeto "Cuadrado"
        System.out.println("Area: \t\t"+mate.averiguarArea(new Cuadrado(2)));
        
        System.out.println("---------");
        
        //Mostramos el area y el perimetro de triangulo
        System.out.println("Triangulo");
        //Inicializamos el metodo averiguarPerimetro creando un objeto "Triangulo"
        System.out.println("Perímetro: \t"+mate.averiguarPerimetro(new Triangulo(2, 4)));
        //Inicializamos el metodo averiguarArea creando un objeto "Triangulo"
        System.out.println("Area: \t\t"+mate.averiguarArea(new Triangulo(2, 4)));
        
        System.out.println("---------");
        
        //Mostramos el area y el perimetro de circulo
        System.out.println("Circulo");
        //Inicializamos el metodo averiguarPerimetro creando un objeto "Circulo"
        System.out.printf("Perímetro: \t%.2f",mate.averiguarPerimetro(new Circulo(4)));
        System.out.println("");
        //Inicializamos el metodo averiguarArea creando un objeto "Circulo"
        System.out.printf("Area: \t\t%.2f",mate.averiguarArea(new Circulo(4)));
        System.out.println("");
        
        System.out.println("---------");
        
        //Mostramos el area y el perimetro de figura
        System.out.println("Figura");
        //Inicializamos el metodo averiguarPerimetro creando un objeto "Figura"
        System.out.println("Perímetro: \t"+mate.averiguarPerimetro(new Figura()));
        //Inicializamos el metodo averiguarArea creando un objeto "Figura"
        System.out.println("Area: \t\t"+mate.averiguarArea(new Figura()));
    }
        
      
}
