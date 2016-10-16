
package tema07.juegoAhorcado;

public class ListaFallos {
    private StringBuilder lista;

    public ListaFallos(StringBuilder lista) {
        this.lista =new StringBuilder("");
    }

    public StringBuilder getLista() {
        return lista;
    }

    public void setLista(StringBuilder lista) {
        this.lista = lista;
    }
    public void addLista(char letra) {
      
        this.lista.append(letra); 
        this.lista.append('-');
    }
    public boolean comprobarLetraEnLista(char letra) {
        boolean resultado=false;
        for (int i = 0; i < lista.length(); i++) {
            if(letra==lista.charAt(i)){
                
                resultado=true;
            }            
        }
        return resultado;
    }
    
}
