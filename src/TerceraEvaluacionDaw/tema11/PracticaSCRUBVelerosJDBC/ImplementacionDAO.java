/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema11.PracticaSCRUBVelerosJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrique
 */
public class ImplementacionDAO implements InterfazDAO {

    private String consulta;
    private Velero velero, auxVelero;
    private Connection connection;
    private Statement statement;
    private ResultSet result;
    private boolean comprobacion;

    public ImplementacionDAO() {
        consulta = "";
        velero = null;
        result = null;

        //hacer conexion
        //Llamar a un metodo de ConexionDB que utiliza el patron singleton
        connection = ConexionBD.getConexion();
        try {
            //crear instruccion JDBC
            statement = connection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ImplementacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        comprobacion = true;
    }

    @Override
    public boolean alta(Object v) {
        velero = (Velero) v;
        consulta = "INSERT INTO veleros VALUES (" + velero.getMatricula() + "," + velero.getMetrosEslora() + "," + velero.getNumeroMastiles() + ");";
        try {
            //crear instruccion
            statement.executeUpdate(consulta);
            
            comprobacion = true;
        } catch (SQLException ex) {
            comprobacion = false;
            Logger.getLogger(ImplementacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comprobacion;
    }

    @Override
    public boolean baja(Object v) {
        velero = (Velero) v;
        consulta = "DELETE FROM `veleros` WHERE `matricula`=" + velero.getMatricula();
        System.out.println(consulta);
        try {
            //crear instruccion
           statement.executeUpdate(consulta);
            
            comprobacion = true;
        } catch (SQLException ex) {
            comprobacion = false;
            Logger.getLogger(ImplementacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comprobacion;
    }

    @Override
    public boolean modificar(Object vNuevo, Object vViejo) {
        if (consulta(vViejo) != null) {
            if (baja(vViejo)) {
                alta(vNuevo);
                comprobacion = true;
            } else {
                comprobacion = false;
            }
        } else {
            comprobacion = false;
        }
        return comprobacion;
    }

    @Override
    public Object consulta(Object v) {
        velero = (Velero) v;
        auxVelero = null;
        consulta = "SELECT FROM `veleros` WHERE `matricula`=" + velero.getMatricula();
        try {
            //crear instruccion
            result = statement.executeQuery(consulta);
            while (result.next()) {
                auxVelero = (Velero) result;
                //System.out.println(result.getString(1) + " " + result.getString(2));
            }
            comprobacion = true;
        } catch (SQLException ex) {
            comprobacion = false;
            Logger.getLogger(ImplementacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return auxVelero;
    }

    @Override
    public Object dameSiguiente(Object v) {
        velero = (Velero) v;
        auxVelero = null;
        int auxNumero = velero.getMatricula() + 1;
        consulta = "Select * FROM veleros Where matricula=" + auxNumero;
        try {
            //crear instruccion
            result = statement.executeQuery(consulta);
            while (result.next()) {
                auxVelero = (Velero) result;
            }
            comprobacion = true;
        } catch (SQLException ex) {
            comprobacion = false;
            Logger.getLogger(ImplementacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return auxVelero;
    }

    @Override
    public Object dameAnterior(Object v) {
        velero = (Velero) v;
        auxVelero = null;
        int auxNumero = velero.getMatricula() - 1;
        consulta = "Select * FROM veleros Where matricula=" + auxNumero;
        try {
            //crear instruccion
            result = statement.executeQuery(consulta);
            while (result.next()) {
                auxVelero = (Velero) result;
            }
            comprobacion = true;
        } catch (SQLException ex) {
            comprobacion = false;
            Logger.getLogger(ImplementacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return auxVelero;
    }

    @Override
    public Object posicionInicial() {
        auxVelero = null;
        consulta = "SELECT FROM `veleros` LIMIT 1";
        System.out.println(consulta);
        try {
            //crear instruccion
            result = statement.executeQuery(consulta);
            while (result.next()) {
                auxVelero = (Velero) result;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImplementacionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return auxVelero;
    }

    public ResultSet getResult() {
        return result;
    }

    public void setResult(ResultSet result) {
        this.result = result;
    }

    public boolean isComprobacion() {
        return comprobacion;
    }

    public void setComprobacion(boolean comprobacion) {
        this.comprobacion = comprobacion;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public Velero getVelero() {
        return velero;
    }

    public void setVelero(Velero velero) {
        this.velero = velero;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

}
