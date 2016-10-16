
package tema11.PracticaSCRUBVelerosJDBC;

public class Barco {
    //Declarar variables
    int matricula, metrosEslora,precio;


    //Constructor completo
    public Barco(int matricula, int metrosEsloran) {
        this.matricula = matricula;
        this.metrosEslora = metrosEslora;
    }
    
    //Metodo calcularAlquiler, que devuelde el precio del alquiler
    public double calcularAlquiler(int numeroDias){
        precio = (metrosEslora*10)*numeroDias+2;
        return precio;
    }
    
    //Sobrescribir el metodo "toString()" pasa mostrar los datos del barco
    @Override
    public String toString(){
        return "Matricula: "+matricula+"\nMetros de eslora: "+metrosEslora;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMetrosEslora() {
        return metrosEslora;
    }

    public void setMetrosEslora(int metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
