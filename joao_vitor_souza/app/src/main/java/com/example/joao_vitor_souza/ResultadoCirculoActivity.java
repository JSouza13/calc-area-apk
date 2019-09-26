package com.example.joao_vitor_souza;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class ResultadoCirculoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_circulo);

        double resultado = getIntent().getDoubleExtra("resultado", -1);

        TextView area = findViewById(R.id.resultado);
        DecimalFormat formato = new DecimalFormat("#.##");
        resultado = Double.valueOf(formato.format(resultado));
        area.setText( String.valueOf("Area: " + resultado + " cm2") );
    }

    public void btClicado(View v){
        Log.d("ACAO", "Método btClicado chamado");

        Intent inicioActivity = new Intent(this, MainActivity.class);
        startActivity(inicioActivity);

    }
}
