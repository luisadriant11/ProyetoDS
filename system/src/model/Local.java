/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.LinkedList;

/**
 *
 * @author ProyDS 3
 */
public class Local {
    protected String idLocal;
    protected String direccion;
    protected String telefono;
    protected LinkedList<Articulo> articulos;
    protected boolean internet;
    protected LinkedList<Empleado> empleados;
    protected Gerente gerente;
    protected Administrador administrador;

    public Local(String idLocal, String direccion, String telefono, LinkedList<Articulo> articulos, boolean internet, LinkedList<Empleado> empleados, Gerente gerente, Administrador administrador) {
        this.idLocal = idLocal;
        this.direccion = direccion;
        this.telefono = telefono;
        this.articulos = articulos;
        this.internet = internet;
        this.empleados = empleados;
        this.gerente = gerente;
        this.administrador = administrador;
    }
    
    public void emitirDocumento(Transaccion t){
        System.out.println("Documento emitido");
    }
    
    public boolean verificarConexion(){
        return internet;
    }
}
