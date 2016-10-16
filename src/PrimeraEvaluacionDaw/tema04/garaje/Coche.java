
package Tema04.garaje;

public class Coche {
    //Declarar variables
    private Motor m;
    private String marca, modelo;
    private double precioAveria;
    
    //Contructor
    public Coche(String mMarca, String mModelo){
        marca=mMarca;
        modelo=mModelo;
        m=new Motor(100);
        precioAveria=0;
    }
    
    //Getters
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public double getPrecioAveria(){
        return precioAveria;
    }
    
    public void acumularAveria(double precio){
        precioAveria+=precio;
    }
}
