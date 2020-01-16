package com.br.ifpe.myapplication.beans;

public class Profissional {

    private String id;
    private String nome;
    private String sexo;
    private String email;
    private String status;
    private String profissao;
    private String apresentacao;

    public Profissional() {
    }

    public Profissional(String id, String nome, String sexo, String email, String status, String profissao, String apresentacao) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.email = email;
        this.status = status;
        this.profissao = profissao;
        this.apresentacao = apresentacao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
    }
}
