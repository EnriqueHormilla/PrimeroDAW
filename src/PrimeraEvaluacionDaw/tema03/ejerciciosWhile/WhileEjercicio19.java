
package Tema03.EjerciciosWhile;

import java.util.Scanner;

public class WhileEjercicio19 {
    public static void main(String[] args) {
        //Declarar variables
        int numero;
        
        //Pide y muestra si el numero introducido es multiplo de 3
        for(int i=1;i<=5;i++){
            Scanner s=new Scanner(System.in);
            System.out.print("Número: ");
            numero=s.nextInt();     //Pide el número por teclado
            
            if((numero%3)==0){  //Si al dividir por 3 el resto es 0, es multiplo de 3
                System.out.println("El número "+numero+" es multiplo de 3");
            }else{      //Si no es así, no es multiplo de 3
                System.out.println("El número "+numero+" no es multiplo de 3");
            }
        }
    }
}
