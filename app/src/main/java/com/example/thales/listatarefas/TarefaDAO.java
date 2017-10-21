package com.example.thales.listatarefas;

import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.TRUE;

/**
 * Created by Thales on 23/09/2017.
 */


public class TarefaDAO {
    String caminho;

    public TarefaDAO(){

    }


    public TarefaDAO(Context context) throws IOException {
        this.caminho=context.getFilesDir().getPath()+"/DADOS.txt";
    }

    public void escrita(Tarefa tarefa, Context context)  {
        String mensagem = tarefa.getNometarefa()+ ";" + tarefa.getDescricao() + ";" + tarefa.getTipoTarefa() + ";" + tarefa.getObservacoes()+ "\n";

        try {
            FileWriter writer = new FileWriter(context.getFilesDir().getPath()+"/DADOS.txt", TRUE);
            writer.write(mensagem);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //leitura(view);
    }

    public List<Tarefa>leitura(Context context) {
        try {
            FileReader reader = new FileReader(context.getFilesDir().getPath() + "/DADOS.txt");
            BufferedReader buffer = new BufferedReader(reader);
            String linha = null;

            List<Tarefa> listTarefa = new ArrayList<Tarefa>();

            while ((linha = buffer.readLine()) != null) {
                String[] dadosTarefa = linha.split(";");
                Tarefa tarefa = new Tarefa();
                tarefa.setNometarefa(dadosTarefa[0]);
                tarefa.setDescricao(dadosTarefa[1]);
                tarefa.setTipoTarefa(dadosTarefa[2]);
                tarefa.setObservacoes(dadosTarefa[3]);
                //Log.i("APP",linha);
                listTarefa.add(tarefa);
            }

            return listTarefa;

        } catch (Exception e) {

        }
        return null;
    }

}
