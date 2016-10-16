
package Tema03.EjerciciosWhile;

import java.util.Scanner;

public class WhileEjercicio13 {
    public static void main(String[] args) {
        //Declarar variables
        int contSueldos=1, n, sumaSueldos=0, sueldosMayores=0;
        
        //Introducir sueldos de los trabajadores
        while(contSueldos<=10){
            Scanner s=new Scanner(System.in);
            System.out.print("Sueldo "+contSueldos+": ");
            n=s.nextInt();
            if(n>1000){
                sueldosMayores++;
            }
            sumaSueldos+=n;
            contSueldos++;
        }
        
        //Mostrar resultado 
        System.out.println("---------------");
        System.out.println("Suma todos los sueldos: "+sumaSueldos);
        System.out.println("Sueldos mayores de 1000€: "+sueldosMayores);
    }
}
