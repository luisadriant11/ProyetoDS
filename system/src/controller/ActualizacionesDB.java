 package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;
/**
 *
 */
public class ActualizacionesDB {
     private Connection conexion;
     private PreparedStatement pst;
    
    public ActualizacionesDB(){        
        this.conexion = new ConexionDBM().establecerConexion(conexion);
    }
    
    public LinkedList<String> datosActualizarVenta(String codigo){
        LinkedList<String> datos = new LinkedList<>();
        try {
            System.out.println("entra al nombre");
            pst = conexion.prepareStatement("SELECT * FROM t_venta WHERE Venta_Cod = ?");           
            pst.setString(1, codigo);
            ResultSet rs = pst.executeQuery();
            System.out.println("ejecucion del query");
            while (rs.next()) {
                datos.add(String.valueOf(rs.getDouble("Venta_Subtotal")));
                datos.add(String.valueOf(rs.getDouble("Venta_Total")));                
            }
            return datos;
        } catch (SQLException ex) {
            System.out.println("Error al cargar productos en la db");
            System.out.println(ex);
        }return null;
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
                System.out.println("actv bien");
            } else {
                mostrarMensaje( "VENTA NO ACTUALIZADA EXITOSAMENTE!");
                System.out.println("actv mal");
            }
        } catch (SQLException ex) {
            mostrarMensaje("VENTA NO ACTUALIZADA EXITOSAMENTE!");
            System.out.println("actv mal");
            System.out.println(ex.getMessage());
        }
    }
    public void mostrarMensaje(String cadena){
        JOptionPane.showMessageDialog(null, cadena);
    }
}
