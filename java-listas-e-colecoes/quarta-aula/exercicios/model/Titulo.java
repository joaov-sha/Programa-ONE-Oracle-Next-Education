package model;

public class Titulo implements Comparable<Titulo>{
    
    private String nome;
    private Integer anoDeLancamento;

    public Titulo(){}

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

    public int compareTo(Titulo t) {
        if(this.anoDeLancamento > t.getAnoDeLancamento()){
            return +1;
        }else if(this.anoDeLancamento < t.getAnoDeLancamento()){
            return -1;
        }
        return 0;
    }

    @Override
    public String toString(){
        return String.format("%s: %s (%d)", this.getClass().getSimpleName(), this.getNome(), this.getAnoDeLancamento());
    }
}
