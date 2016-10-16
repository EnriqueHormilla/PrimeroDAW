
package Tema03.EjerciciosWhile;

public class WhileEjercicio05 {
    public static void main(String[] args) {
        int x=0;
        int operacion=1;
        int sumaDatos=0;
        
        while(operacion<50){
            operacion=8+2*x;
            sumaDatos +=operacion;
            x++;
        }
        System.out.println("La suma de los datos de 8,12,14...50 es= "+sumaDatos);
    }
}
