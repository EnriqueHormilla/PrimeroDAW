/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08.practicaGestion;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;


/**
 *
 * @author VESPERTINO
 */
public class Apunte {
    private String asunto,texto;
    private GregorianCalendar fecha;
    private int dias,horas;    

    public Apunte() {        
     fecha =new GregorianCalendar();            
    }

    public Apunte(String asunto, String texto) {
        this.asunto = asunto;
        this.texto = texto;
        fecha =new GregorianCalendar();
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Apunte " + "asunto=" + asunto + ", texto=" + texto + ", fecha=" + fecha + ", dias=" + dias + ", horas=" + horas;
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
        final Apunte other = (Apunte) obj;
        if (!Objects.equals(this.asunto, other.asunto)) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Apunte apunte =new Apunte();
        System.out.println(apunte);
    }
    
}
