
package Tema03.EjerciciosWhile;

public class WhileEjercicio02 {
    public static void main(String[] args) {
        int n=1;
        int operacion=1;
        
        while(operacion<500){
            operacion=5*n;
            System.out.println(operacion);
            n++;
        }
    }
}
