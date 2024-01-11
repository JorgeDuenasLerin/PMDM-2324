package com.example.pmdm_2324.ut06.avanzada;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pmdm_2324.R;

public class EventosClickListas extends AppCompatActivity {

    RecyclerView rcv;
    ProductoAdapter a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ut06a2_producto);

        rcv = findViewById(R.id.ut06a2_rec_producto);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        a = new ProductoAdapter(Producto.generador());
        rcv.setAdapter(a);

        a.setClickListener(new ProductoAdapter.ItemClickListener() {
            @Override
            public void onClick(View view, int position, Producto producto) {
                Toast.makeText(EventosClickListas.this,"Pulsado"+position,Toast.LENGTH_SHORT).show();
            }
        });
    }
}