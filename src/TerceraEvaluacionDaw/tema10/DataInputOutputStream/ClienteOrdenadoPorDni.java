/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema10.DataInputOutputStream;

import java.util.Comparator;

/**
 *
 * @author Enriquea
 */
public class ClienteOrdenadoPorDni implements Comparator<Cliente>{

    @Override
    public int compare(Cliente t, Cliente t1) {
       return t.getDni()-t1.getDni();
    }
    
}
