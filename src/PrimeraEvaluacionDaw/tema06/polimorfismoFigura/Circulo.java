
package Tema06.PolimorfismoFigura;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Circulo extends Figura{
    private double radio;
    //Contructor Completo
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea(double radio) {//        
        return ((Math.pow(radio, 2))*Math.PI);      
    }
    public double calcularPerimetro(double radio) {
        return Math.PI*2*radio;        
       // return super.calcularPerimetro(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
