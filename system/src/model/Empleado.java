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
public class Empleado extends Persona{
    protected String usuario;
    protected String contrasena;

    public Empleado(String usuario, String contrasena, String nombre, String direccion, String telefono, String correo, String cedula) {
        super(nombre, direccion, telefono, correo, cedula);
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }


    

    
    
    
}
