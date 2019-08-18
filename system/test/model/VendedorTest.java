 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;
import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 */
public class VendedorTest extends TestCase{
    
    public VendedorTest() {
    }
    
    
    /**
     * Test of consultarCliente method, of class Vendedor.
     */
    @Test
    public void testConsultarClienteEquals() {
        String cedula = "1234567890";
        Vendedor instance = new Vendedor();
        LinkedList<String> datos=new LinkedList<>();
        datos.add("ginger");
        datos.add("jaco");
        datos.add("1234543234");
        datos.add("san carlos");
        datos.add("ging@espol.edu.ec");
        LinkedList<String> result = instance.consultarCliente(cedula);
        assertNotSame(datos, result);
    }
    /**
     * Test of consultarArticulo method, of class Vendedor.
     */
    @Test
    public void testConsultarArticulo() {
        String modo = "";
        String campo = "";
        Vendedor instance = new Vendedor();
        LinkedList<LinkedList<String>> result = instance.consultarArticulo(modo, campo);
        assertNull(result);
    }
    /**
     * Test of ConsultarCliente method, of class Vendedor.
     */
    @Test
    public void testConsultarClienteEmpty(){
        String cedula = "1234567890";
        Vendedor instance = new Vendedor();
        LinkedList<String> result = instance.consultarCliente(cedula);
        assertTrue(result.isEmpty());
    }
    
}
