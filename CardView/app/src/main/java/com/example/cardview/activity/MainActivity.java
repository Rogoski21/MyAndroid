package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerView);

        //definir lauout

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        this.preparaPostagnes();

        //definir adapter
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void preparaPostagnes() {
        Postagem p = new Postagem("Pedro Maia Rogoski", "Minha ultima viagem", R.drawable.hk);
        this.postagens.add(p);

        p = new Postagem("Ricardo Lacerda", "Na praia", R.drawable.tehran);
        this.postagens.add(p);


        p = new Postagem("Pedro Maia Rogoski", "Minha ultima viagem", R.drawable.sh);
        this.postagens.add(p);

    }
}