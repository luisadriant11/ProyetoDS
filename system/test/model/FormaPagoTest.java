 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Strategy.FormaPago;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class FormaPagoTest {
    
    public FormaPagoTest() {
    }
    /**
     * Test of pagar method, of class FormaPago.
     */
    @Test
    public void testPagar() {
        System.out.println("pagar");
        String modo = "EFECTIVO";
        float total = 0.0F;
        FormaPago instance = new FormaPago();
        instance.pagar(modo, total);
        assertNotNull(instance);
    }
    
}
