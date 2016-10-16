
package tema07.juegoAhorcado;


public class Horca {
    private int numeroFallos,numeroMaximo;

    public Horca() {
      numeroFallos=0;
      numeroMaximo=8;
    }
    public int getNumeroFallos() {
        return numeroFallos;
    }
    public void setNumeroFallos(int numeroFallos) {
        this.numeroFallos = numeroFallos;
    }   
    public int getNumeroMaximo() {
        return numeroMaximo;
    }

    public void setNumeroMaximo(int numeroMaximo) {
        this.numeroMaximo = numeroMaximo;
    }
    public void incrementalNumeroFallos() {
        this.numeroFallos++;
    }
     public boolean comprobarVida() {
        boolean resultado=true;
        if(this.numeroFallos>=this.numeroMaximo){
            resultado=false;//Estas muerto
        }
        return resultado;
    }
    

}
