
package Tema03.EjerciciosIf;

import java.util.Scanner;

public class IfEjercicio04 {
    public static void main(String[] args) {
        //Declarar variables
        int x,y;
        
        //Pedir datos
        Scanner s=new Scanner(System.in);
        System.out.print("Número 1: ");
        x=s.nextInt();
        System.out.print("Número 2: ");
        y=s.nextInt();
        
        //Mostrar resultado
        if(x==y){
            System.out.println("Los dos número son iguales");
        }else if(x>y){
            System.out.println(x+" y "+y);
        }else{
            System.out.println(y+" y "+x);
        }
    }
}
