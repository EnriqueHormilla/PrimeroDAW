
package Tema05.Punto2D;

public class Punto {
    //Declarar variables publicas de x e y
    public int x, y;
    
    //Contructor completo
    public Punto(int xPunto, int yPunto){
        x=xPunto;
        y=yPunto;
    }
    
    //Constructor por defecto
    public Punto(){
    }
    
    //Constructor inicializando el punto x y el punto y inicializado a 1
    public Punto(int xPunto){
        x=xPunto;
        y=1;
    }
    
    //Mostrar el las coordenadas
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
    
    //Sobreescribe el metodo "equals" para comparar si son iguales o no las coordenadas
    @Override
    public boolean equals(Object o){
        Punto p=(Punto) o;
        if(x==p.x && y==p.y){
            return true;
        }else{
            return false;
        }
    }
    
    //Sobrecarga el metodo "equals" para saber que coordenada es mayor
    public int equals(){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }    
}
