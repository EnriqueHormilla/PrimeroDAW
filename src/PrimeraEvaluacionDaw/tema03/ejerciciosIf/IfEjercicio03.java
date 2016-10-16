
package Tema03.EjerciciosIf;

import java.util.Scanner;

public class IfEjercicio03 {
    public static void main(String[] args) {
        //Declarar variables
        int x,resultado;
        
        //Pedir datos
        Scanner s=new Scanner(System.in);
        System.out.print("Número: ");
        x=s.nextInt();
        
        //Realizar operaciones
        resultado=x%2;
        
        //Mostrar resultado
        System.out.println("------------");
        if(resultado==0){
            System.out.println("El número "+x+" es par");
        }else{
            System.out.println("El número "+x+" es impar");
        }
    }
}
