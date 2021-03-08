package com.cursoandroid.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        TextView texto = findViewById(R.id.textResultado);//estamos pegando pela id do textview

        String[] frase = {
                "Bom dia grupo",
                "Boa tarde grupo do ZAP",
                "Uma bela noite para o ZAP",
                "Bom div"
        };

        int n = new Random().nextInt(4);//para randomizar as frases

        texto.setText(frase[n]);
    }

}