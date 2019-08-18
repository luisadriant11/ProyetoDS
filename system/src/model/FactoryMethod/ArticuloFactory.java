 package model.FactoryMethod;

/**
 *
 */
public class ArticuloFactory implements ArticuloFactoryMethod{

    @Override
    public Articulo crearArticulo(String modelo, String marca, String categoria, String color, float precio, int stock) {
        if(categoria.equalsIgnoreCase("refrigeradora")){
            return new ConsolaVideoJuegos(modelo,marca,categoria,color,precio,stock);
        }
        else if(categoria.equalsIgnoreCase("cocina")){
            return new Telefono(modelo,marca,categoria,color,precio,stock);
          
        }
        else if(categoria.equalsIgnoreCase("lavadora")){
            return new Camara(modelo,marca,categoria,color,precio,stock);
          
        }
        return null;
    }    
}
