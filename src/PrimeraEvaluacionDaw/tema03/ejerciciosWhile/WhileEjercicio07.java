
package Tema03.EjerciciosWhile;

public class WhileEjercicio07 {
    public static void main(String[] args) {
        int x=0;
        int num=0;
        long cont=1;
        
        while(num<1024){
            num=2*(int)Math.pow(2, x);
            if(num!=128 && num!=512){
                cont*=num;
            }
            x++;
        }
        System.out.println(cont);
    }
}
