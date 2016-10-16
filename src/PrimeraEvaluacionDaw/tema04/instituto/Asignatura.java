
package Tema04.instituto;

public class Asignatura {
    //Declara variables de tipo private 
    private int identificador;
    private double calificación;
    
    //Contructor pasando un parametro de tipo int
    public Asignatura(int identificadorAlumno){
        identificador=identificadorAlumno;
    }
    
    //Getter de identificador y calificacion
    public int getIdentificadorAlumno(){
        return identificador;
    }
    public double getCasificacionAlumno(){
        return calificación;
    }
    
    //Setter para la calificacion
    public void setCalificacionAlumno(int clasificacionAlumno){
        calificación=clasificacionAlumno;
    }
}
