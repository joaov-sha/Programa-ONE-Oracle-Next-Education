import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import models.Calculadora;
import models.Ordenador;
import models.Tipografo;
import models.Verificador;

public class Main {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        Calculadora c = new Calculadora();
        int resultadoDaMultiplicacao = c.multiplicacao(21,1);
        System.out.println(resultadoDaMultiplicacao);

        System.out.print("Informe um número para verificar se este é primo: ");
        int numero = s.nextInt();
        Verificador v = new Verificador();
        boolean isNumeroPrimo = v.verificaPrimo(numero);
        System.out.println("O número " + numero + " é primo? " + isNumeroPrimo);

        Tipografo t = new Tipografo();
        String fraseTipadaEmMaiuscula = t.tiparParaMaiusculo("A sua piscina tá cheia de ratos, suas ideias não correspondem aos fatos! O tempo não para!");
        System.out.println(fraseTipadaEmMaiuscula);

        System.out.print("A frase \"Socorram me subi no onibus em marrocos\" é palíndromo? ");
        boolean isPalindromo = v.verificarPalindromo("Socorram me subi no onibus em marrocos");
        System.out.println(isPalindromo);
        
        List<Integer> listaDeNumeros = List.of(1, 2, 3, 4, 5);
        System.out.println("A lista de números multiplicada por 3 é: " + c.progressaoLinear(listaDeNumeros) + " enquanto a lista original é: " + listaDeNumeros);

        List<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("Zelo");
        listaDeStrings.add("Bola");
        listaDeStrings.add("Dia");
        listaDeStrings.add("Amor");
        listaDeStrings.add("Escola");
        listaDeStrings.add("Flor");
        listaDeStrings.add("Casa");
        listaDeStrings.add("História");
        listaDeStrings.add("Inverno");
        listaDeStrings.add("Jardim");
        listaDeStrings.add("Gato");
        listaDeStrings.add("Kiwi");
        listaDeStrings.add("Livro");
        listaDeStrings.add("Mundo");
        listaDeStrings.add("Palavra");
        listaDeStrings.add("Noite");
        listaDeStrings.add("Queijo");
        listaDeStrings.add("Rio");
        listaDeStrings.add("Tempo");
        listaDeStrings.add("Vento");
        listaDeStrings.add("Oceano");
        listaDeStrings.add("União");
        listaDeStrings.add("Web");
        listaDeStrings.add("Xícara");
        listaDeStrings.add("Yoga");
        listaDeStrings.add("Sol");

        Ordenador o = new Ordenador();
        o.ordenarLista(listaDeStrings);
        System.out.println(listaDeStrings);
        
        System.out.print("Informe o primeiro número que deverá ser dividido: ");
        Double primeiroNumero = s.nextDouble();
        System.out.print("Informe o segundo número para efetuar a divisão: ");
        Double segundoNumero = s.nextDouble();
        System.out.println(c.divisao(primeiroNumero, segundoNumero));
        s.close();
        System.exit(0);
    }
}
