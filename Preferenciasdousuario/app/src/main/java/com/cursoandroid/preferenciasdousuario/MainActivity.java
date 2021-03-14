package com.cursoandroid.preferenciasdousuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.telephony.mbms.StreamingServiceInfo;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {

    private Button buttonSalvar;
    private TextInputEditText editNome;
    private TextView resultado;
    private static final String ARQUIVO_PREFERENCIA = "ArquivoPreferencia"; //final para n alterar o nome static para definir o valor em todas as instancias

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSalvar = findViewById(R.id.buttonSalvar);
        editNome = findViewById(R.id.editNome);
        resultado = findViewById(R.id.resultado);

        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);//queremso utulilizar o modo privado
                SharedPreferences.Editor editor = preferences.edit();

                //validar o nome
                if (editNome.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Preenchea o nome", Toast.LENGTH_LONG).show();
                } else {
                    String nome = editNome.getText().toString();
                    editor.putString("Nome", nome);
                    editor.commit();
                    resultado.setText("Ola, " + nome);
                }
            }
        });

        //Recuperar dados salvos
        SharedPreferences preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, 0);//queremso utulilizar o modo privado

        //Valida se temos o nome em preferencias
        if (preferences.contains("Nome")) {

            String nome = preferences.getString("Nome", "Usuario nao definido");
            resultado.setText("Ola " + nome);

        } else {
            resultado.setText("Ola, Usuario nao definido");
        }
    }
}