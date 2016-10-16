/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema02;

/**
 *
 * @author Enrique
 */
import java.util.Scanner;

public class Ficha {
    public static void main (String[] args){
        Scanner n=new Scanner (System.in);
        System.out.println("Dame tu nombre:");
        String nombre=n.nextLine();
        Scanner t=new Scanner (System.in);
        System.out.println("Dame por favor dame tu telefono");
        int telefono=t.nextInt();
        Scanner a=new Scanner (System.in);
        System.out.println("Dame tu apellido:");
        String apellidos=a.nextLine();
        Scanner e=new Scanner (System.in);
        System.out.println("dame tu edad");
        int edad=e.nextInt();      
        System.out.println("************************");
        System.out.println("* Nombre: "+nombre);
        System.out.println("* Apellidos: "+apellidos);
        System.out.println("* Edad: "+edad);
        System.out.println("* Teléfono: "+telefono);
        System.out.println("************************");
    }
            
}
