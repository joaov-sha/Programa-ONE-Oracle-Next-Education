import java.util.ArrayList;

import model.animal.Animal;
import model.animal.Cachorro;
import model.conta.ContaBancaria;
import model.formas.Circulo;
import model.formas.Forma;
import model.formas.Quadrado;
import model.produto.Produto;
import model.produto.calc.Calculadora;
import model.strings.Frases;

public class Main {
    public static void main(String[] args){
        
        Frases livro = new Frases();
        livro.adicionarELerFrasesDaLista();
        System.out.println(livro.getFrasesSize());

        Cachorro cachorro = new Cachorro("Bob");
        System.out.println(cachorro.toString());

        if(cachorro instanceof Animal){
            System.out.println("O animal é: " + cachorro.getClass().getSimpleName());
        }else{
            System.out.println("Não foi possível determinar o tipo de objeto!");
        }

        Produto p1 = new Produto("Computador", 3500.00);
        Produto p2 = new Produto("Notebook", 2500.00);
        Produto p3 = new Produto("Smartphone", 5000.00);

        ArrayList<Produto> carrinho = new ArrayList<Produto>();
        carrinho.add(p1);
        carrinho.add(p2);
        carrinho.add(p3);

        System.out.printf("O preço médio dos itens contidos no carrinho é de: R$ %.2f%n", Calculadora.calcularPrecoMedio(carrinho));

        Forma circulo = new Circulo(3);
        Forma quadrado = new Quadrado(4);
        Forma circulo1 = new Circulo(5);
        Forma quadrado1 = new Quadrado(6);

        ArrayList<Forma> geometria = new ArrayList<Forma>();

        geometria.add(circulo);
        geometria.add(quadrado);
        geometria.add(circulo1);
        geometria.add(quadrado1);

        for(Forma f: geometria){
            System.out.printf("A área da figura: %s é: %.2f\n", f.getClass().getSimpleName(), f.CalcularArea());
        }

        ContaBancaria c1 = new ContaBancaria(1,1000.00);
        ContaBancaria c2 = new ContaBancaria(2, 3500.00);
        ContaBancaria c3 = new ContaBancaria(3, 2750.00);

        ArrayList<ContaBancaria> agencia = new ArrayList<ContaBancaria>();

        agencia.add(c1);
        agencia.add(c2);
        agencia.add(c3);

        int posicaoDoMaiorSaldo = -1;
        double saldoMaximo = 0.0;
        for(ContaBancaria cb : agencia){
            if(cb.getSaldo() > saldoMaximo){
                saldoMaximo = cb.getSaldo();
                posicaoDoMaiorSaldo = agencia.indexOf(cb);
            }
        }

        System.out.println("A posição da maior conta na lista é: " + posicaoDoMaiorSaldo);
    }
}
