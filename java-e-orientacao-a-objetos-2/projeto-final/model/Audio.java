package model;

public class Audio {
    
    private String titulo;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private int classificacao;

    public Audio(){}

    public Audio(String titulo){
        this.titulo = titulo;
    }

    public void curte(){
        this.totalDeCurtidas += 1;
    }

    public void reproduz(){
        System.out.println("Reproduzindo: " + this.titulo);
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes(){
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes){
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getTotalDeCurtidas(){
        return totalDeCurtidas;
    }

    public void setTotalDeCurtidas(int totalDeCurtidas){
        this.totalDeCurtidas = totalDeCurtidas;
    }

    public int getClassificacao(){
        return classificacao;
    }

    public void setClassificacao(int classificacao){
        this.classificacao = classificacao;
    }
}
