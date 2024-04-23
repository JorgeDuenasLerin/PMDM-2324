package com.example.pmdm_2324.ut06.zoo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.example.pmdm_2324.R;

public class ut06Zoo extends AppCompatActivity {

    RecyclerView rv;
    ut06AdapterAnimales adapter;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u6a_zoo);

        rv = findViewById(R.id.ut06_recycler_zoo);
        add = findViewById(R.id.ut06_recycler_add);

        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ut06AdapterAnimales();

        rv.setAdapter(adapter);

        add.setOnClickListener((v)->{
            adapter.add(Animal.generarDatos());
        });

    }
}