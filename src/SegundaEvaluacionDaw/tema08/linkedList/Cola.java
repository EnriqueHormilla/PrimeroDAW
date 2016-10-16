/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08.linkedList;

import java.util.LinkedList;
import enrique.sources.*;
import java.util.Collections;
/**
 *
 * @author Enrique
 */
public class Cola {
    private int maximo;
    private LinkedList list;

    public Cola() {
        this.list=new LinkedList();
        maximo=-1;
    }

    public Cola(int maximo) {
        this.maximo = maximo;
        this.list = new LinkedList();
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public LinkedList getList() {
        return list;
    }

    public void setList(LinkedList list) {
        this.list = list;
        
    }
    
    public boolean estaLlena(){
        boolean respuesta=false;
        if(maximo>0){
            if(maximo==list.size()){
                System.out.println("La lista esta llena");
                respuesta=true;
            }
        }else{
            System.out.println("Usted no a indicado un maximo cuando a inicializado el objeto");
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
           list.addLast(obj); 
           resultado=true;
        }else{
            resultado=false;
        }
       return resultado;
    }
    
    public Object pop(){        
        return list.removeLast();
    }
    
    public void imprimir(){
        
        UtilidadesLista.showLista(list);
    }
    
    public Object cima(){
        //System.out.println( "Pimer elemento de la cola"+list.getFirst());
        return list.getLast();
    }
    
    public int  size(){
       // System.out.println("La cantidad de elementos son: "+list.size());
        return list.size();
    }
    
    
}
