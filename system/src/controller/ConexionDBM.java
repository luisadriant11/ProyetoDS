/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 */

public class ConexionDBM {

    private final String URL = "jdbc:mysql://localhost:3306/tecno";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";      
    private Logger logger;

    public Connection establecerConexion(Connection conexion) {
        logger = Logger.getLogger(ConsultasDB.class.getName());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(this.URL, this.USERNAME, this.PASSWORD);
            logger.info("Conexion exitosa");
            return conexion;
        } catch (ClassNotFoundException ex) {
            logger.info(ex.getMessage());
        } catch (SQLException ex) {
            logger.info(ex.getMessage());
        } catch (Exception ex) {
            logger.info(ex.getMessage());
        }
        return null;
    }
    
    public void cerrarConexion(Connection conexion) {
        try {
            conexion.close();
            logger.info("Servidor desconectado");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDBM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
