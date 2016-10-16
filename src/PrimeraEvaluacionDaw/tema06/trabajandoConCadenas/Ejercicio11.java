/*
11.Realizar un método que recibe un String con números pares e impares de una cifra
y retorna dos Strings con los números pares por un lado y los impares por otro.
 */
package tema06.trabajandoConCadenas;
import enrique.sources.*;
public class Ejercicio11 {
        private StringBuilder s1=new StringBuilder("");
        public StringBuilder sPar=new StringBuilder("");
        public StringBuilder sImpar=new StringBuilder("");
        
        public Ejercicio11(String s) {
            if(!UtilidadesString.comprobarNumeroEntero(s)==false){
                s1=new StringBuilder(s);
                for (int i = 0; i < s1.length(); i++) {
                    if(s1.charAt(i)%2!=0){
                        sImpar.append(s.charAt(i));                
                    }else{
                        sPar.append(s.charAt(i));
                    }
                }     
            }               
        }

        public StringBuilder getsPar() {
            return sPar;
        }

        public StringBuilder getsImpar() {
            return sImpar;
        }    

    @Override
    public String toString() {
        return "Ejercicio11{" + "La cadena padre=" + s1 + ", Par=" + sPar + ", Impar=" + sImpar + '}';
    }
        
}

