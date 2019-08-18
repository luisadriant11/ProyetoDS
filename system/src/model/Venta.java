 package model;

import model.Strategy.FormaPago;
import java.text.SimpleDateFormat;
import java.util.*;

public class Venta {
    
    private String codigo;
    private Date fecha;
    private float subtotal;
    private float total;
    private final float iva=(float) 0.12;
    private FormaPago pago;
    
    public Venta() {
        
    }

    public String getCodigo() {
        return codigo;
    }
    
    public FormaPago getPago(){
        return this.pago;
    }
    
    public Venta(Date fecha, float subtotal, float total) {
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.total = total;        
        SimpleDateFormat formateador1 = new SimpleDateFormat("yyyyMMddhhmmss");                        
        java.util.Date ahora = new java.util.Date();        
        String codigoS = formateador1.format(ahora);
        this.codigo=codigoS;
    }        
    
    public double calcularValorTotal() {
        return this.total=this.subtotal+this.subtotal*this.iva;
    }
    
    public void generarPago(String modo){
        pago = new FormaPago();
        pago.pagar(modo, total);       
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha() {
        this.fecha = new Date();
    }    

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
}
