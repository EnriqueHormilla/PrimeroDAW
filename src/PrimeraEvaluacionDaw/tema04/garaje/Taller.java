
package Tema04.garaje;

public class Taller {
    //Declarar variables
    private Coche coche;
    private String averia;
    private int cochesAtendidos;
    
    public Taller(){
        coche=null;
        averia="";
        cochesAtendidos=0;
    }
    
    public boolean aceptarCoche(Coche c, String averiaCoche){
        if(coche==null){
            coche=c;
            averia=averiaCoche;
            if(averiaCoche=="Aceite"){
                
            }
            cochesAtendidos++;
            return true;
        }else{
            return false;
        }
    }
    public void devolverCoche(){
        coche=null;
    }
}
