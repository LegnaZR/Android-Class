package mx.fca.listas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    ImageView imgFotografia;

    TextView txvNombre;
    TextView txvTelefono;
    TextView txvDireccion;

    TextView txvCorreo;
    TextView txvCorreo2;

    TextView TxvEtiqueta;



    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
    }
}