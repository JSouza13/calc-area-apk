package com.example.joao_vitor_souza;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InformeTrianguloActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informe_triangulo);
        Log.d("ALCM", "Método onCreate chamado");

    }

    public void btClicado(View v) {

        Log.d("ACAO", "Método btClicado chamado");


        EditText baseTriangulo = findViewById(R.id.baseTriangulo);
        EditText alturaTriangulo = findViewById(R.id.alturaTriangulo);



        try {
            if(baseTriangulo != null || alturaTriangulo != null) {

                double n1 = Double.parseDouble(baseTriangulo.getText().toString());
                double n2 = Double.parseDouble(alturaTriangulo.getText().toString());

                double resultado = (n1 * n2) / 2;

                Intent intecaoAbrirNovaActivity = new Intent(this, ResultadoTrianguloActivity.class);
                intecaoAbrirNovaActivity.putExtra("resultado", resultado);
                startActivity(intecaoAbrirNovaActivity);
            }
            else {
                throw new Exception();
            }

        }catch (Exception e){
            Toast.makeText(this, "É necessário informar todos os campos!", Toast.LENGTH_LONG).show();
        }
    }
}

