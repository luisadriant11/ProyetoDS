package model.FactoryMethod;

public class Camara extends Articulo {

    private float capacidadMemoria;
    private String tipo;

    public Camara(String modelo, String marca, String categoria, String color, float precio, int stock) {
        super(modelo, marca, categoria, color, precio, stock);
    }

    @Override
    public void setDescripcion() {
        this.descripcion = "Capacidad: " + capacidadMemoria + "GB, tipo: " + tipo;
    }

    @Override
    public String getDescripcion() {
        return this.descripcion;
    }

    @Override
    public int getStock() {
        return this.stock;
    }

    @Override
    public float getPrecio() {
        return this.precio;
    }

    public void setCapacidadMemoria(float capacidadMemoria) {
        this.capacidadMemoria = capacidadMemoria;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
