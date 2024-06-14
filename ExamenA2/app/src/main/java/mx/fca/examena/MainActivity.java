package mx.fca.examena;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends Activity {

    TextView txvInfo;
    Button btnGenerar, btnBack;
    EditText editTextNumber;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvInfo = findViewById(R.id.txvInfo);
        btnGenerar = findViewById(R.id.btnGenerar);
        editTextNumber = findViewById(R.id.editTextNumber);

        btnGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editTextNumber.getText().toString();
                try {
                    int number = Integer.parseInt(inputText);
                    int sqrt = (int) Math.sqrt(number);
                    if (sqrt * sqrt == number) {
                        // Es un cuadrado perfecto
                        showPantalla2(number);
                    } else {
                        txvInfo.setText("El número no es un cuadrado perfecto.");
                    }
                } catch (NumberFormatException e) {
                    txvInfo.setText("Por favor, introduce un número válido.");
                }
            }
        });
    }

    private void showPantalla2(int number) {
        setContentView(R.layout.pantalla2);

        recyclerView = findViewById(R.id.RecyclerV);
        btnBack = findViewById(R.id.btnBack);

        int columns = (int) Math.sqrt(number);
        recyclerView.setLayoutManager(new GridLayoutManager(this, columns));
        recyclerView.setAdapter(new VistaHolder(number));

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main);

                txvInfo = findViewById(R.id.txvInfo);
                btnGenerar = findViewById(R.id.btnGenerar);
                editTextNumber = findViewById(R.id.editTextNumber);

                btnGenerar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String inputText = editTextNumber.getText().toString();
                        try {
                            int number = Integer.parseInt(inputText);
                            int sqrt = (int) Math.sqrt(number);
                            if (sqrt * sqrt == number) {
                                // Es un cuadrado perfecto
                                showPantalla2(number);
                            } else {
                                txvInfo.setText("El número no es un cuadrado perfecto.");
                            }
                        } catch (NumberFormatException e) {
                            txvInfo.setText("Por favor, introduce un número válido.");
                        }
                    }
                });
            }
        });
    }
}
