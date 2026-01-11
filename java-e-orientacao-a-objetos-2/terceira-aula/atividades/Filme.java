package atividades;

public class Filme extends Titulo{

    public Filme(){}
    
    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos, boolean incluidoNoPlano, String diretor) {
        super(nome, anoDeLancamento, duracaoEmMinutos, incluidoNoPlano);
        this.diretor = diretor;
    }

    private String diretor;

    public String getDiretor(){
        return diretor;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
}
