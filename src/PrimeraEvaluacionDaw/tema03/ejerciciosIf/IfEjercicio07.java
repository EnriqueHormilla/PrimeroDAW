
package Tema03.EjerciciosIf;

import java.util.Scanner;

public class IfEjercicio07 {
    public static void main(String[] args) {
        //Declarar variables
        int x,y,z;
        
        //Pedir datos
        Scanner s=new Scanner(System.in);
        System.out.print("Número 1: ");
        x=s.nextInt();
        System.out.print("Número 2: ");
        y=s.nextInt();
        System.out.print("Número 3: ");
        z=s.nextInt();
        
        //Mostrar resultado
        if(x>y && x>z){
            if(y>z){
                System.out.println(x+" - "+y+" - "+z);
            }else{
                System.out.println(x+" - "+z+" - "+y);
            } 
        }else if(y>x && y>z){
            if(x>z){
                System.out.println(y+" - "+x+" - "+z);
            }else{
                System.out.println(y+" - "+z+" - "+x);
            }
        }else if(z>x && z>y){
            if(x>y){
                System.out.println(z+" - "+x+" - "+y);
            }else{
                System.out.println(z+" - "+y+" - "+x);
            }
        }
    }
}
