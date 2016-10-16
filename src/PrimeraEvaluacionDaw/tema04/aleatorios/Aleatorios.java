
package Tema04.aleatorios;

public class Aleatorios {
    //Declarar variables
    private int inicial, fin, ale;
    
    //Contructor completo
    public Aleatorios(int i, int f){
        inicial=i;  //Número inicial
        fin=f;      //Número final
    }
    
    //Obtección de aletarorios 
    public int calcAleatorios(int n){    //n=cantidad de aleatorios
        do{
            ale=(int)(Math.random()*(fin-inicial)+inicial);
            System.out.print(ale+"|");
            n--;
        }while(n!=0);
        return ale;
    }
}
