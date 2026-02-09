package model;

import java.util.Date;

public class Serie extends Titulo{

    private int numeroDeTemporadas;
    private int episodiosPorTemporada;
    private int duracaoMediaPorEpisodio;
    private int tempoDeDuracao;

    public Serie(String nome, Date dataDeLancamento, int numeroDeTemporadas, int episodiosPorTemporada, int duracaoMediaPorEpisodio) {
        super(nome, dataDeLancamento);
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.duracaoMediaPorEpisodio = duracaoMediaPorEpisodio;
        this.tempoDeDuracao = calcularDuracao();
    }
    
    public int getNumeroDeTemporadas(){
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas){
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public int getNumeroDeEpisodiosPorTemporada(){
        return episodiosPorTemporada;
    }

    public void setNumeroDeEpisodiosPorTemporada(int episodiosPorTemporada){
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracaoMediaPorEpisodio(){
        return duracaoMediaPorEpisodio;
    }

    public void setDuracaoMediaPorEpisodio(int duracaoMediaPorEpisodio){
        this.duracaoMediaPorEpisodio = duracaoMediaPorEpisodio;
    }

    public int getTempoDeDuracao(){
        return tempoDeDuracao;
    }

    public int calcularDuracao(){
        int duracaoMedia = this.duracaoMediaPorEpisodio * this.episodiosPorTemporada * this.numeroDeTemporadas;
        return duracaoMedia;
    }

    @Override
    public String toString(){
        return String.format("Titulo: %s%nData de lançamento: %s%nNumero de temporadas: %d%nEpisódios por temporada: %d%nDuração média por episódio: %d minutos%nDuração total: %d%n",super.getNome(), super.getDataDeLancamento().toString(),this.numeroDeTemporadas,this.episodiosPorTemporada,this.duracaoMediaPorEpisodio,this.tempoDeDuracao);
    }
}
