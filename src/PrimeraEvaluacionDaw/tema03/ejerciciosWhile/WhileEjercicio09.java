
package Tema03.EjerciciosWhile;

import java.util.Scanner;

public class WhileEjercicio09 {
    public static void main(String[] args) {
        //Declarar variables
        int sol=44, x;
        Scanner s=new Scanner(System.in);
        
        //Introducir número aleatorios
        do{
            System.out.print("Introduce un número entre 0 y 100: ");   
            x=s.nextInt();
            if(x<0 || x>100){   //Comprueba que el número esta en el rango
                System.out.println("El número esta fuera de rango");    
            }else if(x<sol){    //Numero introducido menor que la solución
                System.out.println("El número que buscas es mayor");
            }else{              //Numero introducido mayor que la solución
                System.out.println("El número que buscas es menor");
            }
            System.out.println("------------");
        }while(x!=sol);     
        
        //Mensaje que sale cuando has acertado el número
        System.out.println("Enhorabuena!! Has acertado");
    }
}
