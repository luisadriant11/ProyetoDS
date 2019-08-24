package model;

import model.FactoryMethod.Articulo;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Logger;

public class Cotizacion {

    private String codigo;
    private Date fecha;
    private float total;
    private static final Logger logger= Logger.getLogger(Cotizacion.class.getName());;

    public Cotizacion() {
    }

    public Cotizacion(Date fecha, float total) {
        this.fecha = fecha;
        this.total = total;
        setCodigo();
    }

    public String getCodigo() {
        return codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void calcularTotal(LinkedList<Articulo> listArticulos){
        if (null!=listArticulos) {
            listArticulos.forEach((a) -> {
                total += a.getPrecio();
            });
        }
    }
    
    public void mostrarProductosCotizados(LinkedList<Articulo> listArticulos){
        if (null != listArticulos) {
            listArticulos.forEach((a) -> {
                logger.info(a.getCategoria() + a.getDescripcion());
            });
        }
    }    
    
    private void setCodigo(){
        SimpleDateFormat formateador1 = new SimpleDateFormat("yyyyMMddhhmmss");                        
        java.util.Date ahora = new java.util.Date();        
        String codigoS = formateador1.format(ahora);
        this.codigo=codigoS;
    }
}
