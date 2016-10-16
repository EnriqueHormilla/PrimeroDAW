
package Tema03.EjerciciosWhile;

import java.util.Scanner;

public class WhileEjercicio15 {
    public static void main(String[] args) {
        //Declarar variables
        int numero;
        
        //Pedir número, si el numero es menor que 0 o mayor que 10, se repetira el bucle
        do{
            Scanner s=new Scanner(System.in);
            System.out.print("Numero entre 0 y 10: ");
            numero=s.nextInt();
        }while(numero<0 || numero>10);
        
        System.out.println("---------");
        System.out.println("Tabla de multiplicar de "+numero);
        
        //Muestra la tabla de multiplicar
        for(int i=1;i<=10;i++){
            System.out.println(numero+"*"+i+"="+(i*numero));
        }
    }
}
