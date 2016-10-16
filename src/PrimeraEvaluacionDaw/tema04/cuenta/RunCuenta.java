
package Tema04.cuenta;

public class RunCuenta {
    public static void main(String[] args) {
        Cuenta c=new Cuenta(700.0);     //Declarar e instanciar a la vez
        System.out.println("El saldo es: "+c.dameSaldo());
        c.reintegro(150);
        System.out.println("El saldo es: "+c.dameSaldo());
        c.ingresar(1500);
        System.out.println("El saldo es. "+c.dameSaldo());
        c.reintegro(5000);
    }
}
