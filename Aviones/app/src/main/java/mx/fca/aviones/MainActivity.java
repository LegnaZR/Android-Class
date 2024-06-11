package mx.fca.aviones;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnNext, btnPrev;
    Plano plano;
    RecyclerView listaAviones;
    AvionAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaAviones = findViewById(R.id.listaAviones);
        btnNext = findViewById(R.id.btnNext);
        btnPrev = findViewById(R.id.btnPrev);

        plano =  Planificador.crearRutaInicial();
        Analizador.inicializa(plano);
        Avion[][] planoMatriz = plano.crearPlanoConEspacios();

        adapter = new AvionAdapter(planoMatriz, plano.row, plano.col);
        listaAviones.setAdapter(adapter);
        listaAviones.setLayoutManager(new GridLayoutManager(this, plano.col));

        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                plano = plano.next();
                adapter.updatePlano(plano.crearPlanoConEspacios(), plano.row, plano.col);
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                plano = plano.prev();
                adapter.updatePlano(plano.crearPlanoConEspacios(), plano.row, plano.col);
            }
        });
    }
}