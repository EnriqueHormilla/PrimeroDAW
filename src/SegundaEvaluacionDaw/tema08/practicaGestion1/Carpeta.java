
package tema08.practicaGestion1;

import tema08.practicaGestion.*;
import enrique.sources.UtilidadesLista;
import java.util.ArrayList;
import java.util.Objects;

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
   
    public void mostrarApunte(String st1){
         
        Apunte aux=new Apunte(st1.toUpperCase(), "");
        System.out.println(carpeta.get(carpeta.indexOf(aux)).toString());
    }
    public void mostrarApuntes(){
        UtilidadesLista.showLista(carpeta);
    }
   
    public void modificarApunte(Apunte viejo,Apunte nuevo){
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
        return "Nombre -->" + nombreCarpeta;
    }
    
    
}
