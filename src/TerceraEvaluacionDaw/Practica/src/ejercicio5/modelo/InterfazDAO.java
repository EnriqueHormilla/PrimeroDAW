/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.modelo;

/**
 *
 * @author VESPERTINO
 */
public interface InterfazDAO {
    public abstract boolean crear();
    public abstract boolean eliminar();
    public abstract boolean modificar();
    public abstract boolean consultar();
    public abstract int consultarConCaracter(char caracter,int numerLineas);
    public abstract int consultarCantidadPalabras(int lineasAnalizar);
    
}
