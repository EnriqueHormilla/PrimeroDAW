
package tema08.treeSet.traductorGame;

import java.util.HashMap;

public class ListaDePalabras {

    private HashMap<Integer, Palabras> lista;

    public ListaDePalabras() {
        lista = new HashMap();
    }

    public void añadir(Integer indice, Palabras p1) {
        lista.put(indice, p1);
    }

    public Palabras damePalabraAleatoria() {
        int tam = lista.values().size();
        int nAleatorio = (int) (Math.floor(Math.random() * tam));

        return lista.get(new Integer(nAleatorio));
    }

}
