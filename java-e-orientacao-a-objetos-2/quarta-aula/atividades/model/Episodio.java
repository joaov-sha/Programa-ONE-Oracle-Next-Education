package model;

import calc.Classificavel;

public class Episodio implements Classificavel{

    private int numero;
    private String nome;
    private Serie serie;
    private int totalDeVisualizacoes;

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Serie getSerie(){
        return serie;
    }

    public void setSerie(Serie serie){
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        switch (totalDeVisualizacoes) {
            case 100:
                return 4;
            case 200:
                return 5;
            default:
                return 1;
        }
    }

    public void setTotalDeAvaliacoes(int totalDeVisualizacoes) {
        this.totalDeVisualizacoes = totalDeVisualizacoes;
    }
}