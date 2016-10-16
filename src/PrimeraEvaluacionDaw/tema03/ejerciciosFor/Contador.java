
package Tema03.EjerciciosFor;

public class Contador {
    public static void main(String[] args) {
        //Declarar variables
        int n=6,x=5,i;
        double multiDigitos=1;
        int sumaDigitos=0;
        
        //For para sacar toda la serie y calcula el resultado de toda la multiplicación
        for(i=n;i<=60;i=i+3){
            System.out.print(""+i+" ");
            multiDigitos*=i;
        }
        System.out.println("");
        
        //Muestra el resultado de la multiplicación de todos los dígitos
        System.out.println("Multiplicación digitos: "+multiDigitos);
        
        System.out.println("*************************");
        
        //For para sacar toda la serie y calcula el resultado de la suma sus digitos
        for(i=x;i<=5000000;i=i*10){
            System.out.print(""+i+" ");
            sumaDigitos +=i;
        }
        System.out.println("");
        
        //Muestra el resultado de la suma de los digitos
        System.out.println("Suma digitos:"+sumaDigitos);
    }
}
