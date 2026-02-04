package model;

public class Serie extends Titulo{
    
    private Integer numeroDeTemporadas;
    private Integer episodiosPorTemporada;
    private Integer mediaDeDuracaoDeEpisodio;

    public Serie(){}

    public Serie(String nome, Integer anoDeLancamento, Integer numeroDeTemporadas, Integer episodiosPorTemporada, Integer mediaDeDuracaoDeEpisodio){
        super(nome, anoDeLancamento);
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.mediaDeDuracaoDeEpisodio = mediaDeDuracaoDeEpisodio;
    }

    public Integer getNumeroDeTemporadas(){
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(Integer numeroDeTemporadas){
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public Integer getEpisodiosPorTemporada(){
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(Integer episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public Integer getMediaDeDuracaoDeEpisodio(){
        return mediaDeDuracaoDeEpisodio;
    }

    public void setMediaDeDuracaoDeEpisodio(Integer mediaDeDuracaoDeEpisodio){
        this.mediaDeDuracaoDeEpisodio = mediaDeDuracaoDeEpisodio;
    }
}
