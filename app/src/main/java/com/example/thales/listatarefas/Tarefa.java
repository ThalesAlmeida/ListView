package com.example.thales.listatarefas;

/**
 * Created by Thales on 21/09/2017.
 */

public class Tarefa {

    private int id;
    private String nometarefa;
    private String descricao;
    private String tipoTarefa;
    private String observacoes;

    public Tarefa() {

    }
    public Tarefa(int id, String nometarefa, String descricao, String tipoTarefa, String observacoes) {
        this.nometarefa = nometarefa;
        this.descricao = descricao;
        this.tipoTarefa = tipoTarefa;
        this.observacoes = observacoes;
        this.id = id;

    }

    public String getNometarefa() {
        return nometarefa;
    }

    public void setNometarefa(String nometarefa) {
        this.nometarefa = nometarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setIdTarefa(int idTarefa) {
        this.id = id;
    }

    public String getTipoTarefa() {
        return tipoTarefa;
    }

    public void setTipoTarefa(String tipoTarefa) {
        this.tipoTarefa = tipoTarefa;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}

