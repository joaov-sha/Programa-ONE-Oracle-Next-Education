package org.joaov_sha.model;

public class Titulo {
    
    private String nome;
    private String dataDeLancamento;

    public Titulo(String nome, String dataDeLancamento){
        this.nome = nome;
        this.dataDeLancamento = dataDeLancamento;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDataDeLancamento(){
        return dataDeLancamento;
    }

    public void setDataDeLancamento(String dataDeLancamento){
        this.dataDeLancamento = dataDeLancamento;
    }
}
