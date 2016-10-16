/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema09.exception;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 *
 * @author PROF_VESPERTINO
 */
public class Log {
    private LinkedHashMap<GregorianCalendar, String> mapa;
    private String nombre;

    public Log(String nombre) {
        mapa = new LinkedHashMap();
        this.nombre = nombre;
    }
    
    // Tendrá un método de añadir que recibirá un String y guardará 
    // el elemento dentro del mapa
    public void añadir(String msg) {
        GregorianCalendar gc = new GregorianCalendar();        
        mapa.put(gc, msg);
    }
    
    //Sobreescribe el método toString mostrará las lineas 
    // de Log guardadas en la EDD.

    @Override
    public String toString() {
        // Obtenemos una coleccion de claves 
        Set s = mapa.keySet();
        Iterator it = s.iterator();
        GregorianCalendar aux;
        String mensaje;
        StringBuilder sb = new StringBuilder();
        while(it.hasNext()) {
            // Cojo la primera clave de la coleccion Set
            aux = (GregorianCalendar)it.next(); 
            mensaje  = mapa.get(aux);
            sb.append(mensaje + "\n");
        }
        return sb.toString();
    }
    
    // Método almacenaFichero que volcará la información de la EDD 
    // en un fichero llamado como la propiedad nombre Se implementará posteriormente
    public void almacenaFichero() {
        Set s = mapa.keySet();
        Iterator it = s.iterator();
        GregorianCalendar aux;
        String mensaje;        
        StringBuilder fecha = new StringBuilder();
        while(it.hasNext()) {
            // Cojo la primera clave de la coleccion Set
            aux = (GregorianCalendar)it.next(); 
            mensaje  = mapa.get(aux);
            fecha.append(aux.get(Calendar.DAY_OF_MONTH) + "/" + aux.get(Calendar.MONTH));
            // Metemos en fichero aux + mensaje
            
        }
        
    }    
    
    // Método leeFichero que volcará la información 
    // del fchero en la EDD. Se implementará posteriormente
    public void leerFichero() {
        // abre el fichero
        // carga toda la informacion en el mapa
    }
    
    // Metodo que dada un String de tipo dd/mm/yyyy
    // Devuelve todos los mensajes de ese día
    
    
    
    
}
