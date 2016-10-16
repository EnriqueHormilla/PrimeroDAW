
package Tema03.EjerciciosWhile;

public class WhileEjercicio03 {
    public static void main(String[] args) {
        int n=1;
        int operacion=0;
        
        while(operacion<7000){
            operacion=7*n;
            System.out.println(operacion);
            n++;
        }
    }
}
