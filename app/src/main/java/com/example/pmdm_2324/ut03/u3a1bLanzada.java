package com.example.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pmdm_2324.R;

public class u3a1bLanzada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u3a1b_lanzada);

        Bundle info = getIntent().getExtras();

        //String sInfo = info.getString(u3a1aLanza.INFO_NOMBRE);
        String sInfo = "";

        int n = info.getInt(u3a1aLanza.ENTERO);
        String nombre = info.getString("AQUÍVIENEMINOMBRE");
        boolean hecho = info.getBoolean("AQUÍVIENEALGO");

        TextView tv = findViewById(R.id.u3a1idtvSaludo);
        tv.setText(tv.getText() + sInfo);
    }
}