
package Tema03.EjerciciosIf;

import java.util.Scanner;

public class IfEjercicio02 {
    public static void main(String[] args) {
        //Declarar variables
        int x,y;
        
        //Pedir datos
        Scanner s=new Scanner(System.in);
        System.out.print("Número1: ");
        x=s.nextInt();
        System.out.print("Número2: ");
        y=s.nextInt();
        
        //Mostrar resultados
        System.out.println("------------");
        if(x>y){
            System.out.println(x+" y "+y);
        }else{
            System.out.println(y+" y "+x);
        }
    }
}
