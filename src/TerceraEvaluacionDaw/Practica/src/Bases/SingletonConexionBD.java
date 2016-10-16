/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bases;

import java.sql.*;
import java.sql.DriverManager;
import java.util.concurrent.locks.StampedLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrique Hormilla
 */
public class SingletonConexionBD {
    private static Connection conexion;

    private SingletonConexionBD() {
        try {
            //Inidcar driver a utilizar
            Class.forName("com.mysql.jdbc.Driver");
            //Crear la conexion
            this.conexion = DriverManager.getConnection ("jdbc:mysql://localhost:3306/programacion","root","");
        } catch (SQLException ex) {
            Logger.getLogger(SingletonConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SingletonConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConexion() {
        if( conexion==null)
            new SingletonConexionBD();                
        return conexion;
    }
//    public static void main(String[] args) throws SQLException {
//       Connection con=SingletonConexionBD.getConexion();
//       Statement s=con.createStatement();
//       ResultSet rs=s.executeQuery("SELECT * FROM `veleros` WHERE 1");
//        while (rs.next()) {            
//           try {
//               System.out.println(rs.getInt(0));
//           } catch (SQLException ex) {
//               Logger.getLogger(SingletonConexionBD.class.getName()).log(Level.SEVERE, null, ex);
//           }
//        }
//    }

}
