
package Tema04.Mates;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        //Declaramos variables
        int n;
        Scanner s = new Scanner(System.in);
        
        //Pedimos al usuario que nos introduzca un número
        System.out.print("Número: ");
        n = s.nextInt();
        
        System.out.println("---------");
        
        //Inicializamos la clase Mates
        Mates mates = new Mates(n);
        
        //Llamamos al metodo "esPerfecto()" 
        if(mates.esPerfecto() == true){
            //Si es true, mostrara el mensaje siguiente
            System.out.println("¿El número "+n+" es Perfecto?: VERDAD");
        }else{
            //Si no es asi, mostrara el siguiente
            System.out.println("¿El número "+n+" es Perfecto?: FALSO");
        }
        
        //Llamamos al metodo "esPrimo()" 
        if(mates.esPrimo() == true){
            //Si es true, mostrara el mensaje siguiente
            System.out.println("¿El número "+n+" es Primo?: VERDAD");
        }else{
            //Si no es asi, mostrara el siguiente
            System.out.println("¿El número "+n+" es Primo?: FALSO");
        }
        
        //Inicializamos "listaPerfectos()"
        mates.listaPerfectos();
        
        //Llamamos al metodo "listaNumeros()"
        mates.listaNúmeros();
        
        //Llamamos al metodo "sumaCifras()", este metodo nos indica la suma de todos los números desde 0 hasta el número indicado
        System.out.println("La suma desdes 0 hasta "+n+" es: "+mates.sumaCifras());
        
        //Llamamos al metodo "numDivisores()", nos indicará la cantidad de numeros divisores entre el número inicializado
        System.out.println("El número "+n+" tiene "+mates.numeroDivisores()+" divisores");
        
        //Inicializamos el metodo "base2()" y este nos dara el número en binario
        System.out.println("El número "+n+" en Binario: "+mates.base2());
    }
}
