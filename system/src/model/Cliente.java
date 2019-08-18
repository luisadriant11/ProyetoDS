 package model;

import java.util.Date;
import java.util.LinkedList;
import model.FactoryMethod.Articulo;

public class Cliente extends Persona {

    private float totalGastado;
    private LinkedList<Articulo> artComprados;
    
    public Cliente() {       
    }        

    public Cliente(String nombre, String apellido, Date fechaNacimiento, String numeroTelefonico, String direccionDomicilio, String correoElectronico, String cedula) {
        super(nombre, apellido, fechaNacimiento, numeroTelefonico, direccionDomicilio, correoElectronico, cedula);
    }        
    
    public void calcularTotalGastado(){
        
    }

    public float getTotalGastado() {
        return totalGastado;
    }

    public void setTotalGastado(float totalGastado) {
        this.totalGastado = totalGastado;
    }

    public LinkedList<Articulo> getArtComprados() {
        return artComprados;
    }

    public void setArtComprados(LinkedList<Articulo> artComprados) {
        this.artComprados = artComprados;
    }
}
