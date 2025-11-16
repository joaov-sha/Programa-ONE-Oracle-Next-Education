package exercícios;

import java.util.List;

public class Filme{
    private String titulo;
    private int anoDeLancamento;
    private String produtora;
    private String sinopse;
    
    private List<String> elenco;

    public Filme(String titulo, int anoDeLancamento, String produtora, String sinopse){
        this.titulo = titulo;
        this.anoDeLancamento = anoDeLancamento;
        this.produtora = produtora;
        this.sinopse = sinopse;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public List<String> getElenco() {
        return elenco;
    }

    public void setElenco(List<String> elenco) {
        this.elenco = elenco;
    }

    @Override
    public String toString() {
        return "Filme [titulo=" + titulo + ", anoDeLancamento=" + anoDeLancamento + ", produtora=" + produtora
                + ", sinopse=" + sinopse + ", elenco=" + elenco + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + anoDeLancamento;
        result = prime * result + ((produtora == null) ? 0 : produtora.hashCode());
        result = prime * result + ((sinopse == null) ? 0 : sinopse.hashCode());
        result = prime * result + ((elenco == null) ? 0 : elenco.hashCode());
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
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (anoDeLancamento != other.anoDeLancamento)
            return false;
        if (produtora == null) {
            if (other.produtora != null)
                return false;
        } else if (!produtora.equals(other.produtora))
            return false;
        if (sinopse == null) {
            if (other.sinopse != null)
                return false;
        } else if (!sinopse.equals(other.sinopse))
            return false;
        if (elenco == null) {
            if (other.elenco != null)
                return false;
        } else if (!elenco.equals(other.elenco))
            return false;
        return true;
    }

    
}