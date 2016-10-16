
package Tema03.EjerciciosIf;

import java.util.Scanner;

public class IfEjercicio10 {
    public static void main(String[] args) {
        //Declarar variables
        int dia, mes, año;
        
        Scanner s=new Scanner(System.in);
        System.out.print("Día: ");      //Pide el dia
        dia=s.nextInt();
        if(dia<1 || dia>31){   //Comprueba que el dia, si es menor de 1 o mayor de 31 da error
            System.out.println("Has introducido un día incorrecto");
        }else{
            System.out.print("Mes: ");
            mes=s.nextInt();    //Pide el dia
            if(mes<1 || mes>12){    //Comprueba que no sea mayor de 12 o menor de 1, sino da error
                System.out.println("Has introducido un mes incorrecto");
            }else{
                //Comprueba que algunos meses no tengan mas dias de la cuenta. Ej: Abril no tiene dia 31
                if(mes==2 && dia>28){System.out.println("Febrero no tiene mas de 28 dias");}
                else if(mes==4 && dia>30){System.out.println("Abril no tiene mas de 30 dias");}
                else if(mes==6 && dia>30){System.out.println("Junio no tiene mas de 30 dias");}
                else if(mes==9 && dia>30){System.out.println("Septiembre no tiene mas de 30 dias");}
                else if(mes==11 && dia>30){System.out.println("Noviembre no tiene mas de 30 dias");}
                else{
                    System.out.print("Año: ");
                    año=s.nextInt();    //Introduce el año
                    
                    if(año<0){
                        //Muestra el resultado de la fecha, si el año es anterior a cristo
                        año=año*(-1);
                        System.out.println("--------------");
                        if(mes==1){System.out.println(dia+" de Enero de "+año+" a.C.");}
                        if(mes==2){System.out.println(dia+" de Febrero de "+año+" a.C.");}
                        if(mes==3){System.out.println(dia+" de Marzo de "+año+" a.C.");}
                        if(mes==4){System.out.println(dia+" de Abril de "+año+" a.C.");}
                        if(mes==5){System.out.println(dia+" de Mayo de "+año+" a.C.");}
                        if(mes==6){System.out.println(dia+" de Junio de "+año+" a.C.");}
                        if(mes==7){System.out.println(dia+" de Julio de "+año+" a.C.");}
                        if(mes==8){System.out.println(dia+" de Agosto de "+año+" a.C.");}
                        if(mes==9){System.out.println(dia+" de Septiembre de "+año+" a.C.");}
                        if(mes==10){System.out.println(dia+" de Octubre de "+año+" a.C.");}
                        if(mes==11){System.out.println(dia+" de Noviembre de "+año+" a.C.");}
                        if(mes==12){System.out.println(dia+" de Diciembre de "+año+" a.C.");}
                    }else{
                        //Muestra el resultado de la fecha, si el año es posterior a cristo
                        System.out.println("--------------");
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
}
