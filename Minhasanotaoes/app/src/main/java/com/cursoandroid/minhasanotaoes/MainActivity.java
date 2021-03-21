package com.cursoandroid.minhasanotaoes;

import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private AnotacaoPreferencia preferencia;
    private EditText editAnotacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferencia = new AnotacaoPreferencia(getApplicationContext());
        editAnotacao = findViewById(R.id.editAnotacao);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //validando se algo foi digitado
                String textoRecuperado = editAnotacao.getText().toString();
                if (textoRecuperado.equals("")) {
                    Snackbar.make(view, "Preencha a anotacao !", Snackbar.LENGTH_LONG).show();
                } else {
                    preferencia.salvarAnotacao(textoRecuperado);
                    Snackbar.make(view, "Anotacao salva !", Snackbar.LENGTH_LONG).show();
                }


            }
        });

        //recuperar anotacao
        String anotacao = preferencia.recuperarAnotacao();
        if (!anotacao.equals("")) {
            editAnotacao.setText(anotacao);
        }

    }
}