package com.example.joao_vitor_souza;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoTrianguloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_triangulo);

        double resultado = getIntent().getDoubleExtra("resultado", -1);

        TextView area = findViewById(R.id.resultado);
        area.setText( String.valueOf("Área: " + resultado + " cm2") );
    }

    public void btClicado(View v){
        Log.d("ACAO", "Método btClicado chamado");

        Intent inicioActivity = new Intent(this, MainActivity.class);
        startActivity(inicioActivity);

    }
}
