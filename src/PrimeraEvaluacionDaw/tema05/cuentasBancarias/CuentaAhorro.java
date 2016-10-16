
package Tema05.CuentasBancarias;

public class CuentaAhorro extends CuentaCorriente{
    //Declarar variables
    private double interes;

    //Constructor completo
    public CuentaAhorro(double interes, Titular titular, NumeroDeCuenta numeroCuenta, double saldo) {
        super(titular, numeroCuenta, saldo);
        this.interes = interes;
    }

    //Constructor inicializando la variable saldo a 15.3
    public CuentaAhorro(double interes, Titular titular, NumeroDeCuenta numeroCuenta) {
        super(titular, numeroCuenta);
        super.saldo = 15.3;
        this.interes = interes;
    }
    
    //Constructor inicializando la variable saldo a 15.3 y el interes a 2.5
    public CuentaAhorro(Titular titular, NumeroDeCuenta numeroCuenta) {
        super(titular, numeroCuenta);
        super.saldo = 15.3;
        this.interes = 2.5;
    }
    
    //Getters
    public double getInteres() {
        return interes;
    }
    
    //Metodo calcular interes, multiplica el interes por el saldo de la cuenta
    public void calcularInteres(){
        double aux = interes/100;
        double saldo1 = saldo;
        saldo1*=aux;
        saldo+=saldo1;
        System.out.printf("Saldo: \t\t\t%.2f",saldo);
        System.out.println("");
    }
}
