 package model.FactoryMethod;

public abstract class Articulo {

    protected String modelo;
    protected String descripcion;
    protected String categoria;
    protected int stock;
    protected float precio;
    protected String marca;
    protected String color;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Articulo(String modelo, String marca, String categoria, String color, float precio, int stock) {
        this.modelo = modelo;
        this.categoria = categoria;
        this.stock = stock;
        this.precio = precio;
        this.marca = marca;
        this.color = color;
    }
    
    public Articulo(){
        
    }

    public abstract void setDescripcion();

    public abstract String getDescripcion();

    public abstract int getStock();

    public abstract float getPrecio();

    public String getCategoria() {
        return categoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }
}
