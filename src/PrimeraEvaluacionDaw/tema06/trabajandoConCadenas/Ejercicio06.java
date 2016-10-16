/*
Realizar un nuevo método que dado dos Strings con números enteros y positivos,
retorne un String con una mezcla de la forma: el 1o de A, 1o de B, el 2o de A, el 2o 
de B etc. (suponemos que el tamaño de ambos es el mismo, aunque será 
necesario comprobarlo)  
 */
package tema06.trabajandoConCadenas;

public class Ejercicio06 {
    
    public static String ejercicio06(String s1,String s2){
       StringBuilder sb = new StringBuilder("");
        // Comprobar que el tamaño de las dos cadenas es el mismo
        if (s1.length() != s2.length()) {
        System.out.println("El tamño debe ser el mismo");
        return null;
        } 
        // Comprobar que las cadenas tiernen enteros + 0
        for (int i = 0; i < s1.length(); i++) {
        if (s1.charAt(i)<'0' || s1.charAt(i)>'9' || s2.charAt(i)<'0' || s2.charAt(i)>'9') {
        System.out.println("Las cadenas deben tener numeros enteros + o 0");
        return null;
        }
        }
        // Hacer la mezcla 
        for (int i = 0; i < s1.length(); i++) {
        sb.append(s1.charAt(i));
        sb.append(s2.charAt(i));
        }
        return sb.toString();

        } 
}
