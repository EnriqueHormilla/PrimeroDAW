
package Tema06.InterfacesAnimalesYMascotas;

import java.util.Objects;

public abstract class Animal {
    private String foto,tipoComida,localizacion,tamanio;

    public Animal(String foto, String tipoComida, String localizacion, String tamanio) {
        this.foto = foto;
        this.tipoComida = tipoComida;
        this.localizacion = localizacion;
        this.tamanio = tamanio;
    }
    
    public abstract String comer();
    public abstract String rugir();
    public void dormir(){
        System.out.println("zzzzzzz");
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

   @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.foto);
        hash = 61 * hash + Objects.hashCode(this.localizacion);
        hash = 61 * hash + Objects.hashCode(this.tamanio);
        return hash;
    }

    @Override
    public String toString() {
        return "Animal{" + "foto=" + foto + ", tipoComida=" + tipoComida + ", localizacion=" + localizacion + ", tamanio=" + tamanio + '}';
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
        final Animal other = (Animal) obj;
        if (!Objects.equals(this.foto, other.foto)) {
            return false;
        }
        if (!Objects.equals(this.tipoComida, other.tipoComida)) {
            return false;
        }
        if (!Objects.equals(this.localizacion, other.localizacion)) {
            return false;
        }
        if (!Objects.equals(this.tamanio, other.tamanio)) {
            return false;
        }
        return true;
    }
    
    
}
