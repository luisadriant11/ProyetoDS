/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ProyDS 3
 */
public class Pago {
    protected String idPago;
    protected double subtotal;
    protected double impuesto;
    protected FormaPago formaPago;

    public Pago(double subtotal, double impuesto, FormaPago formaPago) {
        this.idPago = "";
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.formaPago = formaPago;
    }
    
    
    
    public double calcularTotal(){
        return subtotal+impuesto;
    }
    
    
}
