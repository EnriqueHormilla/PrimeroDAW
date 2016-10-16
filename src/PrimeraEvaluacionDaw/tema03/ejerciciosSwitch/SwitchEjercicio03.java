
package Tema03.EjerciciosSwitch;

import java.util.Scanner;

public class SwitchEjercicio03 {
    public static void main(String[] args) {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.print("Número: ");
        x=s.nextInt();
        switch(x){
            case 0:
                System.out.println("Cero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;
        }
    }
}
