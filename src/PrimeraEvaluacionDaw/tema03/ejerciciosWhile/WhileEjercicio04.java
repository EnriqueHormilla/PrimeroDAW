
package Tema03.EjerciciosWhile;

public class WhileEjercicio04 {
    public static void main(String[] args) {
        int ale1,ale2;
        int cont1=1,cont2=1;
        
        System.out.println("100 números aleatorios entre 5 y 40");
        System.out.println("------------------");
        while(cont1<=100){
            ale1=(int)(Math.random()*35+5);
            System.out.println(ale1);
            cont1++;
        }
        System.out.println("------------------");
        System.out.println("------------------");
        System.out.println("70 número aleatorios entre 7 y 70");
        System.out.println("------------------");
        while(cont2<=70){
            ale2=(int)(Math.random()*63+7);
            System.out.println(ale2);
            cont2++;
        }
    }
}
