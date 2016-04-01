package mx.edu.utng.factorymethod;

/**
 * Created by NQCIT005 on 31/03/2016.
 */
public class ProductoFactory {
    private Producto producto;

    public Producto creaProducto(int tipoProducto){
        if(tipoProducto == 0){
            return null;
        }
        if(tipoProducto == 1){
            return new ProductoJuguete();
        } else if(tipoProducto == 2){
            return  new ProductoRuleta();
        } else if(tipoProducto == 3){
            return new ProductoVocales();
        } else if(tipoProducto == 4){
            return new ProductoOso();
        }
        return null;
    }
}
