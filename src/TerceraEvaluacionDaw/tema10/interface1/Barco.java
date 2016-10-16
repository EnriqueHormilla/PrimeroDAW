/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.interface1;

import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public class Barco implements Serializable{

    private int añoFabricacion;
    private int eslora;
    private int matricula;

    public Barco(int matricula, int eslora, int añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion=this.añoFabricacion;
        //this.añoFabricacion = new GregorianCalendar(añoFabricacion, mesFabricacion, diaFabricacion);

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

   

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Barco other = (Barco) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", a\u00f1oFabricacion=" + añoFabricacion + '}';
    }

    
    
    //método que calcula cuanto se paga un día
    public float calcularAlquiler() {
        float precioDia;
        precioDia = (eslora * 10);
        return precioDia;

    }
}
