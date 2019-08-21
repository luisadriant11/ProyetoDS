package model.FactoryMethod;

public class ConsolaVideoJuegos extends Articulo {

    private int rendimiento;
    private int memoria;

    public ConsolaVideoJuegos(String modelo, String marca, String categoria, String color, float precio, int stock) {
        super(modelo, marca, categoria, color, precio, stock);
    }
    public ConsolaVideoJuegos(){
        super.descripcion="";
        rendimiento=0;
        memoria=0;
    }

    @Override
    public void setDescripcion() {
        this.descripcion = "rendiemiento:" + rendimiento + "fps, memoria: " + memoria + "GB, color:" + color;
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

    public void setRendimiento(int rendimiento) {
        this.rendimiento = rendimiento;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
}
