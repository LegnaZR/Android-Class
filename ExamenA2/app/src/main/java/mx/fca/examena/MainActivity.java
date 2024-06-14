package mx.fca.examena;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends Activity {




    TextView txvInfo;
    Button btnGenerar;
    EditText editTextNumber;


    @Override
    protected void onCreate( @Nullable Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);

        txvInfo = findViewById(R.id.txvInfo);
        btnGenerar = findViewById(R.id.btnGenerar);
        editTextNumber = findViewById(R.id.editTextNumber);


    }
}
