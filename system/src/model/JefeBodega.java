/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author ProyDS 3
 */
public class JefeBodega extends Empleado implements Observador{
    
    protected List<String> listaEntrega=null;
    
    public JefeBodega(String usuario, String contrasena, String nombre, String direccion, String telefono, String correo, String cedula) {
        super(usuario, contrasena, nombre, direccion, telefono, correo, cedula);
    }
    
    public boolean ingresoProductosLocales(LinkedList<Articulo> articulos){
        return true;
    }
    
    public void crearRutasDeEntrega(){
        listaEntrega=new LinkedList();
    }
    
    public Repartidor asignarRepartidor(){
        return null;
        
    }
    
    public void reportarNovedades(String s){
        
    }

    @Override
    public void reportar(EntregaDomicilio ed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
