 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class VentaTest {
    
    public VentaTest() {
    }
 
    /**
     * Test of calcularValorTotal method, of class Venta.
     */
    @Test
    public void testCalcularValorTotalEquals() {
        System.out.println("CalcularValorTotal");
        Venta instance = new Venta();
        instance.setSubtotal(400);
        double result = instance.calcularValorTotal();
        assertEquals(448.0, result, 0.0);
        
    }
    
    
    
}
