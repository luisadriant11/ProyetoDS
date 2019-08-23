 package model.Decorator;

import controller.ActualizacionesDB;
import controller.ConsultasDB;
import java.util.LinkedList;
import java.util.logging.Logger;
import model.Vendedor;

public class VendedorEditarVenta extends VendedorDecorator {

    
    private ActualizacionesDB actulizaciones;   
    private Logger logger;
    
    public VendedorEditarVenta(Vendedor vendedor) {
        super(vendedor);
        this.actulizaciones=new ActualizacionesDB();
        logger = Logger.getLogger(ConsultasDB.class.getName());
    }

    @Override
    public void editarVenta(String codigo, double subtotal, double total) {
        logger.info("edicion de venta ...");
        actulizaciones.actualizarVenta(codigo, subtotal, total);
    }
    
    public LinkedList<String> buscarActualizarVenta(String codigo){
        LinkedList<String> datos = (LinkedList<String>) actulizaciones.datosActualizarVenta(codigo);
        return datos;
    }
}
