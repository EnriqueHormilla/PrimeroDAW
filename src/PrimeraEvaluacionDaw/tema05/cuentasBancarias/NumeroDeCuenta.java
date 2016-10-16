
package Tema05.CuentasBancarias;

public class NumeroDeCuenta {
    //Declarar variables
    private int banco, sucursal, digitoDeControl, numeroDeCuenta;

    //Constructor completo
    public NumeroDeCuenta(int banco, int sucursal, int digitoDeControl, int numeroDeCuenta) {
        this.banco = banco;
        this.sucursal = sucursal;
        this.digitoDeControl = digitoDeControl;
        this.numeroDeCuenta = numeroDeCuenta;
    }
    
    //Getters y setters

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public void setDigitoDeControl(int digitoDeControl) {
        this.digitoDeControl = digitoDeControl;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getBanco() {
        return banco;
    }

    public int getSucursal() {
        return sucursal;
    }

    public int getDigitoDeControl() {
        return digitoDeControl;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    
    //Sobreescribir metodo toString()
    @Override
    public String toString(){
        return "Numero de cuenta: \t"+banco+"-"+sucursal+"-"+digitoDeControl+"-"+numeroDeCuenta;
    }
}
