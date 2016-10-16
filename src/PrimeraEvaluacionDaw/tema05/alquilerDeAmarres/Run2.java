
package Tema05.AlquilerDeAmarres;

import java.util.Scanner;

public class Run2 {
    public static void main(String[] args) {
        String nombre, apellidos;
        int opc, dni;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Nombre: ");
        nombre = s.nextLine();
        System.out.print("Apellidos: ");
        apellidos = s.nextLine();
        System.out.print("DNI: ");
        dni = s.nextInt();
        
        System.out.println("----------");
        System.out.println("Opciones: \n1)Veleros\n2)Deportivos\n3)Yates\n4)Otros");
        System.out.println("----------");
        
        do{
            System.out.print("Opción: ");
            opc = s.nextInt();
            System.out.println("----------");
        }while(opc<1 || opc>4);
        
        switch(opc){
            case 1:
                
        }
    }
}
