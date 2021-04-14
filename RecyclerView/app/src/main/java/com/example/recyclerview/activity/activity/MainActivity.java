package com.example.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.adapter.Adapter;
import com.example.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Lista de filmes
        this.criarFilmes();

        //configurar adapter
        Adapter adapter = new Adapter(listaFilmes);

        //configurar recyclerview
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);//configuramos layoumanager
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

    }

    public void criarFilmes() {
        //vai gerar os filmes
        Filme filme = new Filme("Homem Aranha - De volta ao lar", "Ação", "2017");
        this.listaFilmes.add(filme);
        filme = new Filme("Homens de preto", "Ação","2010");
        this.listaFilmes.add(filme);
        filme = new Filme("A espera de um milagre", "Drama","1999");
        this.listaFilmes.add(filme);
        filme = new Filme("Resgate do soldado Ryan", "Ação","1998");
        this.listaFilmes.add(filme);

    }

}