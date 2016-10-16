
package Tema04.fraccion;

public class RunFraccion {

    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(2, 4);
        Fraccion f2 = new Fraccion(3, 4);
        Fraccion f3 = new Fraccion(2, 5);
        Fraccion f4;
        
        System.out.println("Suma homogenia: "); 
        f4 = f1.sumaHomogenia(f2);
        f4.print();
        
        System.out.println("*******************");
        
        System.out.println("Suma heterogenia");
        f4=f1.sumaHeterogenia(f3);
        f4.print();
        
        System.out.println("*******************");
        
        System.out.println("Resta homogenia");
        f4=f1.restaHomogenia(f2);
        f4.print();
                
        System.out.println("*******************");
        
        System.out.println("Resta heterogenia");
        f4=f1.restaHeterogenia(f3);
        f4.print();
        
        System.out.println("*******************");
        
        System.out.println("Multiplicación");
        
        f4=f1.multiplicacion(f2);
        f4.print();
        System.out.println("////////");
        f4=f1.multiplicacion(f3);
        f4.print();
        
        System.out.println("*******************");
        
        System.out.println("División");
        
        f4=f1.division(f2);
        f4.print();
        System.out.println("////////");
        f4=f1.division(f3);
        f4.print();
    }
}
