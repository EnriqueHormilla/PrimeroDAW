
package Tema03.EjerciciosWhile;

import java.util.Scanner;

public class WhileEjercicio17 {
    public static void main(String[] args) {
        int numeroSueldos, sueldo;
        
        Scanner s=new Scanner(System.in);
        System.out.print("Introduzca el número de sueldos: ");
        numeroSueldos=s.nextInt();
        
        for(int i=1;i<=numeroSueldos;i++){
            System.out.print("Sueldo "+i+": ");
            sueldo=s.nextInt();
        }
    }
}
