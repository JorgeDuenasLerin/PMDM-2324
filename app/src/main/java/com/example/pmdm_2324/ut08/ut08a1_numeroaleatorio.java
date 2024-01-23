package com.example.pmdm_2324.ut08;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Button;

import com.example.pmdm_2324.R;

public class ut08a1_numeroaleatorio extends AppCompatActivity {

    TextView tvNumero;
    Button btGenerar;
    ProgressBar pbCargando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ut08a1_numeroaleatorio);

        tvNumero = findViewById(R.id.ut08a1idtvNumero);
        btGenerar = findViewById(R.id.ut08a1idbtGen);
        pbCargando = findViewById(R.id.ut08a1idpbCargando);

        ut08a1_numeroaleatorioViewModel vm = new ViewModelProvider(this).get(ut08a1_numeroaleatorioViewModel.class);

        vm.getNumero().observe(this, integer -> {
            // Actualizar la interfaz
            if(integer == ut08a1_numeroaleatorioViewModel.FAIL){
                tvNumero.setText("Error en el acceso a los datos");
            }else{
                tvNumero.setText(""+integer);
            }

            pbCargando.setVisibility(View.INVISIBLE);
            tvNumero.setVisibility(View.VISIBLE);
            btGenerar.setEnabled(true);
        });
        btGenerar.setEnabled(false);

        btGenerar.setOnClickListener((v)->{

            pbCargando.setVisibility(View.VISIBLE);
            tvNumero.setVisibility(View.INVISIBLE);
            btGenerar.setEnabled(false);
            vm.cargaNumero();
        });
    }
}