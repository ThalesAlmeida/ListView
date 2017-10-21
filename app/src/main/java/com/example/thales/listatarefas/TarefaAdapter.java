package com.example.thales.listatarefas;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.net.PortUnreachableException;
import java.util.List;

/**
 * Created by Thales on 16/10/2017.
 */

public class TarefaAdapter extends BaseAdapter{

    private List<Tarefa> tarefas;
    private Activity activity;

    public TarefaAdapter(List<Tarefa> tarefas, Activity activity) {
        this.tarefas = tarefas;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return tarefas.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {

        if(v == null){
            v = this.activity.getLayoutInflater().inflate(R.layout.visualizacao, null);

            Tarefa tarefa = tarefas.get(position);

            TextView nomeTarefa = (TextView)v.findViewById(R.id.txtNomeTarefa);
            nomeTarefa.setText(tarefa.getNometarefa());

            TextView descricao = (TextView)v.findViewById(R.id.txtDescricao);
            descricao.setText(tarefa.getDescricao());

            TextView tipoTarefa = (TextView)v.findViewById(R.id.txtTipoTarefa);
            tipoTarefa.setText(tarefa.getTipoTarefa());

            TextView observacoes = (TextView)v.findViewById(R.id.txtObservacoes);
            observacoes.setText(tarefa.getObservacoes());
        }
        return v;
    }
}
