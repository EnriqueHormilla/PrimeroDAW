
package Tema04.instituto;

public class Profesor {
    //Declarar variables de tipo private
    private double ale1, ale2, ale3, media;
    
    //Metodo poner notas recibe parametro de tipo "Alumno"
    public void ponerNotas(Alumno a){
        //Calcula 3 notas aleatorias
        ale1=Math.random()*10;
        ale2=Math.random()*10;
        ale3=Math.random()*10;
        
        //Muestra el nombre de las asignaturas y las notas
        System.out.printf(a.getAsignatura1()+":\t\t %.2f\n",ale1); 
        System.out.printf(a.getAsignatura2()+":\t %.2f\n",ale2);
        System.out.printf(a.getAsignatura3()+":\t\t %.2f\n",ale3);
    }
    
    //Metodo que calcula la media y devuelde un double
    public double calcularMedia(Alumno a){
        media=(ale1+ale2+ale3)/3;   //Calcula la media sumando las 3 notas y dividiendolas por 3
        return media;
    }
}
