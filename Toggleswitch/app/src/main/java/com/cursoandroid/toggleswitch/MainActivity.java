package com.cursoandroid.toggleswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintsChangedListener;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha = findViewById(R.id.toggleSenha);
        switchSenha = findViewById(R.id.switchSenha);
        resultado = findViewById(R.id.resultado);
        listener();
    }

    public void listener() {
        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    resultado.setText("Switch ligado");
                } else {
                    resultado.setText("Switch desligado");
                }
            }
        });
    }

    public void enviar(View view) {
        String txt = "";
        if (toggleSenha.isChecked()) {
            txt = "Toggle senha marcado ";
        } else {
            txt = "Toggle desligado";
        }

        resultado.setText(txt);
    }
}