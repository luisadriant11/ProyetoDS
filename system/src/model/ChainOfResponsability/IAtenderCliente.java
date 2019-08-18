 package model.ChainOfResponsability;

import model.Strategy.FormaPago;
import java.util.LinkedList;
import model.FactoryMethod.Articulo;
import model.Vendedor;
import model.Venta;

/**
 *
 */

public interface IAtenderCliente {
    public void setNex(IAtenderCliente atender);
    public IAtenderCliente getNex();
    public void realizarVenta(Venta venta, Vendedor vendedor, String cedulaCliente, LinkedList<String> productosComprados, FormaPago fpago);
    public void realizarCotizacion(Articulo a);    
}
