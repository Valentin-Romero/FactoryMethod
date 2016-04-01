package mx.edu.utng.factorymethod;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by NQCIT005 on 31/03/2016.
 */
public class ProductoRuleta implements Producto {
    @Override
    public void elaborarProducto(Canvas canvas) {

        int ancho = canvas.getWidth();
        int alto = canvas.getHeight();
        int x = (int)(Math.random()*ancho);
        int y = (int)(Math.random()*alto);
        Paint pincel = new Paint();
        pincel.setColor(Color.BLUE);
        pincel.setStyle(Paint.Style.STROKE);
        for (int i = 0; i < 6; i++) {
            canvas.drawCircle(x, y, i * 15, pincel);
        }
    }
}
