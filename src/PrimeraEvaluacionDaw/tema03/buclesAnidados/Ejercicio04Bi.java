
package tema03.buclesAnidados;

import java.util.Scanner;

public class Ejercicio04Bi {
    public static void main(String[] args) {
        //Declarar variables
        int n;
        Scanner s=new Scanner(System.in);
        
        //Pedir datos al usuario
        do{
            System.out.print("Número: ");
            n=s.nextInt();
        }while(n<0);
        
        //Mostrar cuadrado
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //Si la fila es la primera o la última, y la columna es la primera o la última
                //se hacen asteriscos
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("* ");
                //Sino, se crean espacios
                }else{
                    System.out.print("  ");
                }
            }
            //Salta a la siguiente linea
            System.out.println();
        }
    }
}
