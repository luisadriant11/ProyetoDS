 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import model.FactoryMethod.Articulo;
import model.Empleado;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class CargasDBTest {
    
    public CargasDBTest() {
    }

    /**
     * Test of login method, of class CargasDB.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String user = "";
        String pass = "";
        CargasDB instance = new CargasDB();
        Empleado expResult = null;
        Empleado result = instance.login(user, pass);
        assertEquals(expResult, result);
    }
    
}
