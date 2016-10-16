package Bases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {
    private static Connection conexion;

    public static Connection getConexion() {
        if (conexion == null) {
            new ConexionBD();
        }
        return conexion;
    }

    private ConexionBD() {
        String tira;
        try {
            // Creamos conexion
            //Class.forName(getDriver());
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/programacion","root","");       
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void setConexion(Connection conexion) {
        ConexionBD.conexion = conexion;
    }

   
}
