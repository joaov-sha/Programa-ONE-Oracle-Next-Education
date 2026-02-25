import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        
        System.out.println(listaDeNumeros.stream().toList());
        System.out.println(listaDeNumeros.stream().reduce(listaDeNumeros, n -> Verificador.verificaPrimo(n)))
    }
}