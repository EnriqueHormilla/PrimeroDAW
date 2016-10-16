
package Tema04.garaje;

public class Práctica3{
    public static void main(String[] args) {
        //Declarar variables
        double precio1=(Math.random()*1000);
        double precio2=(Math.random()*1000);
        double precio3=(Math.random()*1000);
        double precio4=(double)(Math.random()*1000);
        String averia;
        
        //Crear taller
        Taller t=new Taller();
        
        //Crear dos coches
        Coche c1=new Coche("Audi", "Q7");
        Coche c2=new Coche("Ferrari","F15");
        
        averia="Ruedas";
        System.out.println("¿Entra primer coche por primera vez?: "+t.aceptarCoche(c1, averia));
        System.out.println("Averia: "+averia);
        System.out.printf("Precio averia: %.2f",precio1);
        c1.acumularAveria(precio1);System.out.println();
        t.devolverCoche();
        
        System.out.println("------------");
        
        averia="Crital Roto";
        System.out.println("¿Entra segundo coche por primera vez?: "+t.aceptarCoche(c2, averia));
        System.out.println("Averia: "+averia);
        System.out.printf("Precio averia: %.2f",precio2);
        c1.acumularAveria(precio2);System.out.println();
        t.devolverCoche();
        
        System.out.println("------------");
        System.out.println("------------");
    }
}
