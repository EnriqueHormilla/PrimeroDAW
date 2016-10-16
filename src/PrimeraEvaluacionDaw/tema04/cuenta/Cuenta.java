
package Tema04.cuenta;

public class Cuenta {
    private double saldo;
    
    public Cuenta(){
        saldo=0;
    }
    public Cuenta(double param){
        saldo=param;
    }
    public void ingresar(double dinero){
        saldo=saldo+dinero;
    }
    public boolean reintegro(double extraerDinero){
        if(extraerDinero<=saldo){
            saldo=saldo-extraerDinero;
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    public double dameSaldo(){
        return saldo;
    }
}
