
package Tema03.EjerciciosSwitch;

import java.util.Scanner;

public class SwitchEjercicio02 {
    public static void main(String[] args) {
        //Declarar variables
        int n;
        
        //Pedir datos
        Scanner s=new Scanner(System.in);
        System.out.print("Número (-9999 y 9999): ");
        n=s.nextInt();
        System.out.println("---------");
        
        //Mostrar resultado
        if(n<-9999 || n>9999){
            System.out.println("Número fuera de rango");
        }else{
            if(n==0){
                System.out.println("Cero");
            }else if(n>-10 && n<10){
                if(n>-10 && n<0){
                    switch(n){
                        case -1:System.out.println("Menos uno");break;
                        case -2:System.out.println("Menos dos");break;
                        case -3:System.out.println("Menso tres");break;
                        case -4:System.out.println("Menos cuatro");break;
                        case -5:System.out.println("Menos cinco");break;
                        case -6:System.out.println("Menos seis");break;
                        case -7:System.out.println("Menos siete");break;
                        case -8:System.out.println("Menos ocho");break;
                        case -9:System.out.println("Menos nueve");break;
                    }
                }else{
                    switch(n){
                        case 1:System.out.println("Uno");break;
                        case 2:System.out.println("Dos");break;
                        case 3:System.out.println("Tres");break;
                        case 4:System.out.println("Cuatro");break;
                        case 5:System.out.println("Cinco");break;
                        case 6:System.out.println("Seis");break;
                        case 7:System.out.println("Siete");break;
                        case 8:System.out.println("Ocho");break;
                        case 9:System.out.println("Nueve");break;
                    }
                }
            }else if(n>-100 && n<=-10){
                if(n>-20 && n<=-10){
                    switch(n){
                        case -10:System.out.println("Menos diez");break;
                        case -11:System.out.println("Menos once");break;
                        case -12:System.out.println("Menos doce");break;
                        case -13:System.out.println("Menos trece");break;
                        case -14:System.out.println("Menos catorce");break;
                        case -15:System.out.println("Menos quince");break;
                        case -16:System.out.println("Menos dieciseis");break;
                        case -17:System.out.println("Menos diecisiete");break;
                        case -18:System.out.println("Menos dieciocho");break;
                        case -19:System.out.println("Menos diecinueve");break;
                    }
                }
            }
        }
    }
}
