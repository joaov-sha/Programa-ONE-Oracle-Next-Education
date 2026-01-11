package carro;

import java.util.List;

public class Carro {
    
    public String nome;
    public int ano;
    public double preco;
    
    public Carro(){}

    public Carro(String nome, int ano, double preco){
        this.nome = nome;
        this.ano = ano;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public static double calcularPrecoMedio(List<Double> precos){
        double precoMedio = 0.0;
        for (Double valor : precos) {
            precoMedio += valor;
        }

        precoMedio /= precos.size();
        return precoMedio;
    }
}
