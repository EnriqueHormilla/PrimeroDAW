
package tema08.treeSet.traductorGame;

public class Marcador {

    private int puntos;

    public Marcador() {
        puntos = 0;
    }

    public void ponAcierto(int n) {
        if (n == 2) {
            puntos = puntos + 100;
        } else if (n == 1) {
            puntos = puntos + 50;
        }
    }

    @Override
    public String toString() {
        return "Su marcador es: " + puntos;
    }

}
