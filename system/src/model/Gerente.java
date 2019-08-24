package model;

import model.ChainOfResponsability.Transaccion;
import controller.ConsultasDB;
import controller.ReportesDB;
import java.util.*;
import java.util.logging.Logger;

public class Gerente extends Empleado {
    
    private ConsultasDB consultas;
    private ReportesDB reportes;    
    private static final Logger logger= Logger.getLogger(Administrador.class.getName());;

    public Gerente() {
        this.consultas=new ConsultasDB();
        this.reportes=new ReportesDB();
    }

    @Override
    public LinkedList<String> consultarCliente(String cedula) {
        logger.info("consulta cliente ...");        
        LinkedList<String>datos = (LinkedList<String>) consultas.consultarClienteDB(cedula);
        return datos;
    }
    
    @Override
    public LinkedList<LinkedList<String>> consultarArticulo(String modo, String campo) {
        logger.info("consulta articulo ...");        
        logger.info(modo);
        logger.info(campo);
        LinkedList<LinkedList<String>> datos = (LinkedList<LinkedList<String>>) consultas.consultarArticulo(modo, campo);
        return datos;
    }

    public boolean consultaTransaccion(Transaccion t) {
        // TODO implement here
        return false;
    }
    
    public LinkedList<LinkedList<String>> generarReporteVendedor(){        
        logger.info("Entra a grv");
        LinkedList<LinkedList<String>> datos;
        datos = (LinkedList<LinkedList<String>>) reportes.reporteVendedor();
        return datos;
    }
    
    public LinkedList<LinkedList<String>> generarReporteArticulo(){        
        logger.info("Entra a grv");
        LinkedList<LinkedList<String>> datos;
        datos = (LinkedList<LinkedList<String>>) reportes.reporteArticulo();
        return datos;
    }
}
