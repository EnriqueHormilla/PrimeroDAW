/*
Realizar un metodo que reciba una tabla o matriz 8x8 de tipo char 
y devuelva dicha tabla con 8 casillas con el caracter '*' el resto de casillas se rellenara con una 'a'

aaaaaaaa
aa*aa*aa
aaaa*aaa
*aaaaaaa
*a*aaaaa
a*aaaaaa
...
 */
package tema07.arraysMultidimensionales;
import enrique.sources.*;
/**
 *
 * @author VESPERTINO
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        char agua='-',barco='*';        
        char[][] mar = new char[8][8];
        int columnaMenor=0,columna,fila,columnaMayor=0;
        for (int i = 0; i < mar.length; i++) {            
            for (int j = 0; j < mar[i].length; j++) {
                mar[i][j]=agua;
            }            
        }
        
        
       
        for (int i = 0; i < 8; i++) {            
           
                fila=PedirValores.pedirAleatorioInt(0,7);
                columna=PedirValores.pedirAleatorioInt(0,7);
                if(columna>1){
                   columnaMenor=columna-1;  
                }
                if(columna<7){
                   columnaMayor=columna+1; 
                }
                if((mar[fila][columnaMenor]==agua)&&(mar[fila][columna]==agua)&&(mar[fila][columnaMayor]==agua)){                    
                    mar[fila][columna]=barco;
                }else{
                    i--;
                }
        }       
        // Mostrar la matriz

        for(int i=0; i<mar.length; i++) {
            for(int j=0; j<mar[i].length; j++){       
                System.out.print(mar[i][j] + " ");                
            }System.out.println();
        }        
    }
    
}
