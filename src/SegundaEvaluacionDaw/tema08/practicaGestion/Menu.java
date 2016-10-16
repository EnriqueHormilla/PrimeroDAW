/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema08.practicaGestion;

import enrique.sources.PedirValores;
import enrique.sources.UtilidadesLista;
import java.util.ArrayList;

import java.util.Collections;

/**
 *
 * @author VESPERTINO
 */
public class Menu {
    private int opcion;
    private Apunte apunte;
    private Carpeta carpeta;
    private Archivador archivador;
    public Menu() {
        System.out.println("Nombre del archivador");
        archivador=new Archivador(PedirValores.pedirString());
        System.out.println("Nombre de la primera carpeta");
        carpeta=new Carpeta(PedirValores.pedirString());  
        //apunte=new Apunte();
        archivador.addCarpeta(carpeta);
       // carpeta.add(apunte);
        
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {        
        this.opcion = opcion;
    }
     public void elegirOpcion() {        
        System.out.println("Digame la opcion que quieres");
        int num=PedirValores.pedirInt();
        setOpcion(num);
    }
    public void mostrarCarpeta(){
         System.out.println("\n 1. Crear Carpeta "
                + "\n 2. Ver Todas las carpetas"
                + " \n 3. Selecionar una carpeta,para interactuar con ella"
                 + "\n 4. Salir del programa ");
    }
     public void mostrarApuntes(){
         System.out.println("\n 1. Crear Apuntes "
                + "\n 2. Ver todos los apuntes"
                + "\n 3. Ver todos los apuntes ordenados por horas"
                + "\n 4. Ver todos los apuntes ordenadors por DIAS "
                + "\n 5. Ver todos los apuntes ordenados por fecha"
                + "\n 6. Atras"
                + "\n 7. Salir del programa");
    }
    public void ejecutarOpcionCarpeta(){
        mostrarCarpeta();
        elegirOpcion();
        switch(getOpcion()){
            case 1:
                System.out.println("Nombre de la carpeta a crea");
                Carpeta tmp=new Carpeta(PedirValores.pedirString());
                archivador.addCarpeta(tmp);
                break;
            case 2:
                archivador.showsCarpetas();
                break;
            case 3:
                archivador.showsCarpetas();
                System.out.println("Digame el numero de la carpeta");               
                ejecutarOpcionApuntes((Carpeta)archivador.getArchivador().get(PedirValores.pedirInt()));  
                break;
            case 4:
                setOpcion(10);
                
        }   
    }
     public void ejecutarOpcionApuntes(Carpeta carp){
        mostrarApuntes();
        elegirOpcion();
        switch(getOpcion()){
            case 1:
                Apunte tmpApunte=new Apunte();
                System.out.println("Digame el asusnto");
                tmpApunte.setAsunto(PedirValores.pedirString().toUpperCase());
                System.out.println("La descripcion del apunte");
                tmpApunte.setTexto(PedirValores.pedirString());
                carpeta.add(tmpApunte);
                break;
            case 2:               
                ArrayList tmp0ArrayList =new ArrayList();                        
                tmp0ArrayList.addAll(carp.getCarpeta());
                Collections.sort(tmp0ArrayList);
                UtilidadesLista.showLista(tmp0ArrayList);   
                break;
            case 3:
                CarpetaOrdenarPorHoras ordenHoras= new CarpetaOrdenarPorHoras();
                ArrayList tmpArrayList =new ArrayList();                        
                tmpArrayList.addAll(carp.getCarpeta());
                Collections.sort(tmpArrayList, ordenHoras);
                UtilidadesLista.showLista(tmpArrayList);              
                break;
            case 4:
                CarpetaOrdenarPorDias ordenDia= new CarpetaOrdenarPorDias();
                ArrayList tmp1ArrayList =new ArrayList();                        
                tmp1ArrayList.addAll(carp.getCarpeta());
                Collections.sort(tmp1ArrayList, ordenDia);
                UtilidadesLista.showLista(tmp1ArrayList);              
                break;
            case 5:
                CarpetaOrdenarPorFecha ordenFecha= new CarpetaOrdenarPorFecha();
                ArrayList tmp2ArrayList =new ArrayList();                        
                tmp2ArrayList.addAll(carp.getCarpeta());
                Collections.sort(tmp2ArrayList, ordenFecha);
                UtilidadesLista.showLista(tmp2ArrayList);          
                break;
            case 6:
               ejecutarOpcionCarpeta();
            case 7:
                setOpcion(10);                              
        }        
    } 
}
