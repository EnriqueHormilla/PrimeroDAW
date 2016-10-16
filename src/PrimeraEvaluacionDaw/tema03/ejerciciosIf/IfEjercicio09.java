
package Tema03.EjerciciosIf;

import java.util.Scanner;

public class IfEjercicio09 {
    public static void main(String[] args) {
        //Declarar variables
        int x;
        int cap2a,cap2b;
        int cap3a,cap3c;
        int cap4a,cap4b,cap4c,cap4d;
        
        //Pedir datos
        Scanner s=new Scanner(System.in);
        System.out.print("Introduce número entre 0 y 9999: ");
        x=s.nextInt();
        
        //Realizar calculos
        cap2a=x/10;
        cap2b=x%10;
        cap3a=x/100;
        cap3c=(x%10)%10;
        cap4a=x/1000;
        cap4b=(x/100)%10;
        cap4c=((x/10)%100)%10;
        cap4d=((x%1000)%100)%10;
        
        //Mostrar resultados
        if(x<0 || x>9999){
            System.out.println("El número esta fuera del rango");
        }else if(x>=0 && x<10){
            System.out.println("El número "+x+" es capicúa");
        }else if(x>=10 && x<100){
            if(cap2a==cap2b){
                System.out.println("El número "+x+" es capicúa");
            }else{
                System.out.println("El número "+x+" no es capicúa");
            }
        }else if(x>=100 && x<1000){
            if(cap3a==cap3c){
                System.out.println("El número "+x+" es capicúa");
            }else{
                System.out.println("El número "+x+" no es capicúa");
            }
        }else{
            if(cap4a==cap4d && cap4b==cap4c){
                System.out.println("El número "+x+" es capicúa");
            }else{
                System.out.println("El número "+x+" no es capicúa");
            }
        }
    }
}
