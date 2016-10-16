
package Tema03.EjerciciosIf;

import java.util.Scanner;

public class IfEjercicio08 {
    public static void main(String[] args) {
        //Declarar variables
        int x;
        
        //Pedir datos
        Scanner s=new Scanner(System.in);
        System.out.print("Número (0 y 9999): ");
        x=s.nextInt();
        
        //Mostra resultado
        if(x<0 || x>9999){
            System.out.println("Número fuera de rango. Tiene que estrar entre 0 y 9999");
        }else if(x>=0 && x<10){
            System.out.println("El número "+x+" tiene una cifra");
        }else if(x>=10 && x<100){
            System.out.println("El número "+x+" tiene dos cifra");
        }else if(x>=100 && x<1000){
            System.out.println("El número "+x+" tiene tres cifra");
        }else if(x>=1000 && x<10000){
            System.out.println("El número "+x+" tiene cuatro cifra");
        }else{
            System.out.println("El número "+x+" tiene cinco cifra");
        }
    }
}
