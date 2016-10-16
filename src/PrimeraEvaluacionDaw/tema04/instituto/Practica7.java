
package Tema04.instituto;

public class Practica7 {
    public static void main(String[] args) {
        //Inicializa Alumnos
        Alumno a1, a2, a3;
        
        //Introduce un alumno
        a1=new Alumno(123456879, "Javier Tomás Trapero");
        
        //Inicializa Profesor
        Profesor p=new Profesor();
        
        //Muestra los resultados por pantalla
        System.out.println("Nombre:\t\t\t "+a1.getNombreAlumno());
        System.out.println("Num. Expediente:\t "+a1.getNumExpediente());
        System.out.println("-----------------------------");
        a1.setAsignatura1("Programación");
        a1.setAsignatura2("Entornos de desarrollo");
        a1.setAsignatura3("Base de datos");
        p.ponerNotas(a1);
        System.out.println("-----------------------------");
        System.out.printf("Media:\t\t\t %.2f\n",p.calcularMedia(a1));
        
        System.out.println();
        System.out.println("*****************************");
        System.out.println();
        
        //Inicializa otro alumno
        a2=new Alumno(147852369);
        
        //Muestra los resultados por pantalla del último alumno inicializado
        a2.setNombreAlumno("Andres Perez Saenz");
        System.out.println("Nombre:\t\t\t "+a2.getNombreAlumno());
        System.out.println("Num. Expediente:\t "+a2.getNumExpediente());
        System.out.println("-----------------------------");
        a2.setAsignatura1("Programación");
        a2.setAsignatura2("Entornos de desarrollo");
        a2.setAsignatura3("Base de datos");
        p.ponerNotas(a2);
        System.out.println("-----------------------------");
        System.out.printf("Media:\t\t\t %.2f\n",p.calcularMedia(a2));
        
        System.out.println();
        System.out.println("*****************************");
        System.out.println();
        
        //Inicializa un ultimo alumno
        a3=new Alumno(1597538426, "Maria Lopez Martinez");
        
        //Muestra los resultados por pantalla 
        System.out.println("Nombre:\t\t\t "+a3.getNombreAlumno());
        System.out.println("Num. Expediente:\t "+a3.getNumExpediente());
        System.out.println("-----------------------------");
        a3.setAsignatura1("Programación");
        a3.setAsignatura2("Entornos de desarrollo");
        a3.setAsignatura3("Base de datos");
        p.ponerNotas(a3);
        System.out.println("-----------------------------");
        System.out.printf("Media:\t\t\t %.2f\n",p.calcularMedia(a3));
    }
}
