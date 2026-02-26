package desafio;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import model.Produto;

public class Main {
    
    public static void main(String[] args){
        // Exercício 01 - 
        List<Integer> numeros = Arrays.asList(10,20,30,40,50);
        IntSummaryStatistics ist = numeros.stream().collect(Collectors.summarizingInt(element -> element.intValue()));
        System.out.println(ist);

        // Exercício 02 -
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");
        System.out.println(palavras.stream().collect(Collectors.groupingBy(element -> element.length())));

        // Exercício 03 - 
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
        System.out.println(nomes.stream().collect(Collectors.joining(", ")).toString());

        // Exercício 04 -
        List<Integer> numerosQuadrados = Arrays.asList(1,2,3,4,5,6);
        System.out.println(numerosQuadrados.stream().filter(n -> n % 2 == 0).mapToInt(n -> n * n).sum());

        // Exercício 05 - 
        List<Integer> numerosSeparados = Arrays.asList(1,2,3,4,5,6);
        System.out.println(numerosSeparados.stream().collect(Collectors.groupingBy(n -> n % 2 != 0)).toString());

        // Exercício 06 -
        List<Produto> produtos = Arrays.asList(
            new Produto("Smartphone", 800.0, "Eletrônicos"),
            new Produto("Notebook", 1500.0, "Eletrônicos"),
            new Produto("Teclado", 200.0, "Eletrônicos"),
            new Produto("Cadeira", 300.0, "Móveis"),
            new Produto("Monitor", 900.0, "Eletrônicos"),
            new Produto("Mesa", 700.0, "Móveis")
        );

        System.out.println(produtos.stream().collect(Collectors.<String, List<Produto>>mapping(prod -> prod, Collectors.toList())));
    }
}
