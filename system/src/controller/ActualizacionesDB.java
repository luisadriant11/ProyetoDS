 package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 */
public class ActualizacionesDB {
     private Connection conexion;
     private PreparedStatement pst;
    private Logger logger;
    
    public ActualizacionesDB(){        
        this.conexion = new ConexionDBM().establecerConexion(conexion);
        logger = Logger.getLogger(ConsultasDB.class.getName());
    }
    
    public List<String> datosActualizarVenta(String codigo){
        LinkedList<String> datos = new LinkedList<>();
        try {
            logger.info("entra al nombre");
            pst = conexion.prepareStatement("SELECT * FROM t_venta WHERE Venta_Cod = ?");           
            pst.setString(1, codigo);
            try (ResultSet rs = pst.executeQuery()) {
                logger.info("ejecucion del query");
                while (rs.next()) {
                    datos.add(String.valueOf(rs.getDouble("Venta_Subtotal")));
                    datos.add(String.valueOf(rs.getDouble("Venta_Total")));                
                }
            }
            return datos;
        } catch (SQLException ex) {
            logger.info("Error al cargar productos en la db");
            logger.info(ex.getSQLState());
        }return Collections.emptyList();
    }
    
    public void actualizarPermisos(String usuario,String tipo){
        try{
            pst = conexion.prepareStatement("UPDATE t_usuario SET tipo = ?, WHERE usuario = ?");
            pst.setString(1, tipo);
            pst.setString(2, usuario);
            int rs=pst.executeUpdate();
            if (rs > 0) {
                mostrarMensaje( "USUARIO ACTUALIZADO EXITOSAMENTE!");
                logger.info("usu bien");
            } else {
                mostrarMensaje( "USUARIO NO ACTUALIZADO EXITOSAMENTE!");
                logger.info("usu mal");
            }
            
        }catch (SQLException ex) {
            logger.info("Error al cargar usuarios en la db");
            logger.info(ex.getSQLState());
        }
    }
    
    public void actualizarVenta(String codigo, Double subtotal, Double total){
        try {
            pst = conexion.prepareStatement("UPDATE t_venta SET Venta_Subtotal = ?, Venta_Total = ? WHERE Venta_Cod = ?");
            pst.setDouble(1, subtotal);
            pst.setDouble(2, total);
            pst.setString(3, codigo);            
            int res = pst.executeUpdate();
            if (res > 0) {
                mostrarMensaje( "VENTA ACTUALIZADA EXITOSAMENTE!");
                logger.info("actv bien");
            } else {
                mostrarMensaje( "VENTA NO ACTUALIZADA EXITOSAMENTE!");
                logger.info("actv mal");
            }
        } catch (SQLException ex) {
            mostrarMensaje("VENTA NO ACTUALIZADA EXITOSAMENTE!");
            logger.info("actv mal");
            logger.info(ex.getMessage());
        }
    }
    public void mostrarMensaje(String cadena){
        JOptionPane.showMessageDialog(null, cadena);
    }
}
