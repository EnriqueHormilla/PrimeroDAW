
package Tema03.EjerciciosIf;

import java.util.Scanner;

public class IfEjercicio11 {
    public static void main(String[] args) {
        //Declarar variables
        int x, centena, decena, unidad, unidadMillar;
        
        //Introducir resultado
        do {
            Scanner s=new Scanner(System.in);
            System.out.print("Introduce un número entre 0 y 9999: ");
            x=s.nextInt();
            if (x>9999 || x <0) {
                System.out.println("El numero no es correcto");
            }
        } while (x>9999 || x <0);
        
        System.out.println("-------------");
        
        if(x>=0 && x<10){ // Numeros de 1 cifra 
            System.out.println("Es capicua");
        }else if(x>=10 && x<100){ // Dos cifras
            decena=x/10; 
            unidad=x%10; 
            if(decena==unidad){   
                System.out.println("El número "+x+" es capicua");
            }else{
                System.out.println("El número "+x+" no es capicúa");
            }
        }else if(x>=100 && x<1000){ // Tres cifras
            centena=x/100;    
            decena=(x/10)%10;    
            unidad=(x%10)%10;    
            if(centena==unidad){
                System.out.println("El número "+x+" es capicua");
            }else{
                System.out.println("El número "+x+" no es capicua");
            }
        }else if(x>=1000 && x<10000){ // Cuatro cifras
            unidadMillar=x/1000;
            centena=(x/100)%10;
            decena=((x/10)%100)%10;
            unidad=((x%1000)%100)%10;
            if(unidadMillar==unidad && centena==decena){
                System.out.println("El número "+x+" es capicua");
            }else{
                System.out.println("El número "+x+" no es capicua");
            }
        }
    }
}
