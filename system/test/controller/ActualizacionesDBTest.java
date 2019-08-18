 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.LinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class ActualizacionesDBTest {
    
    public ActualizacionesDBTest() {
    }

    /**
     * Test of datosActualizarVenta method, of class ActualizacionesDB.
     */
    @Test
    public void testDatosActualizarVenta() {
        System.out.println("datosActualizarVenta");
        String codigo = "";
        ActualizacionesDB instance = new ActualizacionesDB();
        LinkedList<String> result = instance.datosActualizarVenta(codigo);
        assertTrue( result.isEmpty());
    }

    /**
     * Test of mostrarMensaje method, of class ActualizacionesDB.
     */
    @Test
    public void testMostrarMensaje() {
        System.out.println("mostrarMensaje");
        String cadena = "";
        ActualizacionesDB instance = new ActualizacionesDB();
        instance.mostrarMensaje(cadena);
    }
    
}
