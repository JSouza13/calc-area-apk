package com.example.joao_vitor_souza;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InformeQuadradoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informe_quadrado);
        Log.d("ALCM", "Método onCreate chamado");

    }

    public void btClicado(View v) {

        Log.d("ACAO", "Método btClicado chamado");


        EditText baseQuadrado = findViewById(R.id.baseQuadrado);
        EditText alturaQuadrado = findViewById(R.id.alturaQuadrado);

            double n1 = Double.parseDouble(baseQuadrado.getText().toString());
            double n2 = Double.parseDouble(alturaQuadrado.getText().toString());

            double resultado = n1 * n2;

            try {
                Intent intecaoAbrirNovaActivity = new Intent(this, ResultadoQuadradoActivity.class);
                intecaoAbrirNovaActivity.putExtra("resultado", resultado);
                startActivity(intecaoAbrirNovaActivity);
            }catch (Exception e){
                Toast.makeText(this, "Erro ao realizar o cálculo!", Toast.LENGTH_LONG).show();
            }
    }
}

