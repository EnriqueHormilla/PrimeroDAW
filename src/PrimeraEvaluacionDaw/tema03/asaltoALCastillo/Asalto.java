/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema03.AsaltoALCastillo;

import java.util.Scanner;

/**
 *
 * @author Enrique
 */
public class Asalto {
    public static void main(String[] args) {
       // Scanner s = new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        int n ;       
        int resto=0;
        int num_posibilidades=0;
        do{
          System.out.print("Su numero: ");
          n =s.nextInt();
          if(n == 0){
              break;
              
          }else if (n<0){
              System.out.println("Has introducido un número incorrecto");
          }  
        
          for (int i=1;i<n;i++){
             resto=n%i;
            if(resto==0){
                num_posibilidades++;
            }          
          }
          System.out.println("Su numero de posibilidades es : "+num_posibilidades);
           num_posibilidades=0;
        }while(n!=0);
       
      
    }
    
}
