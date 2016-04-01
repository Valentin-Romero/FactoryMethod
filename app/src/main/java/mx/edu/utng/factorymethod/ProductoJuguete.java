package mx.edu.utng.factorymethod;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by NQCIT005 on 31/03/2016.
 */
public class ProductoJuguete implements Producto {
    @Override
    public void elaborarProducto(Canvas canvas) {

        int ancho =  canvas.getWidth();
        int alto = canvas.getHeight();
        Paint pincel = new Paint();
        pincel.setColor(Color.rgb(244, 228,5));
        pincel.setStyle(Paint.Style.FILL);
        Path path = new Path();
        int x = (int)(Math.random()*ancho);
        int y = (int)(Math.random()*alto);

        path.lineTo(x + 45, y + 13);
        path.lineTo(x + 45, y + 18);
        path.lineTo(x + 51, y + 25);
        path.lineTo(x + 51, y + 33);
        path.lineTo(x+44, y+40);
        path.lineTo(x+17, y+40);
        path.lineTo(x+8, y+33);
        path.lineTo(x+7, y+21);
        path.lineTo(x+12, y+13);
        path.lineTo(x+14, y+13);
        path.lineTo(x+25, y+20);
        path.lineTo(x+31, y+18);
        path.lineTo(x+26, y+11);
        path.lineTo(x+25, y+5);
        path.lineTo(x+32, y+0);
        path.lineTo(x+38, y+0);
        path.lineTo(x+46, y+5);

        path.lineTo(x+45, y+7);
        path.lineTo(x+51, y+3);
        path.lineTo(x+49, y+8);
        path.lineTo(x+50, y+9);
        path.lineTo(x+50, y+12);
        path.lineTo(x+46, y+12);
        path.lineTo(x+45, y+11);

        path.close();
        canvas.drawPath(path, pincel);
    }
}
