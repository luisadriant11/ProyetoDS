/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.FactoryMethod.Telefono;
import model.FactoryMethod.ConsolaVideoJuegos;
import model.FactoryMethod.Camara;
import model.FactoryMethod.Articulo;
import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class CotizacionTest {
    
    public CotizacionTest() {
    }
    

    /**
     * Test of calcularTotal method, of class Cotizacion.
     */
    @Test
    public void testCalcularTotal() {
        System.out.println("calcularTotal");
        Articulo x= new Telefono("X", "X", "X", "X", (float) 1.0, 1);
        Articulo y= new ConsolaVideoJuegos("Y", "Y", "Y", "Y", (float) 2.0, 1);
        Articulo z= new Camara("Z", "Z", "Z", "Z", (float) 3.0, 1);
        LinkedList<Articulo> listArticulos=new LinkedList<>();
        listArticulos.add(x);
        listArticulos.add(y);
        listArticulos.add(z);
        Cotizacion instance = new Cotizacion();
        instance.calcularTotal(listArticulos);
        float expResult=x.getPrecio()+y.getPrecio()+z.getPrecio();
        float result= instance.getTotal();
        assertFalse(expResult!=result);
    }

    
}
