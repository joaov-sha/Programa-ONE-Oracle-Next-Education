package model;

import java.util.Date;

public class Titulo {
    
    private String nome;
    private Date dataDeLancamento;
    private int tempoDeDuracao;

    public Titulo(String nome, Date dataDeLancamento){
        this.nome = nome;
        this.dataDeLancamento = dataDeLancamento;
    }

    public Titulo(String nome, Date dataDeLancamento, int tempoDeDuracao){
        this.nome = nome;
        this.dataDeLancamento = dataDeLancamento;
        this.tempoDeDuracao = tempoDeDuracao;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Date getDataDeLancamento(){
        return dataDeLancamento;
    }

    public void setDataDeLancamento(Date dataDeLancamento){
        this.dataDeLancamento = dataDeLancamento;
    }

    public int getTempoDeDuracao(){
        return tempoDeDuracao;
    }

    public void setTempoDeDuracao(int tempoDeDuracao){
        this.tempoDeDuracao = tempoDeDuracao;
    }

    @Override
    public String toString(){
        return String.format("Titulo: %s%nData de lançamento: %s%nTempo de duração: %d%n", this.nome, this.dataDeLancamento.toString(), this.tempoDeDuracao);
    }
}
