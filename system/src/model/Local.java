 package model;

import model.FactoryMethod.Articulo;
import java.util.LinkedList;

public class Local {

    private int idLocal;
    private String dirección;
    private String telefono;
    private LinkedList<Articulo> articulos;
    private boolean internet;
    
    public Local() {
    }

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public LinkedList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(LinkedList<Articulo> articulos) {
        this.articulos = articulos;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public void pedirAbastecimiento() {
        // TODO implement here
    }
}
