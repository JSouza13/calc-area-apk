package com.example.joao_vitor_souza;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InformeCirculoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informe_circulo);
        Log.d("ALCM", "Método onCreate chamado");

    }

    public void btClicado(View v) {

        Log.d("ACAO", "Método btClicado chamado");


        EditText raioCirculo = findViewById(R.id.etRaio);




        try {

            if(raioCirculo != null) {

                double n1 = Double.parseDouble(raioCirculo.getText().toString());

                double resultado = Math.PI * Math.pow(n1, 2);

                Intent intecaoAbrirNovaActivity = new Intent(this, ResultadoCirculoActivity.class);
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

