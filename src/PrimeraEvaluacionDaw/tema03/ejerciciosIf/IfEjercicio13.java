
package Tema03.EjerciciosIf;

import java.util.Scanner;

public class IfEjercicio13 {
    public static void main(String[] args) {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.print("Edad: ");
        x=s.nextInt();
        if(x<0){
            System.out.println("No es una edad correcta");
        }else{
            if(x>=0 && x<18){
                System.out.println("Eres menor de edad");
            }else if(x==18){
                System.out.println("Eres mayor de edad");
            }else if(x>18 && x<=65){
                System.out.println("Eres un adulto");
            }else{
                System.out.println("Eres un abuelito");
            }
        }
    }
}
