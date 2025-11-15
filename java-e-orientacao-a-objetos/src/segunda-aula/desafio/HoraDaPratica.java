package desafio;

public class HoraDaPratica {
    public static void main(String[] args){
        ex01(8.25, 9.35);
        ex02(9.5);
        ex03();
        ex04(5.50, 3);
        ex05(150);
        ex06(100, 10);
    }

    static void ex01(double notaUm, double notaDois){
        System.out.printf("Média das notas: %.2f\n", ((notaUm+notaDois)/2));
    }

    static void ex02(double nota){
        int solucao = (int) nota;
        System.out.println(solucao);
    }

    static void ex03(){
        char letra = 'A';
        String frase = " bruxa envenenou a maçã!";
        String resultado = letra + frase;
        System.out.println(resultado);
    }

    static void ex04(double precoDoProduto, int quantidadeComprada){
        double totalDaCompra = precoDoProduto * quantidadeComprada;
        System.out.printf("O total da compra é: %.2f\n", totalDaCompra);
    }

    static void ex05(double valorEmDolares){
        System.out.printf("O valor da compra em reais é: %.2f\n", valorEmDolares * 4.94);
    }

    static void ex06(double precoOriginal, double percentualDeDesconto){
        System.out.printf("O preço já com desconto é: %.2f\n", precoOriginal - (precoOriginal * percentualDeDesconto / 100));
    }
}