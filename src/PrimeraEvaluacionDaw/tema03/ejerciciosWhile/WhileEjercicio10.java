
package Tema03.EjerciciosWhile;

import java.util.Scanner;

public class WhileEjercicio10 {
    public static void main(String[] args) {
        int contador=15;
        int n;
        int contSuma=0;
        int contMedia=15;
        double media;
        
        while(contador!=0){
            Scanner s=new Scanner(System.in);
            n=s.nextInt();
            if(n==0){
                contMedia--;
            }
            contSuma+=n;
            contador--;
        }
        
        media=contSuma/contMedia;
        System.out.println("La suma de todos los dígitos es: "+contSuma);
        System.out.println(contMedia);
        System.out.printf("La media es: %.2f",media);
    }
}
