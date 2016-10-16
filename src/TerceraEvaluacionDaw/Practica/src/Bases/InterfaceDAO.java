/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bases;

/**
 *
 * @author Enrique Hormilla
 */
public interface InterfaceDAO {
    public abstract void altaVelero(Velero veleroMeter);
    public abstract void bajaVelero(int matriculaVelero);
    public abstract void sustitucionVelero(int matriculaVelero,Velero veleroQueRemplaza);
    public abstract void mostrarDatos(int matricula);
    
}
