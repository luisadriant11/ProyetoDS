 package model.Decorator;

import model.Vendedor;

public abstract class VendedorDecorator extends Vendedor {

    private Vendedor vendedor;

    public VendedorDecorator(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
       
    public abstract void editarVenta(String codigo, double subtotal, double total);    
}
