package com.example.joao_vitor_souza;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ALCM", "Método onCreate chamado");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALCM", "Método onStart chamado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALCM", "Método onResume chamado");

    }
}
