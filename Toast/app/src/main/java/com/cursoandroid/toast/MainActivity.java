package com.cursoandroid.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirToast(View view) {

        ImageView imagem = new ImageView(getApplicationContext());
        imagem.setImageResource(android.R.drawable.star_big_off);

        TextView textView = new TextView(getApplicationContext());
        textView.setBackgroundResource(R.color.design_default_color_secondary);
        textView.setText("App iniciando");

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(imagem);
        toast.setView(textView);
        toast.show();
        /*
        TOAST GENERICO
        Toast.makeText(
                getApplicationContext(),
                "Acao realizada com sucesso",
                Toast.LENGTH_SHORT
        ).show();

         */
    }
}