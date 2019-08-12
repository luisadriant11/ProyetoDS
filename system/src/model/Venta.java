/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.LinkedList;


public class Venta extends Responsabilitty {
    protected String codigo;
    protected Date fecha;
    protected LinkedList<Articulo> productosVendidos;
    protected float subtotal;
    protected float iva;
    protected float total;
    protected Pago formaPago;

    public Venta(LinkedList<Articulo> productosVendidos,Pago formaPago) {
        this.codigo = "";
        this.fecha = new Date();
        this.productosVendidos = productosVendidos;
        this.subtotal = 0;
        this.iva = 0;
        this.total = 0;
        this.formaPago = formaPago;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LinkedList<Articulo> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(LinkedList<Articulo> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public float getSubtotal() {
        productosVendidos.forEach((i) -> {
            subtotal+=i.precio;
        });
        return subtotal;
    }


    public float getIva() {
        iva=(float) (subtotal*0.12);
        return iva;
    }



    public float getTotal() {
        total=getSubtotal()+getIva();
        return total;
    }


    public Pago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(Pago formaPago) {
        this.formaPago = formaPago;
    }
    
    
    
    
    
    @Override
    public void setNextResponsability() {
        super.setNextResponsability(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
