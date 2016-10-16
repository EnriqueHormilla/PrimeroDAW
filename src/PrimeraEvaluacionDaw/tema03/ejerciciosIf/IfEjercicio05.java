
package Tema03.EjerciciosIf;

import java.util.Scanner;

public class IfEjercicio05 {
    public static void main(String[] args) {
        //Declarar variables
        int x;
        
        //Pedir datos
        Scanner s=new Scanner(System.in);
        System.out.print("Número: ");
        x=s.nextInt();
        
        //Mostrar resultado
        System.out.println("-------------");
        if(x<0){
            System.out.println("El número "+x+" es negativo");
        }else if(x==0){
            System.out.println("El número "+x+" es igual a 0");
        }else{
            System.out.println("El número "+x+" es positivo");
        }
    }
}
