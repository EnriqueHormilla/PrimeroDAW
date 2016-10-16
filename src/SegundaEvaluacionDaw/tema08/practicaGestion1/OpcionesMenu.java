
package tema08.practicaGestion1;

import enrique.sources.PedirValores;
import enrique.sources.UtilidadesLista;
import java.util.ArrayList;
import java.util.Collections;

public class OpcionesMenu {
    private Apunte apunte;
    private Carpeta carpeta;
    private Archivador archivador;
    private int maxArchivador=0,numcarpeta=-1;

    //*********TODO SOBRE ARCHIVADOR***********
    
    //Creamos el archivador en caso de no existir
    public void crearArchivador() {
        if(maxArchivador<1){
            System.out.println("Nombre del archivador");
            archivador=new Archivador(PedirValores.pedirString());
            maxArchivador++;
        }else{
            System.out.println("Para esta práctica solo se permite tener un archivador");
        }        
    } 
           
    //*********TODO SOBRE CARPETAS***********  
    
    //Crea la carpeta y la inserta en el archivador
    public void crearCarpeta() {
        System.out.println("Nombre de la carpeta a crea");
        Carpeta tmp=new Carpeta(PedirValores.pedirString());
        //La añado al archivador
        archivador.addCarpeta(tmp);
    }
    //Muestra el arrayList del objeto archivador
    public void showCarpetas() {
        archivador.showsCarpetas();
    }
    //Un metodo para obtener el objeto carpeta que queremos utilizar,si tenemos uno predeterminado utilizara ese ,por comodidad.
    public Carpeta selecionarCarpeta() {
        if(numcarpeta>=0){
            System.out.println("Carpeta por defecto--> "+numcarpeta+" ,si quieres otra pulsa en la opcion de CAMBIAR CARPETA PREDETERMINADA");
            return (Carpeta)archivador.getArchivador().get(numcarpeta); 
        }else{
           if(!archivador.getArchivador().isEmpty()){
               archivador.showsCarpetas();
               System.out.println("La carpeta que escogas sera la predetermindada,para cambiarlo pulsa en la opcion de CAMBIAR CARPETA PREDETERMINADA");
               numcarpeta=PedirValores.pedirInt();
               return (Carpeta)archivador.getArchivador().get(numcarpeta); 
           }else{
               System.out.println("El archivador no tiene carpetas todavia");
               return null;
           }                
        }                 
    }
    //Cambia la carpeta predetermindada a otra
    public void cambiarCarpetaPredeterminada(){      
        if(!archivador.getArchivador().isEmpty()){
            archivador.showsCarpetas();
            System.out.println("¿Que carpeta quieres que sea la predetermindada?");
            numcarpeta=PedirValores.pedirInt(); 
        }else{
            System.out.println("No hay carpetas en el archivador");
        }       
    }
   
       
    //*********TODO SOBRE APUNTES***********     
    
    
    //Crea el apunte y lo mete en la carpeta 
    public void CrearApunte() {
        Carpeta auxCarpeta=selecionarCarpeta();
        if(auxCarpeta!=null){
            apunte=new Apunte();
            System.out.println("Digame el asusnto");
            apunte.setAsunto(PedirValores.pedirString().toUpperCase());
            System.out.println("La descripcion del apunte");
            apunte.setTexto(PedirValores.pedirString());
            auxCarpeta.add(apunte); 
        }        
    }
    public void cambiarApuntePorOtro(){
        Carpeta auxCarpeta=selecionarCarpeta();
         if(auxCarpeta!=null){
            Apunte apunte1=selecionarApunte();
            if(apunte1!=null){
                apunte=new Apunte();
                System.out.println("Digame el asusnto");
                apunte.setAsunto(PedirValores.pedirString().toUpperCase());
                System.out.println("La descripcion del apunte");
                apunte.setTexto(PedirValores.pedirString()); 
                auxCarpeta.modificarApunte(apunte1, apunte);   
            }
         }
        
    }
    //Un metodo para obtener el objeto apunte que queremos utilizar
    public Apunte selecionarApunte() {
        Carpeta auxCarpeta=selecionarCarpeta();
        if(auxCarpeta!=null){
            if(!auxCarpeta.getCarpeta().isEmpty()){
                auxCarpeta.mostrarApuntes();
                System.out.println("Sobre que apunte vas a aplicar esta opcion"); 
                return auxCarpeta.getCarpeta().get(PedirValores.pedirInt()); 
            }else{
                System.out.println("Para selecionar un apunte primero tiene que existir");
                return null;
            }              
        }else{
            System.out.println("No se puede añadir un apunte a una carpeta que no existe");
            return null;
        }                     
    }
    //borra el apunte de una carpeta por el id
    public void borrarApunte(){
        Carpeta auxCarpeta=selecionarCarpeta();
        if(auxCarpeta!=null){
            Apunte auxApunte=selecionarApunte();
            if(auxApunte!=null){
                auxCarpeta.delete(auxApunte);
            }
        }
    }
    //muestra el apunte especifico dependiendo del asunto
    public void ShowApunteEspecifico(){       
        Carpeta auxCarpeta=selecionarCarpeta();
        if(auxCarpeta!=null){
            System.out.println("Digame el asunto de ese apunte");
                auxCarpeta.mostrarApunte(PedirValores.pedirString());
        }
    }
    //muestra todos los apuntes de una carpeta
    public void ShowApuntes(){
        Carpeta auxCarpeta=selecionarCarpeta();
        if(auxCarpeta!=null){           
                 auxCarpeta.mostrarApuntes();
        }
    }
    //ordenacion del arralist de apuntes por horas
    public void showApuntesPorHoras(){
        Carpeta auxCarpeta=selecionarCarpeta();
        if(auxCarpeta!=null){          
                CarpetaOrdenarPorHoras ordenHoras= new CarpetaOrdenarPorHoras();
                ArrayList tmpArrayList =new ArrayList();                        
                tmpArrayList.addAll(auxCarpeta.getCarpeta());
                Collections.sort(tmpArrayList, ordenHoras);
                UtilidadesLista.showLista(tmpArrayList); 
        }   
    }
    //ordenacion del arralist de apuntes por dias
    public void showApuntesPorDias(){
        Carpeta auxCarpeta=selecionarCarpeta();
        if(auxCarpeta!=null){

                CarpetaOrdenarPorSegundos ordensegundos= new CarpetaOrdenarPorSegundos();
                ArrayList tmpArrayList =new ArrayList();                        
                tmpArrayList.addAll(auxCarpeta.getCarpeta());
                Collections.sort(tmpArrayList, ordensegundos);
                UtilidadesLista.showLista(tmpArrayList); 
            
        }        
    }
   
    //*********SALIR DEL PROGRAMA***********
    
    public void salir() {
        System.out.println("salir apunte");
    }
    
}
