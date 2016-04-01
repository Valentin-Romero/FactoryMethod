package mx.edu.utng.factorymethod;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by NQCIT005 on 31/03/2016.
 */
public class Lienzo extends View {
    private Producto producto;
    public Lienzo(Context context, Producto producto) {
        super(context);
        this.producto = producto;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        if(producto!=null){
            producto.elaborarProducto(canvas);
        }
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
