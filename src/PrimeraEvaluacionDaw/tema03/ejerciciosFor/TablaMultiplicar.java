
package Tema03.EjerciciosFor;

public class TablaMultiplicar {
    public static void main(String[] args) {
        //Declarar variables
        int i,j;
        
        for(i=1;i<=10;i++){
            System.out.println("Tabla del "+i);
            System.out.println("-------");
            for(j=1;j<=10;j++){
                System.out.println(i+"*"+j+"="+(i*j));
            }
            System.out.println("***********");
        }
    }
}
