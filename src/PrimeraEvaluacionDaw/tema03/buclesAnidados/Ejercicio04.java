
package tema03.buclesAnidados;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        //Declarar variables
        int n;
        Scanner s=new Scanner(System.in);
        
        //Introduce un número, si es menor que cero se repetira el bucle hasta que
        //introduzca un número correcto
        do{
            System.out.print("Número: ");
            n=s.nextInt();
            if(n<0){
                //Además muestra un mensaje que se lo recuerda
                System.out.println("No es un número correcto");
            }
        }while(n<0);
        
        System.out.println("----------");
        
        //Muestra el resultado del cuadrado en asteriscos
        for(int i=0;i<n;i++){ // Muestra las distintas filas
            for(int j=0;j<n;j++){
                System.out.print("*"); // Mostramos ancho (horizontal)
            }
            System.out.println();
        }
    }
}
