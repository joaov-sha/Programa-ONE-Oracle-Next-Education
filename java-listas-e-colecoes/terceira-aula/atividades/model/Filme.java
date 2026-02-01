package model;

public class Filme extends Titulo{

    private Integer duracao;

    public Filme(String nome, Integer anoDeLancamento, Integer duracao) {
        super(nome, anoDeLancamento);
        this.duracao = duracao;
    }
    
    public Integer getDuracao(){
        return duracao;
    }

    public void setDuracao(Integer duracao){
        this.duracao = duracao;
    }
}
