/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema12.prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author VESPERTINO
 */

    
public class PruebaMySQL {  
    /** 
     * Crea una instancia de la clase MySQL y realiza todo el código 
     * de conexión, consulta y muestra de resultados.
     */
    public PruebaMySQL() {
        // Se mete todo en un try por los posibles errores de MySQL
        try{
            // Se registra el Driver de MySQL
            //DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            
            // Se obtiene una conexión con la base de datos. Hay que
            // cambiar el usuario "root" y la clave "la_clave" por las
            // adecuadas a la base de datos que estemos usando.
            Connection conexion = DriverManager.getConnection (
                "jdbc:mysql://localhost/prueba","root", "");
            
            // Se crea un Statement, para realizar la consulta
            Statement s = conexion.createStatement();
            
            // Se realiza la consulta. Los resultados se guardan en el 
            // ResultSet rs
            ResultSet rs = s.executeQuery ("select * from prueba1");
            
            // Se recorre el ResultSet, mostrando por pantalla los resultados.
            while (rs.next()){
                System.out.println (rs.getInt(1));
            }
            
            // Se cierra la conexión con la base de datos.
            conexion.close();
            s.close();
            //con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
}
    public static void main(String[] args) {
        PruebaMySQL a=new PruebaMySQL();
    }
}


