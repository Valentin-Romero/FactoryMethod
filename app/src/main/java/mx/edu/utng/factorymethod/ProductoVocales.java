package mx.edu.utng.factorymethod;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/**
 * Created by NQCIT005 on 31/03/2016.
 */
public class ProductoVocales implements Producto {
    @Override
    public void elaborarProducto(Canvas canvas) {
        int ancho = canvas.getWidth();
        int alto = canvas.getHeight();
        int x = (int)(Math.random()*ancho);
        int y = (int)(Math.random()*alto);
        Paint pincel = new Paint();
        pincel.setARGB(255, 255, 0, 0);
        pincel.setTextSize(30);

        pincel.setTypeface(Typeface.DEFAULT_BOLD);
        canvas.drawText("Aa Ee Ii Oo Uu", x, y, pincel);

    }
}
