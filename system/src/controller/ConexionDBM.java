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

    private final String URL = "jdbc:mysql://localhost:3306/tecnoImportDB";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";    

    public Connection establecerConexion(Connection conexion) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(this.URL, this.USERNAME, this.PASSWORD);
            System.out.println("Conexion exitosa");
            return conexion;
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            conexion = null;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            conexion = null;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            conexion = null;
        }
        return conexion;
    }
    
    public void cerrarConexion(Connection conexion) {
        try {
            conexion.close();
            System.out.println("Servidor desconectado");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDBM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
