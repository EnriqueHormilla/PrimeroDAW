
package Tema04.libro;

/**
 *
 * @author VESPERTINO
 */
public class Libro {
    private String isbn, titulo;
    private short paginas;
    private float precio;
    
    /**
     *
     * @param i i
     * @param t t
     */
    public Libro(String i, String t){
        isbn=i;
        titulo=t;
    }

    /**
     *
     * @param i2 t
     */
    public Libro(String i2){
        isbn=i2;
    }

    /**
     *
     * @param i
     */
    public void setISBN(String i){
        isbn=i;
    }

    /**
     *
     * @param t
     */
    public void setTitulo(String t){
        titulo=t;
    }

    /**
     *
     * @param nPaginas
     */
    public void setPaginas(short nPaginas){
        paginas=nPaginas;
    }

    /**
     *
     * @param pPrecio
     */
    public void setPrecio(float pPrecio){
        precio=pPrecio;
    }
    
    /**
     *
     * @return
     */
    public String getMostrarISBN(){
        return isbn;
    }

    /**
     *
     * @return
     */
    public String getMostrarTitulo(){
        return titulo;
    }

    /**
     *
     * @return
     */
    public short getNumeroPaginas(){
        return paginas;
    }

    /**
     *
     * @return
     */
    public float getPrecio(){
        return precio;
    }
}
