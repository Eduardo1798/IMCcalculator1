package com.example.edu.imcedurdo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class resultado extends AppCompatActivity {
  TextView TxResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TxResultado = (TextView) findViewById(R.id.TV_Resultado);
        Intent i = getIntent();
        double altura = i.getDoubleExtra("altura", 0);
        double peso = i.getDoubleExtra("peso", 0);
        double imc = (peso / Math.pow(altura, 2));
        TxResultado.setText(String.valueOf(imc));
    }

    public void volverOnClick (View v){
        super.onBackPressed();


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
