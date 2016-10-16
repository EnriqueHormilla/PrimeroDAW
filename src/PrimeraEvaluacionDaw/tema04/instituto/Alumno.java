
package Tema04.instituto;

public class Alumno {
    //Declarar variables
    private int numExpediente;
    private String nombre, asignatura1, asignatura2, asignatura3;
    
    //Constructor inicializando numero de expediente
    public Alumno(int numExpedienteAlumno){
        numExpediente=numExpedienteAlumno;
    }
    
    //Constructor inicializando numero expediente y nombre completo del alumno
    public Alumno(int numExpedienteAlumno, String nombreAlumno){
        numExpediente=numExpedienteAlumno;
        nombre=nombreAlumno;
    }
    
    //Getters numero expediente, nombre completo y asignaturas
    public int getNumExpediente(){
        return numExpediente;
    }
    public String getNombreAlumno(){
        return nombre;
    }
    public String getAsignatura1(){
        return asignatura1;
    }
    public String getAsignatura2(){
        return asignatura2;
    }
    public String getAsignatura3(){
        return asignatura3;
    }
    
    //Setters de nombre alumno completo y asignaturas
    public void setNombreAlumno(String nombreAlumno){
        nombre=nombreAlumno;
    }
    public void setAsignatura1(String nombreAsignatura1){
        asignatura1=nombreAsignatura1;
    }
    public void setAsignatura2(String nombreAsignatura2){
        asignatura2=nombreAsignatura2;
    }
    public void setAsignatura3(String nombreAsignatura3){
        asignatura3=nombreAsignatura3;
    }
}
