package com.cursoandroid.minhasanotaoes;

import android.content.Context;
import android.content.SharedPreferences;

public class AnotacaoPreferencia {

    private Context context;
    private SharedPreferences preferences;
    private final String NOME_ARQUIVO = "Anotacao.preferencias";

    private SharedPreferences.Editor editor;
    private final String Chave_Nome = "Nome";

    public AnotacaoPreferencia(Context c) {
        this.context = c;
        preferences = context.getSharedPreferences(NOME_ARQUIVO, 0);
        editor = preferences.edit();
    }

    public void salvarAnotacao(String anotacao) {
        editor.putString(Chave_Nome, anotacao);
        editor.commit();
    }

    public String recuperarAnotacao() {
        return preferences.getString(Chave_Nome,"");
    }


}
