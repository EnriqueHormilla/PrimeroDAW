/*
Crea un método que dado un String leído por teclado retorna un string convertido
en contraseña con las siguientes modificaciones (tanto mayúsculas como 
minúsculas).
◦ A → @, E → 3, I → 1, O → 0 y U → \ /
 */
package tema06.trabajandoConCadenas;

public class Ejercicio04 {
    public static String ejercicio04(String cadenaOld){
        String cadenaNew="";
       // public String replace(char oldChar, char newChar);
        cadenaNew=cadenaOld.replace('a','@');
        cadenaNew=cadenaNew.replace('e','3');
        cadenaNew=cadenaNew.replace('i','1');
        cadenaNew=cadenaNew.replace('o','0');
        //cadenaNew=cadenaNew.replace('u','\');
        return cadenaNew;
    } 
    
}
