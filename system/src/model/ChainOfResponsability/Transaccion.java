 package model.ChainOfResponsability;

import model.Strategy.FormaPago;
import java.util.*;
import java.util.logging.Logger;
import model.FactoryMethod.Articulo;
import model.Vendedor;
import model.Venta;

public class Transaccion implements IAtenderCliente{

    private IAtenderCliente next;
    private int idTransacción=0;
    private Date fecha;
    private int idCliente;
    private int idVendedor;
    private static final Logger logger= Logger.getLogger(Transaccion.class.getName());
    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }
    
    public Transaccion() {
        this.idTransacción+=1; 
    }       
        
    public void registrarTransacción() {
        logger.info("Transacion"+this.idTransacción+" exitosa");
    }

    @Override
    public void setNex(IAtenderCliente atender) {
        next = atender;
    }

    @Override
    public IAtenderCliente getNex() {
        return next;
    }

    @Override
    public void realizarVenta(Venta venta, Vendedor vendedor, String cedulaCliente, LinkedList<String> productosComprados, FormaPago fpago) {
        Vendedor vendedorA = new Vendedor();
        this.setNex(vendedorA);
        next.realizarVenta(venta, vendedor, cedulaCliente, productosComprados, fpago);
    }

    @Override
    public void realizarCotizacion(Articulo a) {
        Vendedor vendedorA = new Vendedor();
        this.setNex(vendedorA);
        next.realizarCotizacion(a);
    }
}
