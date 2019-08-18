 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Strategy.Credito;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class CreditoTest {
    
    public CreditoTest() {
    }

    /**
     * Test of getModo method, of class Credito.
     */
    @Test
    public void testGetModo() {
        System.out.println("getModo");
        Credito instance = new Credito(9);
        String expResult = "Pago Diferido";                
        String result = instance.getModo();        
        assertEquals(expResult, result);
    }

    
}
