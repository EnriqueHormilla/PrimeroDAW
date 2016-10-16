/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrique.sources;

/**
 *
 * @author Enrique
 */
public class UtilidadesInt {
    public static boolean numeroEntre(int numero ,int min,int max){  
     
        if((numero>=min)&&(numero<=max)){
            return true;
        }else{
            System.out.println("El numero "+numero+" introducido no esta en el rango de entre "+min+" y "+max);
            return false;
        }
       
    } 
    public static boolean numeroMayorIgual(int numero ,int numeroComparacion ){ 
        System.out.println("El numero "+numero+" introducido no es mayor o igual a "+numeroComparacion);
        return numero>=numeroComparacion;
    }
    public static boolean numeroMenorIgual(int numero ,int numeroComparacion ){ 
         System.out.println("El numero "+numero+" introducido no es menor o igual a "+numeroComparacion);
        return numero<=numeroComparacion;
    }
    public static int TransformarPositivo(int numero){
        return Math.abs(numero);
    }
    public static void main(String[] args) {
        System.out.println( "-->"+numeroEntre(-1, 1, 8));
    }
}
