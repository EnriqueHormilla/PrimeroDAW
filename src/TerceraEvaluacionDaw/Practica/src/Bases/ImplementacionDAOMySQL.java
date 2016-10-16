/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrique Hormilla
 */
public class ImplementacionDAOMySQL implements InterfaceDAO {

    private Connection con;
    private Statement stm;

    public ImplementacionDAOMySQL() {
        try {
            con = SingletonConexionBD.getConexion();
            stm = con.createStatement();
        } catch (Exception ex) {
            System.out.println("ayudame perra");
        }
    }

    @Override
    public void altaVelero(Velero veleroMeter) {
        try {
            int a = stm.executeUpdate("INSERT INTO veleros VALUES ("
                    + veleroMeter.getMatricula() + ","
                    + veleroMeter.getMetrosEslora() + ","
                    + veleroMeter.getNumeroMastiles() + ")");
        } catch (SQLException ex) {
            Logger.getLogger(ImplementacionDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void bajaVelero(int matriculaVelero) {
        try {
            ResultSet rs = stm.executeQuery("DELETE FROM `veleros` WHERE `matricula`="
                    + matriculaVelero);
        } catch (SQLException ex) {
            Logger.getLogger(ImplementacionDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void sustitucionVelero(int matriculaVelero, Velero veleroQueRemplaza) {
        bajaVelero(matriculaVelero);
        altaVelero(veleroQueRemplaza);        
    }

    @Override
    public void mostrarDatos(int matricula) {
        try {
            ResultSet rs = stm.executeQuery("SELECT * FROM `veleros` WHERE matricula="+matricula);
           while (rs.next()) {
                int uno = rs.getInt("matricula");
                int dos = rs.getInt(2);
                int tres = rs.getInt(3);
                System.out.println("Nº Pedidos: " + uno + " Nombre: " + dos + " Año: " + tres);
            }
         
           
        } catch (SQLException ex) {
            Logger.getLogger(ImplementacionDAOMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

}
