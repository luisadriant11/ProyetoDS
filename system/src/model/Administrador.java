/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ProyDS 3
 */
public class Administrador extends Empleado{
    
    public Administrador(String usuario, String contrasena, String nombre, String direccion, String telefono, String correo, String cedula) {
        super(usuario, contrasena, nombre, direccion, telefono, correo, cedula);
    }
    
    public boolean agregarArticulo(Articulo a){
        return false;
    }
    
    public boolean actualizarStock(Articulo a, int cant){
        return false;
    }
    
    public boolean actualizarPrecio(Articulo a, int cant){
        return false;
    }
    
    public boolean elimiarArticulo(Articulo a){
        return false;
    }
}
