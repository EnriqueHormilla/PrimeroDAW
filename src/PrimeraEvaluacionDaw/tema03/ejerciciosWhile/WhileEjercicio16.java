
package Tema03.EjerciciosWhile;

import java.util.Scanner;

public class WhileEjercicio16 {
    public static void main(String[] args) {
        //Declaracion de variables
        int nota=0, contaSuspensos=0, contaCondicionales=0, contaAprobados=0;
        
        //Contador de notas
        for(int i=1;i<=6;i++){
            Scanner s=new Scanner(System.in);
            System.out.print("Nota alumno: ");
            nota=s.nextInt();   //Pedir notas de los alumnos
                
            if(nota<4){     //Cuenta los alumnos que tiene la nota menor que 4
                contaSuspensos++;
            }
            if(nota==4){    //Cuenta los alumnos que tiene la nota igual a 4
                contaCondicionales++;
            }
            if(nota>=5){    //Cuenta los alumnos que tiene la nota igual o mayor que 5
                contaAprobados++;
            }
        }
        
        //Muestra los resultados
        System.out.println("---------");
        System.out.println("Alumnos suspensos: "+contaSuspensos);
        System.out.println("Alumnos condicionados: "+contaCondicionales);
        System.out.println("Alumnos aprobados: "+contaAprobados);
    }
}
