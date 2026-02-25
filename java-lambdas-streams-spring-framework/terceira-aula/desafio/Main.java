import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import model.Pessoa;
import model.Produto;
import model.Verificador;

public class Main{
    public static void main(String[] args){

        // Exercício 01 - 
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        System.out.println(numeros.stream()
                .filter(n -> n % 2 == 0).collect(Collectors.toList()));

        // Exercício 02 - 
        List<String> palavras = Arrays.asList("java","streams","lambda");
        System.out.println(palavras.stream().map(p -> p.toUpperCase()).collect(Collectors.toList()));

        // Exercício 03 -
        List<Integer> numerosNaturais = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(numerosNaturais.stream().filter(n -> n % 2 == 1).map(m -> m * 2).collect(Collectors.toList()));

        // Exercício 04 - 
        List<String> frutas = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        System.out.println(frutas.stream().distinct().collect(Collectors.toList()));

        // Exercício 05 -
        List<List<Integer>> listaDeNumeros = Arrays.asList(
            Arrays.asList(1, 2, 3, 4),
            Arrays.asList(5, 6, 7, 8),
            Arrays.asList(9, 10, 11, 12)
        );
        
        System.out.println(listaDeNumeros.stream().flatMap(l -> l.stream()).filter(n -> Verificador.verificaPrimo(n)).collect(Collectors.toList()));
        
        // Exercício 06 -
        List<Pessoa> pessoas = Arrays.asList(new Pessoa("Charlie", 19), new Pessoa("Alice", 22), new Pessoa("Bob", 17));
        System.out.println(pessoas.stream().filter(p -> p.getIdade() > 18).map(p -> p.getNome()).sorted().collect(Collectors.toList()));
        
        // Exercício 07 -
        List<Produto> produtos = Arrays.asList(
            new Produto("Smartphone",800.0, "Eletrônicos"),
            new Produto("Notebook",1500.0, "Eletrônicos"),
            new Produto("Teclado",200.0, "Eletrônicos"),
            new Produto("Cadeira",300.0, "Móveis"),
            new Produto("Monitor",900.0, "Eletrônicos"),
            new Produto("Mesa",700.0,"Móveis")
        );
        System.out.println(produtos.stream().filter(p -> p.getPreco() < 1000.0).sorted((p, p1) -> Double.compare(p.getPreco(), p1.getPreco())).collect(Collectors.toList()));

        // Exercício 08 -
        System.out.println(produtos.stream().filter(p -> p.getPreco() < 1000.0).filter(c -> c.getCategoria().equals("Eletrônicos")).sorted((p, p1) -> Double.compare(p.getPreco(), p1.getPreco())).limit(3).collect(Collectors.toList()));
    }
}