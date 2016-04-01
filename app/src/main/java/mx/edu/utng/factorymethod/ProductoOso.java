package mx.edu.utng.factorymethod;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by NQCIT005 on 01/04/2016.
 */
public class ProductoOso implements Producto {
    @Override
    public void elaborarProducto(Canvas canvas) {
        //tamaño del lienzo en pantalla
        int ancho =  canvas.getWidth();
        int alto = canvas.getHeight();
        //Creación del Pincel
        Paint pincel = new Paint();
        pincel.setColor(Color.rgb(122, 88, 52));
        pincel.setStyle(Paint.Style.FILL);
        //Ubicaci+on aleatoria
        int x = (int)(Math.random()*ancho);
        int y = (int)(Math.random()*alto);

        //Cabeza del oso
        canvas.drawCircle(x, y, 80, pincel);
        canvas.drawCircle(x, y + 130, 130, pincel);
        //Cuerpo del oso
        canvas.drawCircle(x - 35, y - 60, 30, pincel);
        canvas.drawCircle(x + 35, y - 60, 30, pincel);
        //Orejas
        canvas.drawCircle(x -90, y +80, 40, pincel);
        canvas.drawCircle(x + 90, y +80, 40, pincel);
        //Patas
        canvas.drawCircle(x -70, y +240, 40, pincel);
        canvas.drawCircle(x + 70, y +240, 40, pincel);
        //Cambio de color para ojos y nariz
        pincel.setColor(Color.rgb(254, 254, 254));
        pincel.setStyle(Paint.Style.FILL);
        canvas.drawCircle(x - 25, y - 30, 6, pincel);
        canvas.drawCircle(x + 25, y - 30, 6, pincel);
        canvas.drawCircle(x, y, 3, pincel);

    }
}
