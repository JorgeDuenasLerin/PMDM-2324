package com.example.pmdm_2324.ut06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pmdm_2324.R;
import com.example.pmdm_2324.ut06.datos.ut06Partido;

public class ut06a1_ListaPartidos extends AppCompatActivity {

    RecyclerView reyclerViewUser;
    Button add;
    ut06adapter_Partido adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ut06a1_lista_partidos);

        reyclerViewUser = (RecyclerView) findViewById(R.id.ut03ListaContenedor);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getApplicationContext());
        reyclerViewUser.setLayoutManager(layoutManager);
        adapter = new ut06adapter_Partido(ut06Partido.generatePartidos(ut06Partido.PARTIDOS_INICIALES));
        reyclerViewUser.setAdapter(adapter);

        add = findViewById(R.id.ut03idListaAdd);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.add(ut06Partido.generatePartidos(ut06Partido.PARTIDOS_INICIALES));
            }
        });

        //adapter.notifyDataSetChanged();
    }
}