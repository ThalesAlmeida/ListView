package com.example.thales.listatarefas;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nomeTarefa;
    EditText descricao;
    Button buttonSave;
    EditText tipoTarefa;
    EditText observacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Nome da tarefa
        nomeTarefa = (EditText)findViewById(R.id.nomeTarefa);
        //Descrição
        descricao = (EditText)findViewById(R.id.descricao);
        //Salvar
        buttonSave = (Button)findViewById(R.id.buttonSave);
        //TipoTarefa
        tipoTarefa = (EditText) findViewById(R.id.tipoTarefa);
        //Observações
        observacoes = (EditText) findViewById(R.id.observacoes);
    }

    public void mensagem (String m){
        //Toast toast = Toast.makeText()
        Toast.makeText(this, m, Toast.LENGTH_LONG).show();
    }

    public void onClickMostrarDados(View view){
        Intent intent = new Intent(getContext(), ListaTarefas.class);
        startActivity(intent);
    }

    public void onClickListView(View view){
        Intent intent = new Intent(getContext(), ListTarefas.class);
        startActivity(intent);
    }

    public void onClickMainActivity(View view){
        /*editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox)findViewById(R.id.checkBox5);*/

        Tarefa tarefa = new Tarefa();
        tarefa.setNometarefa(nomeTarefa.getText().toString());

        tarefa.setDescricao(descricao.getText().toString());

        tarefa.setTipoTarefa(tipoTarefa.getText().toString());

        tarefa.setObservacoes(observacoes.getText().toString());


        TarefaDAO tarefaDAO = new TarefaDAO();
        tarefaDAO.escrita(tarefa, getContext());

        mensagem("Registro Salvo com sucesso");
    }

    private Context getContext(){
        return this;
    }
}
