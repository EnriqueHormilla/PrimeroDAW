/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.interface1;

import java.io.Serializable;
import java.util.GregorianCalendar;

/**
 *
 * @author VESPERTINO
 */
public class Yates extends Barco implements Serializable{

    private int camarotes;

    public Yates(int camarotes, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.camarotes = camarotes;
    }

    

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + super.getMatricula() + ", eslora=" + super.getEslora() + ", año Fabricacion=" + super.getAñoFabricacion() + "camarotes=" + camarotes + '}';

    }

    
    @Override
    public float calcularAlquiler() {
        return super.calcularAlquiler() + (camarotes * 20);
    }

}
