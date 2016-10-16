
package tema07.juegoAhorcado;
import enrique.sources.*;

public class Ahorcado {
    public void jugar(){
       Jugador jugador=new Jugador(null);
       Palabra palabra=new Palabra("patata");
       Horca horca=new Horca();
       Ahorcado ahoracado=new Ahorcado();
       ListaFallos listaFallos=new ListaFallos(null);
       
       System.out.println("Dame tu nombre");
       jugador.pedirNombre();          
       System.out.print("Numero de fallos maximos permitidos: ");
       System.out.print(horca.getNumeroMaximo());
        System.out.println();
        do {   
            System.out.println("La palabra esta así ,ahora");
            System.out.println(palabra.getPalabraEscondida());
            System.out.println("----LISTA DE LETRAS QUE NO ESTÁN-----");
            System.out.println(listaFallos.getLista());
            System.out.println("-----------------");
            System.out.print("Su numero de fallos ");
            System.out.println( horca.getNumeroFallos()); 
                      
            do {                
                System.out.println("Dame una letra,Recuerda no tiene que estar en la tabla de arriba");  
                jugador.pedirLetra(); 
            } while (listaFallos.comprobarLetraEnLista(jugador.getLetra()));
                          
            palabra.comprobarLetra(jugador.getLetra());//Obtengo la letra guardada en jugador(letra) y se la doy a plabra para que compruebe
            if(palabra.getCountAciertosPorTurno()>0){
                System.out.println("Felicidades has acertado "+palabra.getCountAciertosPorTurno()+" letras.¡Ánimo!");
                //Significa que el jugador a acertado algo                
            }else{
                //Significa qeu no a certado nada
                horca.incrementalNumeroFallos(); //Incremento el numero de fallo a 1
                listaFallos.addLista(jugador.getLetra());//Añado a la lista esa letra
                if(!horca.comprobarVida()){
                    System.out.println("Estas muerto");
                    break;                   
                }
            }            
            palabra.setCountAciertosPorTurno(0);
        // palabra.comprobarLetra(jugador.getLetra());
            
        } while ((!horca.comprobarVida()) || (!palabra.comprobarGanar()));
              
       
        //do {            
        //pedir nombre al Jugador
        //palabra.mostrar();
        //horca.mostrar();
        //lista.mostrar();
        //jugador.pedirletra(),
        //if(!Palabra.comprobar){
        //horca.poner item
        // lista.metePlabra
        //}
        //} while (horca.noEstasMuerto or Palabra.noCompleta);

        
        
    }
    
}
