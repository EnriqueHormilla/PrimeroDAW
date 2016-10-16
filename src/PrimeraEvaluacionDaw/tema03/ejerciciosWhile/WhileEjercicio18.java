
package Tema03.EjerciciosWhile;

import java.util.Scanner;

public class WhileEjercicio18 {
    public static void main(String[] args) {
        //Declarar variables
        int nota, contaSuspensos=0;
        
        //Contador de suspensos
        for(int i=1;i<=5;i++){
            Scanner s=new Scanner(System.in);
            System.out.print("Nota "+i+": ");
            nota=s.nextInt();   //Introducir notas
            
            if(nota<5){     //Si la nota es menor que 5 las va contando
                contaSuspensos++;
            }
        }
        
        //Muestra la cantidad de notas suspensas que hay
        System.out.println("-------");
        System.out.println("Hay "+contaSuspensos+" suspensos");
    }
}
