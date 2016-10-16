/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrique.sources;

import java.util.Collection;
import java.util.Iterator;


/**
 *
 * @author Enrique
 */
public class UtilidadesLista {
    public static void showLista(Collection collec){  
        if(!collec.isEmpty()){
           int count=0;
            Iterator it = collec.iterator();
            while(it.hasNext()){

                System.out.println("(" + count+") "+it.next().toString()); 
                count++;
            }   
        }else{
            System.out.println("Esta vacia la colección");
        }
        
        
    }    
   
    public static Collection borrarElemento(Collection collec,int numero){         
        Iterator it = collec.iterator();
        int count = 0;
        while (it.hasNext()) { 
            Object aux = it.next();
            if (count == numero) {
                collec.remove(aux);
                break;
            }
            count++;
        }             
       return collec;
    }
    
}

