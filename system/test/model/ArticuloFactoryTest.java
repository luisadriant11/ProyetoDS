/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.FactoryMethod.ArticuloFactory;
import model.FactoryMethod.Articulo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 */
public class ArticuloFactoryTest {
    
    public ArticuloFactoryTest() {
    }
    
    
    /**
     * Test of crearArticulo method, of class ArticuloFactory.
     */
    @Test
    public void testCrearArticulo() {
        System.out.println("crearArticulo");
        String modelo = "";
        String marca = "";
        String categoria = "";
        String color = "";
        float precio = 0.0F;
        int stock = 0;
        ArticuloFactory instance = new ArticuloFactory();
        Articulo result = instance.crearArticulo(modelo, marca, categoria, color, precio, stock);
        assertNull(result);
    }
    
}
 