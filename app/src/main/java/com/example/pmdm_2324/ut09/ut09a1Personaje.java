package com.example.pmdm_2324.ut09;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pmdm_2324.R;
import com.example.pmdm_2324.ut09.data.Personaje;
import com.example.pmdm_2324.ut09.data.ServiceRickAndMorty;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ut09a1Personaje extends AppCompatActivity {

    EditText id;
    Button get;
    TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ut09a1_personaje);
        id = findViewById(R.id.ut09a1_id);
        get = findViewById(R.id.ut09a1_get);
        info = findViewById(R.id.ut09a1_info);

        get.setOnClickListener((v)->{

            ServiceRickAndMorty ser = ServiceRickAndMorty.getInstancia();
            Call<Personaje> llamada =  ser.getRepo().getCharacter(Integer.parseInt(id.getText().toString()));

            llamada.enqueue(new Callback<Personaje>() {
                @Override
                public void onResponse(Call<Personaje> call, Response<Personaje> response) {
                    Personaje p = response.body();
                    info.setText(p.name);
                }

                @Override
                public void onFailure(Call<Personaje> call, Throwable t) {
                    String nuncaToast = "Debug";
                }
            });

        });
    }
}