package com.example.pmdm_2324.ut02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.pmdm_2324.R;

public class u2a7Toast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u2a7_toast);
    }

    public void hacerToast(View v){
        Toast.makeText(u2a7Toast.this, "Esto es una chapuza!!!", Toast.LENGTH_LONG).show();
    }
}