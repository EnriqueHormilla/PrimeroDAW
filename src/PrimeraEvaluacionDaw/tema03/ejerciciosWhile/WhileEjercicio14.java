
package Tema03.EjerciciosWhile;

import java.util.Scanner;

public class WhileEjercicio14 {
    public static void main(String[] args) {
        //Declarar variables
        int edad, numAlumnos=1, contaEdad=0, contaAltura=0;
        double altura,  mediaAltura=0, mediaEdad=0;
        
        //Entra en un bucle para pedir los datos de cada alumno
        for(int i=1;i<=5;i++){
            //Pide los datos de los 5 alumnos
            Scanner s=new Scanner(System.in);
            System.out.println("Alumno "+numAlumnos);
            System.out.print("Edad: ");
            edad=s.nextInt();       //Pide la edad
            System.out.print("Altura: ");
            altura=s.nextDouble();  //Pide la altura
            System.out.println("----------");
            
            //Si la edad es mayor de 18, los va contando
            if(edad>18){
                contaEdad++;
            }
            
            //Si la altura es mayor de 1,75, los va contando
            if(altura>1.75){
                contaAltura++;
            }
            mediaEdad+=edad;    //Suma las edades de todos los alumnos
            mediaAltura+=altura;    //Suma la altura de todos los alumnos
            numAlumnos++;
        }
        
        //Muestra los resultados finales
        System.out.println("----------");
        System.out.println("Alumnos mayores de 18: "+contaEdad);
        System.out.println("Alumno mas altos de 1,75: "+contaAltura);
        System.out.printf("Media edad: %.2f", mediaEdad/5.0);
        System.out.printf("\nMedia altura: %.2f", mediaAltura/5.0);
        System.out.println();
    }
}
