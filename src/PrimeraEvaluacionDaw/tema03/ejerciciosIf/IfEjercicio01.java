
package Tema03.EjerciciosIf;

import java.util.Scanner;

public class IfEjercicio01 {
    public static void main(String[] args) {
        //Declarar variables
        float coeficiente,a,b,c,sol1,sol2;
        
        //Pedir datos
        Scanner s=new Scanner(System.in);
        System.out.print("A: ");
        a=s.nextFloat();
        System.out.print("B: ");
        b=s.nextFloat();
        System.out.print("C: ");
        c=s.nextFloat();
        
        //Realizar operaciones
        coeficiente=(float)(Math.pow(b,2)-(4*a*c));
        sol1=(float)(-b+(Math.sqrt(coeficiente)))/(2*a);
        sol2=(float)(-b-(Math.sqrt(coeficiente)))/(2*a);
        
        //Mostrar resultados
        System.out.println("-----------");
        if(coeficiente<0){
            System.out.println("No es una solución real");
        }else{
            System.out.printf("Solución 1ra. = %.2f\n",sol1);
            System.out.printf("Solución 2da. = %.2f\n",sol2);
        }
    }
}
