/*
Realizar un método que recibe un String con 10 números aleatorios entre 0 y 9, y
calcula y retorna la suma y la media de esos 10 números.
 */
package tema06.PracticaOtrosEjercicios;

/**
 *
 * @author VESPERTINO
 */
public class MisDatos4 {
    private int suma,media;

    public MisDatos4(int suma, int media) {
        this.suma = suma;
        this.media = media;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "MisDatos4{" + "suma=" + suma + ", media=" + media + '}';
    }

    
    
    
}
