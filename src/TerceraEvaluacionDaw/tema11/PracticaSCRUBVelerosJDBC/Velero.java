/*
Base de datos donde funionan las consultas.

CREATE TABLE `programacion`.`veleros` ( `matricula` INT(11) NOT NULL , `metrosEslora` INT(11) NOT NULL , `numeroMastiles` INT(11) NOT NULL ) ENGINE = InnoDB;
*/

package tema11.PracticaSCRUBVelerosJDBC;

//Clase Veleros, es una clase que es una extensión de la clase Barco
public class Velero extends Barco{
    //Declarar variable
    private int numeroMastiles;

    //Constructor completo 

    public Velero(int numeroMastiles, int matricula, int metrosEsloran) {
        super(matricula, metrosEsloran);
        this.numeroMastiles = numeroMastiles;
    }
    
    //Sobrescribir el metodo "calcularAlquiler" de la clase Barco
    @Override
    public double calcularAlquiler(int numeroDias) {
        return super.calcularAlquiler(numeroDias)+(numeroMastiles*5);
    }

    @Override
    public String toString() {
        return "Matricula: "+matricula+"\nMetros de eslora: "+metrosEslora +"numeroMastiles=" + numeroMastiles ;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }
    
    
    
    
}
