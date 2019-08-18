 package model.Decorator;

import controller.ActualizacionesDB;
import java.util.LinkedList;
import model.Vendedor;

public class VendedorEditarVenta extends VendedorDecorator {

    
    private ActualizacionesDB actulizaciones;   
    
    public VendedorEditarVenta(Vendedor vendedor) {
        super(vendedor);
        this.actulizaciones=new ActualizacionesDB();
    }

    @Override
    public void editarVenta(String codigo, double subtotal, double total) {
        System.out.println("edicion de venta ...");
        actulizaciones.actualizarVenta(codigo, subtotal, total);
    }
    
    public LinkedList<String> buscarActualizarVenta(String codigo){
        LinkedList<String> datos = actulizaciones.datosActualizarVenta(codigo);
        return datos;
    }
}
