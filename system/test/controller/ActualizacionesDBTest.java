 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class ActualizacionesDBTest {
    private static final Logger logger= Logger.getLogger(ActualizacionesDBTest.class.getName());
    
    public ActualizacionesDBTest() {
    }

    /**
     * Test of datosActualizarVenta method, of class ActualizacionesDB.
     */
    @Test
    public void testDatosActualizarVenta() {
        logger.info("datosActualizarVenta");
        String codigo = "";
        ActualizacionesDB instance = new ActualizacionesDB();
        LinkedList<String> result = (LinkedList<String>) instance.datosActualizarVenta(codigo);
        assertTrue( result.isEmpty());
    }

    /**
     * Test of mostrarMensaje method, of class ActualizacionesDB.
     */
    @Test
    public void testMostrarMensaje() {
        logger.info("mostrarMensaje");
        String cadena = "maldy";
        ActualizacionesDB instance = new ActualizacionesDB();
        instance.mostrarMensaje(cadena);
    }
    
}
