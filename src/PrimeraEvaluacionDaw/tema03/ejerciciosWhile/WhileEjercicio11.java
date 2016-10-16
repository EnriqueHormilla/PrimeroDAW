
package Tema03.EjerciciosWhile;

import java.util.Scanner;

public class WhileEjercicio11 {
    public static void main(String[] args) {
        //Declarar variables
        long cont=1;
        int n;
        
        //Pide el número al usuario y mientras sea negativo no te deja continuar
        do{
            Scanner s=new Scanner(System.in);
            System.out.print("Número: ");
            n=s.nextInt();
        }while(n<0);
        
        //Calcular el factorial del número
        while(n!=0){
            cont*=n;
            n--;
        }
        
        //Mostrar el resultado
        System.out.println("------------");
        System.out.println("Factorial: "+cont);
    }
}
