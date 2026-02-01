package model;

public class Titulo {
    
    private String nome;
    private Integer anoDeLancamento;

    public Titulo(String nome, Integer anoDeLancamento){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Integer getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(Integer anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }

    @Override
    public String toString(){
        return String.format("Filme: %s%nAno de lançamento: %d", nome, anoDeLancamento);
    }
}
