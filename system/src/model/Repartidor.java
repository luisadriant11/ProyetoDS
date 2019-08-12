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
public class Repartidor extends Empleado implements Observador{
    
    protected int entregasRealizadas;
    protected boolean disponibilidad;

    public Repartidor(String usuario, String contrasena, String nombre, String direccion, String telefono, String correo, String cedula) {
        super(usuario, contrasena, nombre, direccion, telefono, correo, cedula);
        this.entregasRealizadas=0;
        this.disponibilidad=true;
    }

    @Override
    public void reportar(EntregaDomicilio ed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
