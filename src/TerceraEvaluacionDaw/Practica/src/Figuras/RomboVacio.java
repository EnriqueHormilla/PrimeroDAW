/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

/**
 *
 * @author Enrique Hormilla
 */
public class RomboVacio {
    private int n, lineasIntermedias, lineasTotales, rombosLinea, rombosLineaTotal, espacioLinea;
    private char caracter;
    private boolean subir;
    private String aux;

    public RomboVacio() {
        this.n = 0;
        this.lineasIntermedias = 0;
        this.lineasTotales = 0;
        this.caracter = 'i';
        this.rombosLinea = 0;
        this.espacioLinea = 0;
        rombosLineaTotal = 0;
        aux = "";
        subir = true;
    }

    public void MostratRombo(int numero, char simbolo) {
        n = numero;
        rombosLineaTotal = n;
        caracter = simbolo;
        lineasIntermedias = n - 1;
        for (int i = 0; i < lineasIntermedias; i++) {
            rombosLineaTotal = rombosLineaTotal + 2;
        }
        lineasTotales = ((lineasIntermedias) * 2) + 1;
        rombosLinea = n;
        espacioLinea = rombosLineaTotal - rombosLinea;
        for (int i = 0; i < lineasTotales; i++) {
            aux += añadirAlString(aux, ' ', espacioLinea / 2);
            aux += añadirAlString(aux, caracter, rombosLinea);
            aux += añadirAlString(aux, ' ', espacioLinea / 2);

            System.out.println(aux);
            aux = "";
            if (subir) {
                if (rombosLinea < rombosLineaTotal) {
                    rombosLinea = rombosLinea + 2;
                    espacioLinea = espacioLinea - 2;
                } else {
                    subir = false;
                    rombosLinea = rombosLinea - 2;
                    espacioLinea = espacioLinea + 2;
                }
            } else {
                rombosLinea = rombosLinea - 2;
                espacioLinea = espacioLinea + 2;
            }

        }
    }

    private String añadirAlString(String cadena, char caracter, int numeroVeces) {
        String auxsiliar = "";
        for (int i = 0; i < numeroVeces; i++) {
            if((i>0)&&(i<numeroVeces-1)){
                auxsiliar = auxsiliar + " ";
            }else{
               auxsiliar = auxsiliar + caracter;  
            }
           
        }
        return auxsiliar;
    }

    @Override
    public String toString() {
        return "Rombo{" + "n=" + n + ", lineasIntermedias=" + lineasIntermedias + ", lineasTotales=" + lineasTotales + ", rombosLinea=" + rombosLinea + ", rombosLineaTotal=" + rombosLineaTotal + ", espacioLinea=" + espacioLinea + ", caracter=" + caracter + '}';
    }

    public static void main(String[] args) {
        RomboVacio a = new RomboVacio();
        a.MostratRombo(5, 'c');

    } 
}
