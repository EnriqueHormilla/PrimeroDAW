/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrique.sources;

/**
 *
 * @author VESPERTINO
 */
public  class Cronometro {

    private long inicio;
    private long fin;

    public Cronometro() {
        long inicio = 0;
        long fin = 0;       
    }

    public void start(){
        inicio=System.currentTimeMillis();
    }
    
    public void stop(){
        fin=System.currentTimeMillis();
    }
    public long show(){
        return fin-inicio;
    }
    public void reset(){
        inicio=0;
        fin=0;
    }
}
