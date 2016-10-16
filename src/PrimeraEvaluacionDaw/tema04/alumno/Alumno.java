
package Tema04.alumno;

public class Alumno {
    private String nombre;
    private int expediente;
    private short edad;
    private float mediaAcademica;
    
    public Alumno(){
    }
    
    public Alumno(String n, int exp, short e, float m){
        nombre=n;
        expediente=exp;
        edad=e;
        mediaAcademica=m;
    }
    public Alumno(String n, int exp){
        nombre=n;
        expediente=exp;
    }
    public Alumno(short e, float m){
        edad=e;
        mediaAcademica=m;
    }
    
    public void setNombre(String nombreAlumno){
        nombre=nombreAlumno;
    }
    public void setExpediente(int expedienteAlumno){
        expediente=expedienteAlumno;
    }
    public void setEdad(short edadAlumno){
        edad=edadAlumno;
    }
    public void setMediaAcademica(float mediaAlumno){
        mediaAcademica=mediaAlumno;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getExpediente(){
        return expediente;
    }
    public short getEdad(){
        return edad;
    }
    public float getMediaAcademica(){
        return mediaAcademica;
    }
    public void mostrarAlumno(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Expediente: "+expediente);
        System.out.println("Edad: "+edad);
        System.out.println("Media: "+mediaAcademica);
    }
}
