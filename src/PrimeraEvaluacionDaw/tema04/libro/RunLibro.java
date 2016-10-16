
package Tema04.libro;

public class RunLibro {
    public static void main(String[] args) {
        Libro l=new Libro("ES-12345689");
        l.setISBN("12478963");   
        l.setTitulo("Los Tres Cerditos");
        l.setPaginas((short)24);
        l.setPrecio((float)24.15);
        
        System.out.println("ISBN: "+l.getMostrarISBN());
        System.out.println("Título: "+l.getMostrarTitulo());
        System.out.println("Num. Páginas: "+l.getNumeroPaginas());
        System.out.println("Precio: "+l.getPrecio());
        
        System.out.println("-------------------------");
        
        l.setISBN("ES-147258963");
        l.setTitulo("Caperucita Roja");
        l.setPaginas((short)30);
        l.setPrecio((float)10.25);
        
        System.out.println("ISBN: "+l.getMostrarISBN());
        System.out.println("Título: "+l.getMostrarTitulo());
        System.out.println("Num. Páginas: "+l.getNumeroPaginas());
        System.out.println("Precio: "+l.getPrecio());
    }
}
