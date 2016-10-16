
package tema07.juegoAhorcado;
import enrique.sources.*;

public class Jugador {
    private String nombre;
    private char letra;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    public void pedirNombre(){
       setNombre(PedirValores.pedirString());
    }
    public void pedirLetra(){
        char charAt = PedirValores.pedirChar();
        setLetra(charAt);
    }
//    public static void main(String[] args) {
//        Jugador jugador=new Jugador("Enrique");
//        System.out.println(jugador.getLetra());
//        jugador.pedirLetra();
//        System.out.println(jugador.getLetra());
//    }
}
