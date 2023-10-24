package com.example.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.pmdm_2324.R;

public class u3a2bParaResultado extends AppCompatActivity {

    public static final String CLAVE_NUMERO = "UNVALORQUEDAIGUALPEROQUENOESTEREPETIDO";

    Button btAceptar;
    Button btCancelar;
    EditText etNumero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u3a2b_para_resultado);

        btAceptar = findViewById(R.id.u3a2idAceptar);
        btCancelar = findViewById(R.id.u3a2idCancelar);
        etNumero = findViewById(R.id.u3a2idetNumero);

        btAceptar.setOnClickListener(view->{
            Intent data = new Intent();
            data.putExtra(CLAVE_NUMERO, etNumero.getText().toString());
            setResult(Activity.RESULT_OK, data);
            //NOOOOOOOOOO no lo hago
            // NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
            // NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
            // NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
            // NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
            // hago un startactivity.
            finish();
        });

        btCancelar.setOnClickListener(view->{
            setResult(Activity.RESULT_CANCELED);
            //NOOOOOOOOOO no lo hago
            // NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
            // NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
            // NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
            // NOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
            // hago un startactivity.
            finish();
        });
    }
}