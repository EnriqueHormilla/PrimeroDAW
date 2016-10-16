
package Tema04.alumno;

public class RunAlumno {
    public static void main(String[] args) {
        Alumno a=new Alumno();
        a.setNombre("Javier");
        a.setExpediente(1457896);
        a.setEdad((short)20);
        a.setMediaAcademica((float)9.8);
        
        a.mostrarAlumno();
        
        System.out.println("--------------------");
        
        a=new Alumno("Andrés", 1457820);
        a.setEdad((short)15);
        a.setMediaAcademica((float)6.75);
        
        a.mostrarAlumno();
        
        System.out.println("--------------------");
        
        a=new Alumno((short)25, (float)5.95);
        a.setNombre("Marta");
        a.setExpediente(2545861);
        
        a.mostrarAlumno();
        
        System.out.println("--------------------");
        
        a=new Alumno("Irene", 1247856, (short)19, (float)4.75);
        
        a.mostrarAlumno();
        
        System.out.println("--------------------");
    }
}
