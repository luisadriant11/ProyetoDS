/*
 * To change this license * To change this template file, choose Tools | Templates
 header, choose License Headers in Project Properties.
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ProyDS 3
 */
public class Persona {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected String correo;
    protected String cedula;

    public Persona(String nombre, String direccion, String telefono, String correo, String cedula) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
}
