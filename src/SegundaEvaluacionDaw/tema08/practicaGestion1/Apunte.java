/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08.practicaGestion1;


import tema08.practicaGestion.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;


/**
 *
 * @author VESPERTINO
 */
public class Apunte  implements Comparable{
    private String asunto,texto;
    private GregorianCalendar fecha;   

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

    @Override
    public String toString() {
        return "Asunto=" + asunto + ", texto=" + texto + ", Dia=" + fecha.get(GregorianCalendar.HOUR_OF_DAY)+ "Hora="+ fecha.get(GregorianCalendar.HOUR_OF_DAY) ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.asunto);
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
        if (!Objects.equals(this.asunto.toUpperCase(), other.asunto.toUpperCase())) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
