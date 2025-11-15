public class Musica {
    
    private String titulo;
    private String artista;
    private int anoDeLancamento;
    private double avaliacao;
    private double numAvaliacoes;

    public Musica(String titulo, String artista, int anoDeLancamento){
        this.titulo = titulo;
        this.artista = artista;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getArtista(){
        return artista;
    }

    public void setArtista(String artista){
        this.artista = artista;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getAvaliacao(){
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao){
        this.avaliacao = avaliacao;
    }

    public double getNumAvaliacoes(){
        return numAvaliacoes;
    }

    public void setNumAvaliacoes(double numAvaliacoes){
        this.numAvaliacoes = numAvaliacoes;
    }

    public void exibirFichaTecnica(){
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Avaliação: " + avaliacao);
    }

    public void avaliar(double nota){
        if(nota >= 0 && nota <= 10){
            avaliacao += nota;
            numAvaliacoes++;
        }
    }

    public double calcularMediaDeAvaliacoes(){
        if(numAvaliacoes > 0){
            return avaliacao / numAvaliacoes;
        }else{
            return 0;
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((artista == null) ? 0 : artista.hashCode());
        result = prime * result + anoDeLancamento;
        long temp;
        temp = Double.doubleToLongBits(avaliacao);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(numAvaliacoes);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Musica other = (Musica) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (artista == null) {
            if (other.artista != null)
                return false;
        } else if (!artista.equals(other.artista))
            return false;
        if (anoDeLancamento != other.anoDeLancamento)
            return false;
        if (Double.doubleToLongBits(avaliacao) != Double.doubleToLongBits(other.avaliacao))
            return false;
        if (Double.doubleToLongBits(numAvaliacoes) != Double.doubleToLongBits(other.numAvaliacoes))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Musica [titulo=" + titulo + ", artista=" + artista + ", anoDeLancamento=" + anoDeLancamento
                + ", avaliacao=" + avaliacao + ", numAvaliacoes=" + numAvaliacoes + "]";
    }

    
}
