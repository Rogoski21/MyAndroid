package com.cursoandroid.alcoolougasolina;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editPrecoAlcool, editPrecoGasolina;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrecoAlcool = findViewById(R.id.editPrecoAlcool);
        editPrecoGasolina = findViewById(R.id.editprecoGasolina);
        resultado = findViewById(R.id.resultado);


    }

    public void calcularPreco(View view) {

        //recuperar valores indicados
        String precoAlcool = editPrecoAlcool.getText().toString();
        String precoGasolina = editPrecoGasolina.getText().toString();

        //validar os campos digitados
        Boolean camposValidados = validaCampos(precoAlcool, precoGasolina);
        if (camposValidados) {
            //Converter string para numero
            Double valorAlcool = Double.parseDouble(precoAlcool);
            Double valorGasolina = Double.parseDouble(precoGasolina);

            //calculo para definir qual [e o melhor preco
            if ((valorAlcool / valorGasolina) >= 0.7) {
                resultado.setText("Melhor utilizar gasolina");
            } else {
                resultado.setText("Melhor utilizar alcool");
            }

        } else {
            resultado.setText("Preencha os precos primeiro");
        }

    }

    public Boolean validaCampos(String pAlcool, String pGasoliona) {

        boolean camposValidados = true;

        if (pAlcool == null || pAlcool.equals("")) {
            camposValidados = false;

        }
        if (pGasoliona == null || pGasoliona.equals("")) {
            camposValidados = false;

        }

        return camposValidados;

    }

}