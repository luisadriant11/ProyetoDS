package model;

import java.util.LinkedList;

public abstract class Empleado extends Persona {

    public Empleado() {
    }

    protected String usuario;
    protected String contraseña;
    protected String tipo;
    protected boolean isSuper;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isIsSuper() {
        return isSuper;
    }

    public void setIsSuper(boolean isSuper) {
        this.isSuper = isSuper;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public abstract LinkedList<LinkedList<String>> consultarArticulo(String modo, String campo);
    
    public abstract LinkedList<String> consultarCliente(String cedula);
}
