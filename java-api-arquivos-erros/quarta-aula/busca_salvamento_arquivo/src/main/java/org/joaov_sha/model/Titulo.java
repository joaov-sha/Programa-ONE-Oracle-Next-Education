package org.joaov_sha.model;

public class Titulo {
    
    private String titulo;
    private String dataDeLancamento;

    public Titulo(String titulo, String dataDeLancamento){
        this.titulo = titulo;
        this.dataDeLancamento = dataDeLancamento;
    }

    public Titulo(TituloTmdb meuTituloTmdb){
        this.titulo = meuTituloTmdb.title();
        this.dataDeLancamento = meuTituloTmdb.release_date();
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitutlo(String titulo){
        this.titulo = titulo;
    }

    public String getDataDeLancamento(){
        return dataDeLancamento;
    }

    public void setDataDeLancamento(String dataDeLancamento){
        this.dataDeLancamento = dataDeLancamento;
    }

    @Override
    public String toString(){
        return String.format("Titulo: %s, Data de lançamento: %s", titulo, dataDeLancamento);
    }
}
