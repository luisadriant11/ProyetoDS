 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class GerenteTest {
    
    public GerenteTest() {
    }
    

    /**
     * Test of generarReporteVendedor method, of class Gerente.
     */
    @Test
    public void testGenerarReporteVendedor() {
        Gerente instance = new Gerente();
        LinkedList<LinkedList<String>> expResult = null;
        LinkedList<LinkedList<String>> result = instance.generarReporteVendedor();               
        assertSame(expResult, result);
        
    }
    
}
