 package model;

import model.FactoryMethod.Articulo;
import model.Observer.NotificacionPeticion;
import model.ChainOfResponsability.IAtenderCliente;
import model.Strategy.FormaPago;
import controller.ConsultasDB;
import controller.IngresosDB;
import java.util.LinkedList;
import java.util.logging.Logger;

public class Vendedor extends Empleado implements IAtenderCliente {

    private ConsultasDB consultas;
    private IngresosDB ingresos;
    private IAtenderCliente next;
    private boolean ocupado;
    private static final Logger logger= Logger.getLogger(Vendedor.class.getName());;

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
   
    public Vendedor() {
        this.consultas=new ConsultasDB();
        this.ingresos=new IngresosDB();
    }

    public void agregarCliente(Cliente cliente) {
        logger.info("agregando cliente ...");        
        ingresos.agregarClienteDB(cliente);
    }
    
    @Override
    public void realizarCotizacion(Articulo a) {
        logger.info("cotizando producto ...");        
    }
    
    @Override
    public void realizarVenta(Venta venta, Vendedor vendedor, String cedulaCliente, LinkedList<String> productosComprados, FormaPago fpago){
        logger.info("vendiendo producto ...");
        ingresos.ingresarVentaDB(venta, vendedor, cedulaCliente);
        ingresos.ingresarPago(venta, fpago);
        ingresos.ingresarDetallesVenta(venta, productosComprados);
        
    }
    
    @Override
    public LinkedList<String> consultarCliente(String cedula) {
        logger.info("consulta cliente ...");        
        LinkedList<String>datos = (LinkedList<String>) consultas.consultarClienteDB(cedula);
        if(null==datos){
            return new LinkedList<>();
        }
        logger.info("++++"+datos);
        return datos;
    }

    @Override
    public LinkedList<LinkedList<String>> consultarArticulo(String modo, String campo) {
        logger.info("consulta articulo ...");        
        logger.info(modo);
        logger.info(campo);
        LinkedList<LinkedList<String>> datos = (LinkedList<LinkedList<String>>) consultas.consultarArticulo(modo, campo);
        return datos;
    }
    
    public void pedirPermiso(){
        logger.info("Necesito permiso");
        NotificacionPeticion notPet = new NotificacionPeticion();
        notPet.notifyObservers();
    }

    @Override
    public void setNex(IAtenderCliente atender) {
        next = atender;
    }

    @Override
    public IAtenderCliente getNex() {
        return next;
    }
}
