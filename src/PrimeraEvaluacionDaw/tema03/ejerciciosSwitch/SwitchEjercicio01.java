
package Tema03.EjerciciosSwitch;

import java.util.Scanner;

public class SwitchEjercicio01 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x;
        System.out.print("Nota: ");
        x=s.nextInt();
        System.out.println("----------");
        switch(x){
            case 0:
                System.out.println("MUY DEFICIENTE");
                break;
            case 1:
                System.out.println("INSUFICIENTE");
                break;
            case 2:
                System.out.println("INSUFICIENTE");
                break;
            case 3:
                System.out.println("INSUFICIENTE");
                break;
            case 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7:
                System.out.println("NOTABLE");
                break;
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
                System.out.println("SOBRESALIENTE");
                break;
            case 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("No es una nota correcta");
                break;
        }
    }
}
