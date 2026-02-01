package model.animal;

public class Animal {
    
    private String nome;

    public Animal(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "[Nome: " + nome + "]";
    }
}
