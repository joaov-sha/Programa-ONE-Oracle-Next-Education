package org.joaov_sha.contador.model;

public class Avaliacao<T> {

    private T avaliacao;
    private String comentario;
    private double nota;

    public Avaliacao(T avaliacao, String comentario, double nota){
        this.avaliacao = avaliacao;
        this.comentario = comentario;
        this.nota = nota;
    }
    
    public T getAvaliacao(){
        return avaliacao;
    }

    public void setAvaliacao(T avalicao){
        this.avaliacao = avalicao;
    }

    public String getComentario(){
        return comentario;
    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }

    public double getNota(){
        return nota;
    }

    public void setNota(Double nota){
        this.nota = nota;
    }

}
