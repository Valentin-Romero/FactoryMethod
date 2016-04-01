package mx.edu.utng.factorymethod;

import android.app.Activity;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity {
    private Button btnCrear;
    private RadioGroup rbnGroup;
    private RadioButton rbnJuguete;
    private RadioButton rbnRuleta;
    private LinearLayout linearLayout;
    private Producto producto;
    private ProductoFactory factory;
    private Lienzo lienzo;
    private int tipoPro = 4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponentes();
    }

    private void initComponentes() {
        rbnGroup = (RadioGroup)findViewById(R.id.rgp_producto);
        btnCrear = (Button)findViewById(R.id.btn_crear);
        factory = new ProductoFactory();

        rbnGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.rbn_juguete:
                        tipoPro = 1;
                        break;
                    case R.id.rbn_ruleta:
                        tipoPro = 2;
                        break;
                    case R.id.rbn_vocal:
                        tipoPro = 3;
                        break;
                    case R.id.rbn_oso:
                        tipoPro = 4;
                        break;
                    default:
                        tipoPro = 0;
                        break;
                }
            }
        });

        linearLayout = (LinearLayout)findViewById(R.id._layout_principal);
        lienzo = new Lienzo(MainActivity.this, producto);

        linearLayout.addView(lienzo);

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                producto = factory.creaProducto(tipoPro);

                lienzo.setProducto(producto);
                lienzo.invalidate();
                lienzo.draw(new Canvas());
            }
        });
    }
}
