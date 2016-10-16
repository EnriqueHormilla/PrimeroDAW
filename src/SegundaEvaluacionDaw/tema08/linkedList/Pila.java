/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08.linkedList;

import enrique.sources.UtilidadesLista;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author Enrique
 */
public class Pila {
    private int maximo;
    private LinkedList list;

    public Pila() {
        this.list=new LinkedList();
        maximo=-1;
    }
    public Pila(int maximo) {
        this.maximo = maximo;
        this.list = new LinkedList();
    }
    public boolean estaLlena(){
        boolean respuesta=false;
        
        if(maximo>0){
            if(maximo==list.size()){
                System.out.println("La lista esta llena");
                respuesta=true;
            }
        }else{
            System.out.println("Usted no a indicado un masximo cuando a inicializado el objeto");
        }
       return respuesta;
    }
    public boolean estaVacia(){
        boolean respuesta=false;
        if(list.size()==0){
            System.out.println("La lista esta vacia");
            respuesta=true;
        }
       return respuesta;
    }
    public boolean push(Object obj){
       boolean resultado=false;
        if(!estaLlena()){
           list.addFirst(obj); 
           resultado=true;
        }else{
            resultado=false;
        }
       return resultado;
    }
    public Object pop(){
        return list.removeFirst();
    }
    public void imprimir(){
        
        UtilidadesLista.showLista(list);
    }
    public Object cima(){
       //System.out.println( "Pimer elemento de la cola"+list.getLast());
        return list.getFirst();
    }
    public int size(){
       //System.out.println("La cantidad de elementos son: "+list.size());
        return list.size();
    }
}
