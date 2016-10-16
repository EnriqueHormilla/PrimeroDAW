
package Tema04.cafeteria;

public class Cafeteria {
    //Declarar variables
    private int capacidadMaxima, capacidadActual;
    private int diferenciaCantidadCafe;
    
    //Constructor predeterminado
    public Cafeteria(){
        capacidadMaxima=1000;
        capacidadActual=0;
    }
    
    //Contructor con la pacidad maxima de la cafera
    public Cafeteria(int capMaxima){
        capacidadMaxima=capMaxima;
        capacidadActual=capMaxima;
    }
    
    //Contructori introduciendo cantidad maxima de la cafetera y capacidad actual de la cafetera
    public Cafeteria(int capMaxima, int capActual){        
        //Si la cantidad actual supera la cantidad maxima, se establece que sea igual que la maxima
        if(capMaxima<capActual){
            capacidadMaxima=capMaxima;
            capacidadActual=capacidadMaxima;
        }else{
            capacidadMaxima=capMaxima;
            capacidadActual=capActual;
        }       
    }
    
    //Getters y setters
    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }
    public int getCapacidadActual(){
        return capacidadActual;
    }
    public void setCapcidadMaxima(int capMaxima){
        capacidadMaxima=capMaxima;
    }
    public void setCapcidadActual(int capActual){
        capacidadActual=capActual;
    }
    
    //Iguala el valor de la capacidad actual a la maxima
    public void llenarCafetera(){
        System.out.println("Se llena la cafetera");
        capacidadActual=capacidadMaxima;
    }
    
    //Resta la cantidad de una taza a la cantidad actual de la cafetera
    public int servirTaza(int cantidadTaza){
        //Si daria el caso de que la cantidad que se pide para la taza es mayor a la cantidad que tiene
        //la cafetera actualmente, se daría la cantidad que tiene la cafetera actualmente a la taza
        if(cantidadTaza>capacidadActual){
            cantidadTaza=capacidadActual;  
            capacidadActual=0; 
            return cantidadTaza; 
        }else{
            capacidadActual-=cantidadTaza;
            return cantidadTaza;
        }
    }
    
    //Vacia la cafetera
    public void vaciarCafetera(){
        System.out.println("Se vacia la cafetera");
        capacidadActual=0;
    }
    
    //Agrega cafe a la cantidad actual que tiene la cafetera
    public int agregarCafe(int cantidadCafe){
        //Calcula la diferencia entre la cantidad maxima de la cafetera y la cantidad actual de la cafetera
        diferenciaCantidadCafe=capacidadMaxima-capacidadActual;
        
        //Si la cantidad que se le agrega es menor que la diferencia
        if(diferenciaCantidadCafe>cantidadCafe){
            capacidadActual+=cantidadCafe;
            return cantidadCafe;
            
        //Si es mayor la cantidad que se le agrega que la diferencia, se agregará hasta llenarse la cafetera
        }else{
            System.out.println("No se puede introducir tanta cantidad de café, se llenara hasta el maximo");
            capacidadActual+=diferenciaCantidadCafe;
            return capacidadActual;
        }
    }
}
