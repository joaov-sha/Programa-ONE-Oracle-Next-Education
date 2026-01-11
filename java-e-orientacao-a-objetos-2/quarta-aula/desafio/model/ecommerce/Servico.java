package model.ecommerce;

public class Servico implements Vendavel{

    private String nome;
    private double preco;

    public Servico(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + 0.35 * preco;
    }
    
}
