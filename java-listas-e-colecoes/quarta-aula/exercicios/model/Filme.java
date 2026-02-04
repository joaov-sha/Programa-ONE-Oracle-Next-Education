package model;

public class Filme extends Titulo{
    
    private Integer tempoDeDuracao;

    public Filme(){}

    public Filme(String nome, Integer anoDeLancamento, Integer tempoDeDuracao){
        super(nome, anoDeLancamento);
        this.tempoDeDuracao = tempoDeDuracao;
    }

    public Integer getTempoDeDuracao(){
        return tempoDeDuracao;
    }

    public void setTempoDeDuracao(Integer tempoDeDuracao){
        this.tempoDeDuracao = tempoDeDuracao;
    }
}
