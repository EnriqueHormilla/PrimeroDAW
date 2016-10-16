
package Tema05.CuentasBancarias;

public class CuentaCorriente {
    //Declarar variables
    private Titular titular;
    private NumeroDeCuenta cuenta;
    double saldo;

    //Constructor completo
    public CuentaCorriente(Titular titular, NumeroDeCuenta numeroCuenta, double saldo) {
        this.titular = titular;
        this.cuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //Constructor inicializando saldo a 15.3
    public CuentaCorriente(Titular titular, NumeroDeCuenta numeroCuenta) {
        saldo=15.3;
    }

    //Getters
    public Titular getTitular() {
        return titular;
    }

    public NumeroDeCuenta getNumeroCuenta() {
        return cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    //Setter para saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
        
    //Metodo ingresar, incrementar el saldo de la cuenta
    public void ingresar(double saldo){
        this.saldo+=saldo;
    }
    
    //Metodo reintegro, reduce el saldo de la cuenta pasandole un valor
    public void reintegro(double saldo){
        this.saldo-=saldo;
    }
    
    //Metodo para mostrar por pantalla el número de cuenta y el saldo
    public void mostrarPantalla(){
        System.out.println(cuenta.toString());
        System.out.println("Saldo:\t\t\t"+saldo);
    }
    
    //Metodo equals() para comparar dos cuenta
    @Override
    public boolean equals(Object o){
        NumeroDeCuenta ndc = (NumeroDeCuenta) o;
        return cuenta.getNumeroDeCuenta() == ndc.getNumeroDeCuenta();
    }
    
    //Sobrescribir metodo toString()
    public String toString(){
        return titular.toString();
    }
}
