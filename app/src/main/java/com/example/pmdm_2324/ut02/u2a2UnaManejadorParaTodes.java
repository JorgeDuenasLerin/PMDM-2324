package com.example.pmdm_2324.ut02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pmdm_2324.R;

public class u2a2UnaManejadorParaTodes extends AppCompatActivity {

    Button btR,btG,btB,btY;
    TextView tvSalida;

    View.OnClickListener manejador; // Declarar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u2a2_una_vista_para_todas);

        // ¡¡¡OJO!!!
        btR = findViewById(R.id.u2a2btRojo);
        btG = findViewById(R.id.u2a2btVerde);
        btB = findViewById(R.id.u2a2btAzul);
        btY = findViewById(R.id.u2a2btAmarillo);
        tvSalida = findViewById(R.id.u2a2tvSalida);

        manejador = (View elQueEsPulsado) -> {
            /*
            if(elQueEsPulsado.getId() == R.id.u2a2btAmarillo){
                tvSalida.setText("Amarillo");
            } else if(elQueEsPulsado.getId() == R.id.u2a2btRojo){
                tvSalida.setText("Rojo");
            } else if(elQueEsPulsado.getId() == R.id.u2a2btVerde){
                tvSalida.setText("Verde");
            } else if(elQueEsPulsado.getId() == R.id.u2a2btAzul){
                tvSalida.setText("Azul");
            }
            */
            Button seLoQueEres = (Button) elQueEsPulsado;
            tvSalida.setText(seLoQueEres.getText());
        };

        btR.setOnClickListener(manejador);
        btG.setOnClickListener(manejador);
        btB.setOnClickListener(manejador);
        btY.setOnClickListener(manejador);
    }
}