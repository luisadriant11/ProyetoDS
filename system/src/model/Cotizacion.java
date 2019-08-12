/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;


public class Cotizacion extends Responsabilitty {
    protected String codigo;
    protected Date fecha;
    protected float total;
    protected LinkedList<Articulo> articulos;

    public Cotizacion() {
        this.codigo = "";
        this.fecha = new Date();
        this.total = 0;
    }

    public Cotizacion(Date fecha, float total) {
        this.fecha = fecha;
        this.total = total;
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

    public float getTotal() {
        calcularTotal();
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    private void calcularTotal() {
        Articulo art;
        float cont=0;
        for (Iterator<Articulo> it = articulos.iterator(); it.hasNext();) {
            art = it.next();
            cont+=art.getPrecio();
        }
        total=cont;       
    }
    
    @Override
    public void setNextResponsability(){
        
    }
}
