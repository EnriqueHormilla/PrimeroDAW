package GerardoCabron;

import Bases.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewMain {

    public static void main(String[] args) {
        Connection con;
        try {
           Class.forName("com.mysql.jdbc.Driver");
       con = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/programacion", "root", "");
            //con = ConexionBD.getConexion();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM VELEROS");

            while (rs.next()) {
                int nped = rs.getInt(1);
                System.out.println("Nº Pedidos: " + rs.getInt(1));
            }
            rs.close();
            stm.close();
            con.close();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
