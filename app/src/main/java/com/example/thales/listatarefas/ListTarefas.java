package com.example.thales.listatarefas;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.io.IOException;
import java.util.List;

import static java.security.AccessController.getContext;

public class ListTarefas extends AppCompatActivity {

    List<Tarefa> tarefas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_tarefas);

        try {
            tarefas = new TarefaDAO(getContext()).leitura(getContext());
        } catch (IOException e) {
            e.printStackTrace();
        }
        ListView listTarefas = (ListView)findViewById(R.id.lista);
        TarefaAdapter adapter = new TarefaAdapter(tarefas, this);
        listTarefas.setAdapter(adapter);
    }

    private Context getContext()
    {
        return this;
    }
}

