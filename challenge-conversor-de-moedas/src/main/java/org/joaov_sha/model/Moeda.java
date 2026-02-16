package org.joaov_sha.model;

public class Moeda {
    
    private String nome;
    private String paisOuRegiao;
    private String codigoIso;

    public Moeda(String nome, String paisOuRegiao, String codigoIso){
        this.nome = nome;
        this.paisOuRegiao = paisOuRegiao;
        this.codigoIso = codigoIso;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getPaisOuRegiao(){
        return paisOuRegiao;
    }

    public void setPaisOuRegiao(String paisOuRegiao){
        this.paisOuRegiao = paisOuRegiao;
    }

    public String getCodigoIso(){
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso){
        this.codigoIso = codigoIso;
    }
}
