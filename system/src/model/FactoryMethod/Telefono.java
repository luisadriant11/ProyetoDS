package model.FactoryMethod;

public class Telefono extends Articulo {
    private int numCamaras;
    private boolean tieneSeguridadBiometrica;

    public Telefono(String modelo, String marca, String categoria, String color, float precio, int stock) {
        super(modelo, marca, categoria, color, precio, stock);
    }

    @Override
    public void setDescripcion() {
        this.descripcion= "Numero de camaras: "+numCamaras+", tiene seguridad biometrica: "+tieneSeguridadBiometrica;
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public int getStock() {
        return this.stock;    }

    @Override
    public float getPrecio() {
        return this.precio;
    }

    public void setNumCamaras(int numCamaras) {
        this.numCamaras = numCamaras;
    }

    public void setTieneSeguridadBiometrica(boolean tieneSeguridadBiometrica) {
        this.tieneSeguridadBiometrica = tieneSeguridadBiometrica;
    }
}