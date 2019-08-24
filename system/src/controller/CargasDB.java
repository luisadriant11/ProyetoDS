/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Administrador;
import model.FactoryMethod.Articulo;
import model.FactoryMethod.Telefono;
import model.Empleado;
import model.Gerente;
import model.FactoryMethod.Camara;
import model.FactoryMethod.ConsolaVideoJuegos;
import model.Vendedor;

/**
 *
 */
public class CargasDB {

    private Connection conexion;
    private Logger logger;

    public CargasDB() {
        this.conexion = new ConexionDBM().establecerConexion(conexion);
        logger = Logger.getLogger(CargasDB.class.getName());
    }

    public Empleado login(String user, String pass) {
        try {
            try (PreparedStatement pst = conexion.prepareStatement("SELECT * FROM t_usuario WHERE usuario = ? AND pass = ?")) {
                pst.setString(1, user);
                pst.setString(2, pass);
                try (ResultSet resultados = pst.executeQuery()) {
                    while (resultados.next()) {
                        String t = resultados.getString("tipo");
                        switch (t) {
                            case "v":
                                Vendedor v = new Vendedor();
                                setearDatos(v, resultados);
                                close(pst, resultados);
                                return v;
                            case "g":
                                Gerente g = new Gerente();
                                setearDatos(g, resultados);
                                close(pst, resultados);
                                return g;
                            case "a":
                                Administrador a = new Administrador();
                                setearDatos(a, resultados);
                                close(pst, resultados);
                                return a;
                            default:
                                break;
                        }
                    }
                }
            }
        } catch (SQLException ex) {
            logger.info("Error al login");
            logger.info(ex.getSQLState());
        }
        return null;
    }

    private void setearDatos(Empleado emp, ResultSet resultados) {
        try {
            emp.setNombre(resultados.getString("nombre"));
            emp.setApellido(resultados.getString("apellido"));
            emp.setFechaNacimiento(resultados.getDate("fecha_nacimiento"));
            emp.setNumeroTelefonico(resultados.getString("telefono"));
            emp.setDireccionDomicilio(resultados.getString("direccion"));
            emp.setCorreoElectronico(resultados.getString("correo"));
            emp.setUsuario(resultados.getString("usuario"));
            emp.setContraseña(resultados.getString("pass"));
            emp.setTipo(resultados.getString("tipo"));
            emp.setIsSuper(resultados.getBoolean("esSuper"));
            emp.setCedula(resultados.getString("cedula"));
        } catch (SQLException ex) {
            Logger.getLogger(CargasDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void close(PreparedStatement pst, ResultSet resultados) {
        try {
            pst.close();
            resultados.close();
        } catch (SQLException ex) {
            Logger.getLogger(CargasDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Articulo> cargarArticulos() {
        LinkedList<Articulo> articulosDisponibles = new LinkedList<>();
        logger.info("conecta db para buscar c");
        try {
            logger.info("entra al nombre");
            try (PreparedStatement pst = conexion.prepareStatement("SELECT * FROM t_articulo"); ResultSet rs = pst.executeQuery()) {
                logger.info("ejecucion del query");
                while (rs.next()) {
                    switch (rs.getString("Art_Categ")) {
                        case "telefono":
                            Telefono telefono = new Telefono(rs.getString("Art_Modelo"), rs.getString("Art_Marca"), rs.getString("Art_Categ"), rs.getString("Art_Color"), rs.getFloat("Art_Precio"), rs.getInt("Art_Stock"));
                            articulosDisponibles.add(telefono);
                            break;
                        case "camara":
                            Camara camara = new Camara(rs.getString("Art_Modelo"), rs.getString("Art_Marca"), rs.getString("Art_Categ"), rs.getString("Art_Color"), rs.getFloat("Art_Precio"), rs.getInt("Art_Stock"));
                            articulosDisponibles.add(camara);
                            break;
                        case "consolaVideoJuegos":
                            ConsolaVideoJuegos consola = new ConsolaVideoJuegos(rs.getString("Art_Modelo"), rs.getString("Art_Marca"), rs.getString("Art_Categ"), rs.getString("Art_Color"), rs.getFloat("Art_Precio"), rs.getInt("Art_Stock"));
                            articulosDisponibles.add(consola);
                            break;
                        default:
                            break;
                    }
                }
            }
            return articulosDisponibles;
        } catch (SQLException ex) {
            logger.info("Error al cargar productos en la db");
            logger.info(ex.getSQLState());
        }
        return Collections.emptyList();
    }
}
