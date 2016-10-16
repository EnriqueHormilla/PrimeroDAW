
package Tema06.PolimorfismoFigura;

public class Matematico {
     //Metodo averiguar perimetro, lo que hace es meterle un objeto Figura y devuelde el calcula perimetro de Figura
    public double averiguarPerimetro(Figura param){
        return param.calcularPerimetro();
    }
    //Metodo averiguar area, lo que hace es meterle un objeto Figura y devuelde el calcula area de Figura
    public double averiguarArea(Figura param){
        return param.calcularArea();
    }
    
}
