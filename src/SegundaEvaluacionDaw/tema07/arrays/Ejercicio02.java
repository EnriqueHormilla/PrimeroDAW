/*
Realizar un programa(Metodo) que calcule y guarde en un array de tamaño 6 ,seis numeros aleatorios de la primitiva entre 1-49 
posteriormente pide 6 numeros al usuario diferentes y sino pedir otra vez.
posteriormente cuanto numeros a acertado el usuario del sorteo
Un metodo que compruebe si dentro de un array tiene repetidos entre ellos
Podemos crear un array par ameter los 6 numeros que el usuario los mete.
array[6]
    [0]=10
    [1]=2
    [2]=49
    [3]=41
 */
package tema07.arrays;
import enrique.sources.*;
public class Ejercicio02 {
    public static void main(String[] args) {
        int[ ] arrayPedir = new int[6];
        int[ ] arrayQuiniela = new int[6];
        int aciertos=0;
        do {            
           for (int i = 0; i < 6; i++) {
                
                do {   
                   System.out.println("Inserte el numero "+i);
                   arrayPedir[i]=PedirValores.pedirInt();  
               }while (UtilidadesInt.numeroEntre( arrayPedir[i], 1, 49)==false);
                
               
            }           
        }while (!UtilidadesArray.comprobarIgual(arrayPedir));
        System.out.println("Perfecto ya estan todos tus datos");
        for (int i = 0; i < arrayQuiniela.length; i++) {
            arrayQuiniela[i]=PedirValores.pedirAleatorioInt(1, 49); 
            System.out.println( arrayQuiniela[i]);
        }
        aciertos=UtilidadesArray.compararEntreArray(arrayPedir,arrayQuiniela);
        if(aciertos>0){
            System.out.println("Ha acertado-->"+aciertos); 
        }else{
            System.out.println("Lo siento pero no ");
        }
        System.out.println("");
    }
    
    
}
