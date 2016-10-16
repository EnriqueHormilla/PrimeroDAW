
package Tema03.EjerciciosWhile;

import java.util.Scanner;

public class WhileEjercicio08 {
    public static void main(String[] args) {
        int n=0;
        int contNumeros=0;
        
        while(n>=0){
            Scanner s=new Scanner(System.in);
            System.out.print("Número: ");
            n=s.nextInt();
            if(n>=0){
                contNumeros++;
            }
        }
        System.out.println("Has introducido: "+contNumeros+" números");
    }
}
