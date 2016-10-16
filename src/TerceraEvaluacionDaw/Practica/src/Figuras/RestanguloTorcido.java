/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author VESPERTINO
 */
public class RestanguloTorcido {

    public RestanguloTorcido(int n) {
        llenar(' ', n-1);
        llenar('*', n);
        System.out.println();
        for (int i = n-2; i>0; i--) {
            llenar(' ', i);
            llenar('*',1);
            llenar(' ',n-2);
            llenar('*',1);
             System.out.println();
        }
        
        llenar('*', n);
        
    }
    public void llenar(char caracter,int numerVeces){
        for (int i = 0; i < numerVeces; i++) {
            System.out.print(caracter);            
        }
    }
    public static void main(String[] args) {
        RestanguloTorcido a=new RestanguloTorcido(8);
    }
}
