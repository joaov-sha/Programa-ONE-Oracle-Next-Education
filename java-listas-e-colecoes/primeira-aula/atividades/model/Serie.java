package model;

public class Serie extends Titulo{

    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(){}

    public Serie(String nome, int anoDeLancamento, int duracaoEmMinutos, boolean incluidoNoPlano, int temporadas, boolean ativa, int episodiosPorTemporada, int minutosPorEpisodio) {
        super(nome, anoDeLancamento, duracaoEmMinutos, incluidoNoPlano);
        this.temporadas = temporadas;
        this.ativa = ativa;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    
    public int getTemporadas(){
        return temporadas;
    }

    public void setTemporadas(int temporadas){
        this.temporadas = temporadas;
    }

    public boolean isAtiva(){
        return ativa;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada(){
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio(){
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio){
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
