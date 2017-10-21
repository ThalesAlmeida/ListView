package com.example.thales.listatarefas;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_tarefas);
    }

    public void onClick(View view){
        //Criar um arrayList
        //percorrer o arrayList
        //E vai ter os dados retornados no método de leitura da minha DAO
        //Percorrer e imprimir no logCatch os dados retornados no elemento de cada arrayList
        Log.i("APP", "---------------------------------------------");
        TarefaDAO tarefaDAO = new TarefaDAO();
        List <Tarefa> lista = tarefaDAO.leitura(getBaseContext());

        if(lista != null){
            ArrayList<Tarefa> tarefaArrayList = new ArrayList<>(lista.size());
            tarefaArrayList.addAll(lista);

            for (Tarefa t: tarefaArrayList){
                Log.i("APP", "Nome:" + t.getNometarefa());
                Log.i("APP", "Descrição:" + t.getDescricao());
                Log.i("APP", "Tipo:" + t.getTipoTarefa());
                Log.i("APP", "Observações:" + t.getObservacoes());
            }
        }
    }
}
