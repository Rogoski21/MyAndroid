package com.cursoandroid.componentebasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText campoNome;
    private TextInputEditText campoEmail;
    private TextView textoResultado;
    private CheckBox checkVerde, checkAzul, checkBranco;

    //RadioButton
    private RadioGroup opcaoSexo;
    private RadioButton sexoMasculino, sexoFeminono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome = findViewById(R.id.editNome);
        campoEmail = findViewById(R.id.editEmail);
        textoResultado = findViewById(R.id.textResult);

        //checkbox
        checkVerde = findViewById(R.id.checkVerde);
        checkAzul = findViewById(R.id.checkAzul);
        checkBranco = findViewById(R.id.checkBranco);

        //RadioButton
        sexoFeminono = findViewById(R.id.radioButtonF);
        sexoMasculino = findViewById(R.id.radioButtonM);
        opcaoSexo = findViewById(R.id.radioGroupSexo);

        radiobutton();


    }

    public void radiobutton() {

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButtonM) {
                    textoResultado.setText("Masculino");
                }
                if (checkedId == R.id.radioButtonF) {
                    textoResultado.setText("Feminino");
                }
            }
        });

/*
        if (sexoMasculino.isChecked()) {
            textoResultado.setText("Masculino");
        }
        if(sexoFeminono.isChecked()){
            textoResultado.setText("Feminino");
        }

 */

    }

    public void enviar(View view) {

        //radiobutton();

        //checkbox();

        /*
        String nome = campoNome.getText().toString();

        String email = campoEmail.getText().toString();


        textoResultado.setText("Nome: " + nome + "\n" + "Email: " + email + "\n" + "Dados enviados com sucesso!");

        limpar(view);

         */

    }

    public void checkbox() {
        String txt = "";
        if (checkVerde.isChecked()) {
            txt = "Verde selecionado - ";
        }
        if (checkAzul.isChecked()) {
            txt = txt + "Azul selecionado - ";
        }
        if (checkBranco.isChecked()) {
            txt = txt + "Branco selecionado - ";

        }

        textoResultado.setText(txt);
    }

    public void limpar(View view) {
        campoNome.setText("");
        campoEmail.setText("");
    }
}