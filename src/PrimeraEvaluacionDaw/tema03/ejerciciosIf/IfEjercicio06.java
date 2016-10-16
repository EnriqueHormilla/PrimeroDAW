
package Tema03.EjerciciosIf;

import java.util.Scanner;

public class IfEjercicio06 {
    public static void main(String[] args) {
        //Declarar variables
        int x,y,comprobante;
        
        //Pedir datos
        Scanner s=new Scanner(System.in);
        System.out.print("Número 1: ");
        x=s.nextInt();
        System.out.print("Número 2: ");
        y=s.nextInt();
        
        //Operaciones
        comprobante=x%y;
        
        //Mostrar resultado
        System.out.println("------------");
        if(comprobante==0){
            System.out.println("El número "+x+" es multimplo de "+y);
        }else 
            System.out.println("El número "+x+" no es multiplo de "+y);
    }
}
