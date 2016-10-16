/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08.practicaGestion;

import enrique.sources.UtilidadesLista;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author VESPERTINO
 */
public class Carpeta {
    private String nombreCarpeta;
    private ArrayList <Apunte> carpeta;

    public Carpeta() {
    }

    public Carpeta(String nombreCarpeta) {
        this.nombreCarpeta = nombreCarpeta;
        this.carpeta = new ArrayList();
    }

    public String getNombreCarpeta() {
        return nombreCarpeta;
    }

    public void setNombreCarpeta(String nombreCarpeta) {
        this.nombreCarpeta = nombreCarpeta;
    }

    public ArrayList<Apunte> getCarpeta() {
        return carpeta;
    }

    public void setCarpeta(ArrayList<Apunte> carpeta) {
        this.carpeta = carpeta;
    }
    
    public void add(Apunte a){
        carpeta.add(a);
    }
    public void delete(Apunte a){
        carpeta.remove(a);
    }
    public void showCarpeta(){
        UtilidadesLista.showLista(carpeta);
    }
    public void showApunte(String st1){
        Apunte aux=new Apunte(st1.toUpperCase(), "");
        carpeta.get(carpeta.indexOf(aux)).toString();
    }
    public void modify(Apunte viejo,Apunte nuevo){
       if(carpeta.contains(viejo)){          
           carpeta.add(carpeta.indexOf(viejo),nuevo);
       }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.nombreCarpeta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carpeta other = (Carpeta) obj;
        if (!Objects.equals(this.nombreCarpeta, other.nombreCarpeta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nombre Carpeta = " + nombreCarpeta;
    }
    
    
}
