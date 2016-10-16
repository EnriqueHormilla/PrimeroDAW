
package Tema03.EjerciciosIf;

import java.util.Scanner;

public class IfEjercicio14 {
    public static void main(String[] args) {
        //Declarar variables
        int dia,mes,año;
        
        //Pedir al usuario el dia
        Scanner s=new Scanner(System.in);
        System.out.print("Día: ");
        dia=s.nextInt();
        
        
        if(dia<1 || dia>31){    //Si introduce mas de 31 dias o menos de 1 dia, le saldrá que coloque uno correcto
            System.out.println("Día incorrecto");
        }else{
            //Una vez que este el dia correcto, introduce el mes
            System.out.print("Mes: ");
            mes=s.nextInt();
            if(mes<1 || mes>12){    //Debe introducir un mes correcto, ni menos de 1 ni mayor de 12
                System.out.println("Mes incorrecto");
            }else{
                //Comprueba que los dias con los meses. Ej: Febrero no puede tener mas de 28 dias o Abril mas de 30...
                if(mes==2 && dia>28){
                    System.out.println("Febrero no tiene mas de 28 días");
                }else if(mes==4 && dia>30){
                    System.out.println("Abril no tiene mas de 30 dias");
                }else if(mes==6 && dia>30){
                    System.out.println("Abril no tiene mas de 30 dias");
                }else if(mes==9 && dia>30){
                    System.out.println("Abril no tiene mas de 30 dias");
                }else if(mes==11 && dia>30){
                    System.out.println("Abril no tiene mas de 30 dias");
                }else{
                    //Introducir un año
                    System.out.print("Año: ");
                    año=s.nextInt();
                    
                    //Muestra el resultado por pantalla
                    System.out.println("--------");
                    if(mes==1){System.out.println(dia+" de Enero de "+año);}
                    if(mes==2){System.out.println(dia+" de Febrero de "+año);}
                    if(mes==3){System.out.println(dia+" de Marzo de "+año);}
                    if(mes==4){System.out.println(dia+" de Abril de "+año);}
                    if(mes==5){System.out.println(dia+" de Mayo de "+año);}
                    if(mes==6){System.out.println(dia+" de Junio de "+año);}
                    if(mes==7){System.out.println(dia+" de Julio de "+año);}
                    if(mes==8){System.out.println(dia+" de Agosto de "+año);}
                    if(mes==9){System.out.println(dia+" de Septiembre de "+año);}
                    if(mes==10){System.out.println(dia+" de Octubre de "+año);}
                    if(mes==11){System.out.println(dia+" de Noviembre de "+año);}
                    if(mes==12){System.out.println(dia+" de Diciembre de "+año);}
                }                
            }
        }
    }
}
