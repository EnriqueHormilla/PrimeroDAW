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

public class Ejercico6 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor digame su edad:");                 
        int edad=sc.nextInt();
        System.out.println("pues aparentas como unos:"+(edad-10));  
    }
    
}
