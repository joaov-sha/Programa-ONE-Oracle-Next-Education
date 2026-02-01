package model.produto.calc;

import java.util.ArrayList;

import model.produto.Produto;

public class Calculadora {

    public static double calcularPrecoMedio(ArrayList<Produto> carrinho){
        double precoMedio = 0.0;
        for(Produto p: carrinho){
            precoMedio += p.getPreco();
        }
        precoMedio /= carrinho.size();
        return precoMedio;
    }
}
