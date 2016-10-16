
package Tema03.EjerciciosIf;

import java.util.Scanner;

public class IfEjercicio17 {
    public static void main(String[] args) {
        //Declarar variables
        int dia1, dia2, mes1, mes2, año1, año2;
        
        Scanner s=new Scanner(System.in);
        System.out.print("Día 1: ");
        dia1=s.nextInt();
        
        System.out.print("Mes 1: ");
        mes1=s.nextInt();
        
        System.out.print("Año 1: ");
        año1=s.nextInt();
        
        System.out.println("---------");
        
        System.out.print("Día 2: ");
        dia2=s.nextInt();
        
        System.out.print("Mes 2: ");
        mes2=s.nextInt();
        
        System.out.print("Año 3: ");
        año2=s.nextInt();
        
        if(mes1==mes2 && año1==año2){
            System.out.println("Hay "+(dia2-dia1)+" dias de diferencia");
        }
    }
}
