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
public class Archivador {
    private ArrayList archivador;
    private String nombre;
    private int count=0;

    public Archivador( String nombre) {
        this.archivador =new ArrayList();
        this.nombre = nombre;
    }
    public void addCarpeta(Carpeta c){
        archivador.add(c);
    }
    public void showsCarpetas(){
        UtilidadesLista.showLista(archivador);
    }

    public ArrayList getArchivador() {
        return archivador;
    }

    public void setArchivador(ArrayList archivador) {
        this.archivador = archivador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
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
        final Archivador other = (Archivador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    @Override
    
    public String toString() {
        return "Archivador " + "archivador=" + archivador + ", nombre=" + nombre ;
        
    }
    
    
}
