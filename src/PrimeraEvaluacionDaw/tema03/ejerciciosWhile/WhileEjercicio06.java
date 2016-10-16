
package Tema03.EjerciciosWhile;

import java.util.Scanner;

public class WhileEjercicio06 {
    public static void main(String[] args) {
        int x=-1;
        int sumaPares=0;
        int sumaImpares=0;
        int calculo;
        
        while(x!=0){
            Scanner s=new Scanner(System.in);
            System.out.print("Número: ");
            x=s.nextInt();
            calculo=x%2;
            if(x!=0){
                if(calculo==0){
                    sumaPares++;
                }else{
                    sumaImpares++;
                }
            }
        }
        System.out.println("---------------");
        System.out.println("Pares: "+sumaPares);
        System.out.println("Impares: "+sumaImpares);
    }
}
