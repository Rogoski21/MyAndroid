package com.cursoandroid.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void papel(View view) {
        this.opcaoSelecionada("papel");
    }

    public void pedra(View view) {
        this.opcaoSelecionada("pedra");
    }

    public void tesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }


    @SuppressLint("SetTextI18n")
    public void opcaoSelecionada(String escolhaUsuario) {
        ImageView imgResultado = findViewById(R.id.imgResultado);

        TextView textResultado = findViewById(R.id.textResultado);


        int numero = new Random().nextInt(3);
        String[] opcaoes = {"papel", "pedra", "tesoura"};
        String escolhaApp = opcaoes[numero];//seletor das opcoes

        switch (escolhaApp) {
            case "papel":
                imgResultado.setImageResource(R.drawable.papel);
                break;
            case "pedra":
                imgResultado.setImageResource(R.drawable.pedra);
                break;
            case "tesoura":
                imgResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if (//app ganha
                (escolhaApp.equals("papel") && escolhaUsuario.equals("pedra")) ||
                        (escolhaApp.equals("pedra") && escolhaUsuario.equals("tesoura")) ||
                        (escolhaApp.equals("tesoura") && escolhaUsuario.equals("papel"))
        ) {
            textResultado.setText("Voce perdeu");
        } else if (
                (escolhaUsuario.equals("papel") && escolhaApp.equals("pedra")) ||
                        (escolhaUsuario.equals("pedra") && escolhaApp.equals("tesoura")) ||
                        (escolhaUsuario.equals("tesoura") && escolhaApp.equals("papel"))

        ) {//Usuario ganha
            textResultado.setText("Voce Ganhou");

        } else {//Empate
            textResultado.setText("Empatou");

        }

        System.out.println("Item clicado: " + escolhaApp);


    }

}