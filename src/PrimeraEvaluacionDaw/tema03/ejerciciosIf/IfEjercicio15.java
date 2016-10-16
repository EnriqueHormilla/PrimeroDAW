
package Tema03.EjerciciosIf;

import java.util.Scanner;

public class IfEjercicio15 {
    public static void main(String[] args) {
        //Declarar variables
        int dia, mes, año;
        
        //Pedir dia al usuario
        Scanner s=new Scanner(System.in);
        System.out.print("Día: ");
        dia=s.nextInt();
        
        //Si el dia es mayor que 30 o menor que 1, sale un mensaje de incorrecto
        if(dia<1 || dia>30){
            System.out.println("Día incorrecto");
        }else{
            System.out.print("Mes: ");
            mes=s.nextInt();   //Introduce el mes
            if(mes<1 || mes>12){    //Si el mes es incorrecto, muestre un mensaje como tal
                System.out.println("Mes incorrecto");
            }else{
                System.out.print("Año: ");
                año=s.nextInt();    //Introduce el año   
                if(dia==30 && mes!=12){ //Si el dia es 30, pero el mes no es 12, se coloca el dia 1 y el mes siguiente
                    dia=1;
                    mes++;
                    System.out.println(dia+"-"+mes+"-"+año);
                }else if(dia==30 || mes==12){   //Si el dia es 30 y el mes es 12, se coloca el dia 1, el mes 1 y el año siquiente
                    dia=1;
                    mes=1;
                    año++;
                    System.out.println(dia+"-"+mes+"-"+año);
                }else{  //Si no se da el caso de las anteriores opciones, se coloca la fecha con el dia siguiente
                    System.out.println(dia+"-"+mes+"-"+año);
                }
            }
        }
    }
}
