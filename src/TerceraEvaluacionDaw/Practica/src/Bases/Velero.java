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
public class Velero {
    private int matricula;
    private int metrosEslora;
    private int numeroMastiles;

    public Velero(int matricula, int metrosEslora, int numeroMastiles) {
        this.matricula = matricula;
        this.metrosEslora = metrosEslora;
        this.numeroMastiles = numeroMastiles;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMetrosEslora() {
        return metrosEslora;
    }

    public void setMetrosEslora(int metrosEslora) {
        this.metrosEslora = metrosEslora;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    public void setNumeroMastiles(int numeroMastiles) {
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "matricula=" + matricula + ", metrosEslora=" + metrosEslora + ", numeroMastiles=" + numeroMastiles + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.matricula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Velero other = (Velero) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        return true;
    }
        
}
