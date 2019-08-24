 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import java.util.logging.Logger;
import model.FactoryMethod.Articulo;
import model.Empleado;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class CargasDBTest {
    private static final Logger logger= Logger.getLogger(CargasDBTest.class.getName());
    
    public CargasDBTest() {
    }

    /**
     * Test of login method, of class CargasDB.
     */
    @Test
    public void testLogin() {
        logger.info("login");
        String user = "";
        String pass = "";
        CargasDB instance = new CargasDB();
        Empleado expResult = null;
        Empleado result = instance.login(user, pass);
        assertEquals(expResult, result);
    }
    
}
