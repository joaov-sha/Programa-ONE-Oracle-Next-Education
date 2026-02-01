package model;

public class Serie extends Titulo{

    private Integer temporadas, episodios, duracaoMediaDosEpisodios;

    public Serie(String nome, Integer anoDeLancamento, Integer temporadas, Integer episodios, Integer duracaoMediaDosEpisodios) {
        super(nome, anoDeLancamento);
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.duracaoMediaDosEpisodios = duracaoMediaDosEpisodios;
    }
    
    public Integer getTemporadas(){
        return temporadas;
    }

    public void setTemporadas(Integer temporadas){
        this.temporadas = temporadas;
    }

    public Integer getEpisodios(){
        return episodios;
    }

    public void setEpisodios(Integer episodios){
        this.episodios = episodios;
    }

    public Integer getDuracaoMediaDosEpisodios(){
        return duracaoMediaDosEpisodios;
    }

    public void setDuracaoMediaDosEpisodios(Integer duracaoMediaDosEpisodios){
        this.duracaoMediaDosEpisodios = duracaoMediaDosEpisodios;
    }
}
