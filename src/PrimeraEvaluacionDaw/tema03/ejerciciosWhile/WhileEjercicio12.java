
package Tema03.EjerciciosWhile;

import java.util.Scanner;

public class WhileEjercicio12 {
    public static void main(String[] args) {
        //Declarar variables
        int cont=10;
        int n;
        int contPositivos=0;
        int contNegativos=0;
        int contCeros=0;
        
        //Cuenta el número de veces
        while(cont!=0){
            Scanner s=new Scanner(System.in);
            System.out.print("Número: ");
            n=s.nextInt();
            if(n>0){ //Numero de veces que aparece un número positivo
                contPositivos++;
            }else if(n<0){  //Numero de veces que aparece un número negativo
                contNegativos++;
            }else{  //Numero de veces que aparece un cero
                contCeros++;
            }
            cont--;
        }
        
        //Muestra el resultado de
        System.out.println("-------");
        System.out.println("Números positivos: "+contPositivos);
        System.out.println("Números negativos: "+contNegativos);
        System.out.println("Ceros: "+contCeros);
    }
}
