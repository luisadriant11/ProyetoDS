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

    private static final String URL = "jdbc:mysql://localhost:3306/tecno";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";      
    private Logger logger;
    private static final String DRIVER_CLASS_NAME ="com.mysql.jdbc.Driver";

    public Connection establecerConexion(Connection conexion) {
        logger = Logger.getLogger(ConsultasDB.class.getName());
        try {
            Class.forName(DRIVER_CLASS_NAME);
            conexion = DriverManager.getConnection(ConexionDBM.URL, ConexionDBM.USERNAME, ConexionDBM.PASSWORD);
            logger.info("Conexion exitosa");
            return conexion;
        } catch (ClassNotFoundException|SQLException ex){
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
