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
public class run {
    public static void main(String[] args) {
        Velero v1=new Velero(1, 1, 1);
        Velero v2=new Velero(2, 2, 2);
        Velero v3=new Velero(3, 3, 3);
        ImplementacionDAOMySQL sql=new ImplementacionDAOMySQL();
        sql.altaVelero(v1);
        sql.altaVelero(v2);
        sql.altaVelero(v3);

    }
    
}
