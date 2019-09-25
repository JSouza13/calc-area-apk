package com.example.joao_vitor_souza;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btClicado(View v){
        Log.d("ACAO", "Método btClicado chamado");

        try {

            RadioGroup operacao = findViewById(R.id.rgOperacao);


            if (operacao.getCheckedRadioButtonId() == R.id.rbQuadrado) {

                Intent quadradoActivity = new Intent(MainActivity.this, InformeQuadradoActivity.class);
                startActivity(quadradoActivity);

            } else if (operacao.getCheckedRadioButtonId() == R.id.rbTriangulo) {

                Intent trianguloActivity = new Intent(MainActivity.this, InformeTrianguloActivity.class);
                startActivity(trianguloActivity);

            } else if (operacao.getCheckedRadioButtonId() == R.id.rbCirculo) {

                Intent circuloActivity = new Intent(MainActivity.this, InformeCirculoActivity.class);
                startActivity(circuloActivity);
            }
            else {
                throw new Exception();
            }
        }catch (Exception e){
            Toast.makeText(this, "Escolha uma opção.", Toast.LENGTH_LONG).show();
        }
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
