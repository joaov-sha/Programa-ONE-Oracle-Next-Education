public class Filme{

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double avaliacao;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Filme(String nome, int anoDeLancamento, boolean incluidoNoPlano, double avaliacao, int totalDeAvaliacoes, int duracaoEmMinutos){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.incluidoNoPlano = incluidoNoPlano;
        this.avaliacao = avaliacao;
        this.totalDeAvaliacoes = totalDeAvaliacoes;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public Filme(){}

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getAvaliacao(){
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao){
        this.avaliacao = avaliacao;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes){
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
    }

    @Override
    public String toString() {
        return "Filme [nome=" + nome + ", anoDeLancamento=" + anoDeLancamento + ", incluidoNoPlano=" + incluidoNoPlano
                + ", avaliacao=" + avaliacao + ", totalDeAvaliacoes=" + totalDeAvaliacoes + ", duracaoEmMinutos="
                + duracaoEmMinutos + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + anoDeLancamento;
        result = prime * result + (incluidoNoPlano ? 1231 : 1237);
        long temp;
        temp = Double.doubleToLongBits(avaliacao);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + totalDeAvaliacoes;
        result = prime * result + duracaoEmMinutos;
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
        Filme other = (Filme) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (anoDeLancamento != other.anoDeLancamento)
            return false;
        if (incluidoNoPlano != other.incluidoNoPlano)
            return false;
        if (Double.doubleToLongBits(avaliacao) != Double.doubleToLongBits(other.avaliacao))
            return false;
        if (totalDeAvaliacoes != other.totalDeAvaliacoes)
            return false;
        if (duracaoEmMinutos != other.duracaoEmMinutos)
            return false;
        return true;
    }

    
}