/*
14.Dado un texto leído por pantalla desde la clase Main realiza un método que retorne
un entero indicando el número de palabras, vocales, consonantes y símbolos que 
contiene.
 */
package tema06.trabajandoConCadenas;
import enrique.sources.*;
public class Ejercicio14 {
        public StringBuffer sbVocales=new StringBuffer("aeiouüéáíóúñ");
        public StringBuffer sbConsonantes=new StringBuffer("bcdfghjklmnñpqrstvwxyz");
        public StringBuffer sbSignos=new StringBuffer(",;:?¿!¡+*'$%&/(");
        public int contadorVocales,contadorConsonantes,contadorPalabras,contadorSignos;
        public String respuesta="";
        
        public Ejercicio14(String s) {
            StringBuffer sb1=new StringBuffer(s);
            //Compruebo en la cadena cuantas vocales hay
            contadorVocales=UtilidadesString.comprobarCadenaEnOtra(s, sbVocales.toString());
            contadorConsonantes=UtilidadesString.comprobarCadenaEnOtra(s, sbConsonantes.toString());
            contadorSignos=UtilidadesString.comprobarCadenaEnOtra(s, sbSignos.toString());
            contadorPalabras=UtilidadesString.contarPalabras(s);                 
        }

        public int getsVocales() {
            return contadorVocales;
        }
        public int getsConsonantes() {
            return contadorConsonantes;
        }
        public int getsPalabras() {
            return contadorPalabras;
        }
        public int getsSignos() {
            return contadorSignos;
        }  
        

}


