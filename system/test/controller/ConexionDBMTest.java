 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class ConexionDBMTest {
    private static final Logger logger= Logger.getLogger(ConexionDBMTest.class.getName());
    
    public ConexionDBMTest() {
    }
    /**
     * Test of establecerConexion method, of class ConexionDBM.
     */
    @Test
    public void testEstablecerConexion() {
        logger.info("establecerConexion");
        Connection conexion = null;
        ConexionDBM instance = new ConexionDBM();
        Connection result = instance.establecerConexion(conexion);
        assertNotNull(result);
    }
    
}
