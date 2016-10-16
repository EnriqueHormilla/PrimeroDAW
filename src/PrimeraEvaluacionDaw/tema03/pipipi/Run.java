/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tema03.PIPIPI;

import java.util.Scanner;

/**
 * Ejercico del Tema 3 Ejercicio pipipi.pdf
 * @author Enrique
 */
public class Run {
    public static void main(String[] args) {
        int dias,emisoras;
        int diasTotales = 0,horasTotales = 0,minutosTotales,segundosTotales,pitidosTotales;                
        //Pedir dias y emisora, si son igual o menor a 0 no continues.
        do{
            Scanner d =new Scanner(System.in);
            Scanner e =new Scanner(System.in);
            System.out.print("Numeros de dias :");
            dias=d.nextInt();
            System.out.print("Numero de emisoras :");
            emisoras=e.nextInt();
            if((emisoras>0) && (dias>0)){
                pitidosTotales=dias*emisoras*24*6;            
                minutosTotales=pitidosTotales/60;
                segundosTotales=pitidosTotales%60;
                if(minutosTotales>=60){
                    horasTotales=minutosTotales/60;
                    minutosTotales=minutosTotales%60;
                }
                if(horasTotales>=24){
                    diasTotales=horasTotales/24;
                    horasTotales=horasTotales%24;
                }
                if(diasTotales>=1000){                
                } 
                if(diasTotales<10){
                    System.out.print("0"+diasTotales);
                }else{
                    System.out.print(diasTotales);
                }
                System.out.print(":");
                if(horasTotales<10){
                   System.out.print("0"+horasTotales);
                }else{
                    System.out.print(horasTotales);
                }
                System.out.print(":");
                if(minutosTotales<10){
                  System.out.print("0"+minutosTotales);
                }else{
                  System.out.print(minutosTotales);
                }
                System.out.print(":");
                if(segundosTotales<10){
                  System.out.print("0"+segundosTotales);
                }else{
                  System.out.print(segundosTotales);
                }
                  System.out.println();
            }           
          //  System.out.println(diasTotales+":"+horasTotales+":"+minutosTotales+":"+segundosTotales);
//             System.out.println("dias totales :"+diasTotales);
//             System.out.println("horasTotales totales :"+horasTotales);
//             System.out.println("minutosTotales :"+minutosTotales);
//             System.out.println("segundosTotales :"+segundosTotales);
//             System.out.println("pitidosTotales :"+pitidosTotales);             
        }while((emisoras>0) && (dias>0));
            System.out.println("Lo sentimos, ejecute de nuevo el programa hay un valor igual o menor a 0");   
    }
}
    
