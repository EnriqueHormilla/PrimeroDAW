/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
a contador
b min
c max

 */
package tema07.arrays;
import enrique.sources.*;

public class Ejercicio01 {
     public static void main(String[] args) {
        int min,max,count,elMasGrande=0,elMasPequenio=0;
        float sumatorio=0,media=0;
         System.out.println("Count");
         count=PedirValores.pedirInt();
         System.out.println("Minimo");
         min=PedirValores.pedirInt();
         System.out.println("Maximo");
         max=PedirValores.pedirInt();
         elMasPequenio=max;
        float[ ] nombre = new float[count];
        UtilidadesArray.arrayInsertatAleatorio(nombre,min, max); 

        for (int i = 0; i < nombre.length; i++) {
            if(elMasGrande<nombre[i]){
                elMasGrande=(int) nombre[i];
            }
            if(elMasPequenio>nombre[i]){
                elMasPequenio=(int) nombre[i];
            }
           sumatorio+=nombre[i];  
           media++;
        }
        System.out.println("El mas Grande es --->"+UtilidadesArray.calcularMax(nombre));
        System.out.println("El mas Pequeño es --->"+UtilidadesArray.calcularMin(nombre));
        System.out.println("-----");
        System.out.println("la media es -->"+count+"/"+media+"="+count/media);
    }
    
}
