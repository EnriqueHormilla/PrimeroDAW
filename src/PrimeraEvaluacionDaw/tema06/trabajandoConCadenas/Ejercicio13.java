/*
13.Realiza una comprobación del rendimiento de las clases StringBuffer y
StringBuilder para un programa en Java que concatene (método append) en una 
cadena inicialmente vacía un millón de string con la palabra “hola”. Calcula y 
muestra por pantalla cuando tardan ambas clases en realizar esa concatenación.
 */
package Tema06.TrabajandoConCadenas;

public class Ejercicio13 {
    
    public static void ejercicio13(String s1,int contador){
        StringBuffer sBuffer=new StringBuffer("");
        StringBuilder sBuilder=new StringBuilder("");
        double inicio= System.currentTimeMillis();       
        for (int i = 0; i <= contador; i++) {
            sBuffer.append(s1);
        }
        double intermedio= System.currentTimeMillis();  
        double resultadoIntermedio=(intermedio-inicio)/100;//Da segundos
        for (int x = 0; x < contador; x++) {
            sBuilder.append(s1);            
        }
        double fin= System.currentTimeMillis();  
        double resultadoFinal=(fin-inicio)/100;//Da segundos
        System.out.println("El tiempo tardado en ejecutar la primera instrucciones es:"+resultadoIntermedio+" segundos");
        System.out.println("El tiempo tardado en ejecutar ambas instrucciones es:"+resultadoFinal+" segundos");
        
    }

    
}
