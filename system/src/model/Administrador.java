package model;

import model.FactoryMethod.Articulo;
import model.Observer.PeticionPermiso;
import model.ChainOfResponsability.Transaccion;
import controller.ConsultasDB;
import controller.IngresosDB;
import java.util.LinkedList;
import java.util.logging.Logger;

public class Administrador extends Empleado implements PeticionPermiso{
    private IngresosDB ingreso;
    private ConsultasDB consultas;
    private static final Logger logger= Logger.getLogger(Administrador.class.getName());
    
    public Administrador() {
        ingreso = new IngresosDB();
        consultas =new ConsultasDB();        
    }
    
    public void agregarArticulo(Articulo a){
        ingreso.agregarArticuloDB(a);
    }
    
    public void manejarTransacciones() {
        // TODO implement here
    }

    public void ingresarStock(Articulo a, int num) {
        // TODO implement here
    }

    public void actualizarStock(float num) {
        // TODO implement here
    }

    public void ingresarPrecioDeVenta(float num) {
        // TODO implement here
    }

    public void actualizarPrecioDeVenta(float num) {
        // TODO implement here
    }

    public boolean consultarArticulo(Articulo a) {
        // TODO implement here
        return false;
    }

    public void eliminarArticulo(Articulo a) {
        // TODO implement here
    }

    public void ingresarTransaccion(Transaccion t) {
        // TODO implement here
    }

    public void actualizarTransaccion(Transaccion t) {
        // TODO implement here
    }

    public boolean consultarTransaccion(Transaccion t) {
        // TODO implement here
        return false;
    }

    public void eliminarTransaccion(Transaccion t) {
        // TODO implement here
    }

    public void ingresarCliente(boolean b, Empleado e) {
        // TODO implement here
    }

    public void actualizarCliente(boolean b, Empleado e) {
        // TODO implement here
    }

    public boolean consultarCliente(boolean b, Empleado e) {
        // TODO implement here
        return false;
    }

    public void eliminarCliente(boolean s, Empleado e) {
        // TODO implement here
    }

    @Override
    public void update() {
        logger.info("Administrador:");
        logger.info("Concebir permiso ...");
    }

    @Override
    public LinkedList<LinkedList<String>> consultarArticulo(String modo, String campo) {
        logger.info("consulta articulo ...");        
        logger.info(modo);
        logger.info(campo);
        LinkedList<LinkedList<String>> datos = (LinkedList<LinkedList<String>>) consultas.consultarArticulo(modo, campo);
        return datos;
    }

    @Override
    public LinkedList<String> consultarCliente(String cedula) {
        //Implementacion del metodo
        return null;
    }
}
