
package Tema04.fraccion;

public class Fraccion {
    //Declarar variables privadas de tipo int
    private int numerador;
    private int denominador;
    
    //Contructor por defecto
    public Fraccion(){
        numerador=2;
        denominador=4;
    }
    
    //Constructor completo (inicializando el numerador y denominador)
    public Fraccion(int n, int d){
        numerador=n;
        denominador=d;
    }
    
    //Introducir un dato al numerador
    public void setNumerador(int n){
        numerador=n;
    }
    
    //Introducir un dato al denominador
    public void setDenominador(int d){
        denominador=d;
    }
    
    //Mostrar numerador
    public int getNumerador(){
        return numerador;
    }
    
    //Mostra denominador
    public int getDenominador(){
        return denominador;
    }
    
    //Calcula la suma de dos fracciones (heterogenias)
    public Fraccion sumaHeterogenia(Fraccion f){
        Fraccion aux=new Fraccion();
        int n, d;
        n=numerador*f.getDenominador()+denominador*f.getNumerador();
        d=denominador*f.getDenominador();
        aux.setNumerador(n);
        aux.setDenominador(d);
        return aux;
    }
    
    //Calcula la suma de dos fracciones (homogenias)
    public Fraccion sumaHomogenia(Fraccion f){
        Fraccion aux=new Fraccion();
        int n, d;
        n=numerador+f.getNumerador();
        d=denominador;
        aux.setNumerador(n);
        aux.setDenominador(d);
        return aux;
    }
    
    //Calcula la resta de dos fracciones (heterogenias)
    public Fraccion restaHeterogenia(Fraccion f){
        Fraccion aux=new Fraccion();
        int n, d;
        n=numerador*f.getDenominador()-denominador*f.getNumerador();
        d=denominador*f.getDenominador();
        aux.setNumerador(n);
        aux.setDenominador(d);
        return aux;
    }
    
    //Calcula la resta de dos fracciones (homogenias)
    public Fraccion restaHomogenia(Fraccion f){
        Fraccion aux=new Fraccion();
        int n, d;
        n=numerador-f.getNumerador();
        d=denominador;
        aux.setNumerador(n);
        aux.setDenominador(d);
        return aux;
    }
    
    //Calcula la multiplicación de dos fracciones
    public Fraccion multiplicacion(Fraccion f){
        Fraccion aux=new Fraccion();
        int n, d;
        n=numerador*f.getNumerador();
        d=denominador*f.getDenominador();
        aux.setNumerador(n);
        aux.setDenominador(d);
        return aux;
    }
    
    //Calcula la divsion de dos fracciones
    public Fraccion division(Fraccion f){
        Fraccion aux=new Fraccion();
        int n, d;
        n=numerador*f.getDenominador();
        d=denominador*f.getNumerador();
        aux.setNumerador(n);
        aux.setDenominador(d);
        return aux;
    }
    
    //Muestra las soluciones por pantalla
    public void print(){
        System.out.println(numerador);
        System.out.println("--");
        System.out.println(denominador);
    }
}
