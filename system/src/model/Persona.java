 package model;

import java.util.*;

public abstract class Persona {

    protected String nombre;
    protected String apellido;
    protected Date fechaNacimiento;
    protected String numeroTelefonico;
    protected String direccionDomicilio;
    protected String correoElectronico;
    protected String cedula;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Date fechaNacimiento, String numeroTelefonico, String direcciónDomicilio, String correoElectronico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefonico = numeroTelefonico;
        this.direccionDomicilio = direcciónDomicilio;
        this.correoElectronico = correoElectronico;
        this.cedula = cedula;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
