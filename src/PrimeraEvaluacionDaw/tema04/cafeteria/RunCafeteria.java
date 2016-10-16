
package Tema04.cafeteria;

public class RunCafeteria {
    public static void main(String[] args) {
        Cafeteria c;
        c=new Cafeteria();
        System.out.println("Capacidad maxima de la cafetera: "+c.getCapacidadMaxima()+" c.c.");
        System.out.println("Cantidad actual de la cafetera: "+c.getCapacidadActual()+" c.c.");
        System.out.println("----------");
        System.out.println("Se agrega cafe a la cafetera: "+c.agregarCafe(500)+" c.c.");
        System.out.println("Capacidad maxima de la cafetera: "+c.getCapacidadMaxima()+" c.c.");
        System.out.println("Cantidad actual de la cafetera: "+c.getCapacidadActual()+" c.c.");
        System.out.println("----------");
        System.out.println("Se sirve una taza de: "+c.servirTaza(90)+" c.c.");
        System.out.println("Capacidad maxima de la cafetera: "+c.getCapacidadMaxima()+" c.c.");
        System.out.println("Cantidad actual de la cafetera: "+c.getCapacidadActual()+" c.c.");
        System.out.println("----------");
        System.out.println("Se sirve una taza de: "+c.servirTaza(500)+" c.c.");
        System.out.println("Capacidad maxima de la cafetera: "+c.getCapacidadMaxima()+" c.c.");
        System.out.println("Cantidad actual de la cafetera: "+c.getCapacidadActual()+" c.c.");
        System.out.println("----------");
        c.llenarCafetera();
        System.out.println("Capacidad maxima de la cafetera: "+c.getCapacidadMaxima()+" c.c.");
        System.out.println("Cantidad actual de la cafetera: "+c.getCapacidadActual()+" c.c.");
        System.out.println("----------");
        c.vaciarCafetera();
        System.out.println("Capacidad maxima de la cafetera: "+c.getCapacidadMaxima()+" c.c.");
        System.out.println("Cantidad actual de la cafetera: "+c.getCapacidadActual()+" c.c.");
        System.out.println("----------");
        System.out.println("----------");
        c=new Cafeteria(200,600);
        System.out.println("Capacidad maxima de la cafetera: "+c.getCapacidadMaxima()+" c.c.");
        System.out.println("Cantidad actual de la cafetera: "+c.getCapacidadActual()+" c.c.");
    }
}
