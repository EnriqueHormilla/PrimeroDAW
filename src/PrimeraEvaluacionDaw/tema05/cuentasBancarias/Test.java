
package Tema05.CuentasBancarias;

public class Test {
    public static void main(String[] args) {
        //Crea dos titulares
        Titular titular = new Titular("Javier", "Tomás Trapero", 20);
        Titular titular2 = new Titular("Andres", "Perez Rodriguez", 35);
        
        //Crea dos números de cuenta
        NumeroDeCuenta numeroCuenta = new NumeroDeCuenta(1234, 1234, 95, 987456320);
        NumeroDeCuenta numeroCuenta2 = new NumeroDeCuenta(1234, 1544, 95, 987447320);
        
        //Crea dos cuentas de ahorro, que son una extencion de cuenta corriente
        CuentaAhorro cuentaAhorro = new CuentaAhorro(2.45, titular, numeroCuenta, 547.25);
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro(1.25, titular, numeroCuenta, 0.0);
        
        
        System.out.println(titular);    //Muestra el titular de la primera cuenta
        System.out.println(numeroCuenta);   //Muestra el número de cuenta del primer titular       
        System.out.println("Saldo: \t\t\t"+cuentaAhorro.saldo); //Muestra el saldo que tiene actualmente
        System.out.println("----------------");
        System.out.println("Ingreso \t\tRazon: Nomina");        
        cuentaAhorro.ingresar(1025.35);     //Realiza un ingreso al saldo del primer titular
        System.out.println("Saldo: \t\t\t"+cuentaAhorro.saldo); //Muestra el saldo tras el ingreso
        System.out.println("Reintegro \t\tRazon: Hipoteca");
        cuentaAhorro.reintegro(654.68);     //Realiza un reintegro a la cuenta
        System.out.println("Saldo: \t\t\t"+cuentaAhorro.saldo); //Muestra el saldo tras hacer el reintegro
        System.out.println("Interes: \t\t"+cuentaAhorro.getInteres()+"%");  //Muestra el interes de la Cuenta de Ahorro
        cuentaAhorro.calcularInteres();     //Calcula el interes de la cuenta y muestra el saldo 
        
        System.out.println("****************");
        
        System.out.println(titular2);   //Muestra el titular de la segunda cuenta
        System.out.println(numeroCuenta2);  //Muestra el número de cuenta del segundo titular
        System.out.println("Saldo: \t\t\t"+cuentaAhorro2.saldo); //Muestra el saldo de la cuenta del segundo
        System.out.println("----------------");
        System.out.println("Ingreso \t\tRazon: Boleto de loteria premiado");
        cuentaAhorro2.ingresar(10054.58);   //Realiza un ingreso a la segunda cuenta
        System.out.println("Saldo: \t\t\t"+cuentaAhorro2.saldo); //Muestra el saldo tras el ingreso
        System.out.println("Reintegro \t\tRazon: Comprar Smart TV");
        cuentaAhorro2.reintegro(2356.25);   //Realiza un reintegro
        System.out.println("Saldo: \t\t\t"+cuentaAhorro2.saldo); //Muestra el resultado
        System.out.println("Interes: \t\t"+cuentaAhorro2.getInteres()+"%"); //indica el interes de la Cuenta de Ahorro
        cuentaAhorro2.calcularInteres();    //Calcula y muestra el saldo tras hacer el interes
        
        System.out.println("****************");
        System.out.println("****************");
        
        //Metodo equals para saber si dos cuentas son o no iguales
        if(cuentaAhorro.equals(numeroCuenta2)==true){
            //Si son iguales muestra el siguiente mensaje
            System.out.println("La cuenta de "+titular.getNombre()+" y "+titular2.getNombre()+" son iguales");        
        }else{
            //En caso contrario muestra este
            System.out.println("La cuenta de "+titular.getNombre()+" y "+titular2.getNombre()+" no son iguales");      
        }
    }
}
