import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        listaDeFuncionarios();
        listaDeFuncionariosRemocaoElemento();
        acessandoElementos();
        elementosUnicosEmLista();
        criarMapClientes();
        verificandoExistenciaDeChave();
        selecionandoElementosComTamanhoReduzido();
        calculandoQuadradoDeNumeros();
        calculandoTotalComESemImposto();
        calculandoEstatisticas();
        System.exit(0);
    }

    public static void listaDeFuncionarios() {
        List<String> funcionarios = Arrays.asList("João", "Maria", "Vitor", "Ana");
        System.out.println("Lista de funcionários: " + funcionarios);
    }

    public static void listaDeFuncionariosRemocaoElemento() {
        List<String> funcionarios = new ArrayList<String>();
        funcionarios.add("Joana");
        funcionarios.add("Lucas");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");
        System.out.println("Lista inicial: " + funcionarios);
        funcionarios.retainAll(funcionarios.stream().filter(nome -> !nome.startsWith("P")).toList());
        System.out.println(funcionarios);
    }

    public static void acessandoElementos() {
        List<String> funcionarios = new ArrayList<String>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");
        System.out.println("A segunda pessoa da lista é: " + funcionarios.get(1));
        System.out.println("Total de funcionários: " + funcionarios.size());
    }

    public static void elementosUnicosEmLista() {
        HashSet<String> eventos = new HashSet<String>();
        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");
        System.out.println("Lista de eventos: " + eventos);
    }

    public static void criarMapClientes() {
        Map<Integer, String> clientes = new HashMap<Integer, String>();
        clientes.put(1, "João");
        clientes.put(2, "Marcos");
        clientes.put(3, "Maria");
        System.out.println("O nome do cliente com ID 2 é: " + clientes.get(2));
    }

    public static void verificandoExistenciaDeChave() {
        Map<Integer, String> clientes = new HashMap<Integer, String>();
        Integer chave = 0;
        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");
        do {
            System.out.print("Informe a chave da qual deseja verificar a existência: ");
            chave = s.nextInt();
            s.nextLine();
            if (!clientes.containsKey(chave)) {
                System.out.println("Cliente com ID " + chave + " não encontrado. Por favor, tente novamente!");
            } else {
                System.out.println("O nome do cliente com ID " + chave + " é: " + clientes.get(chave));
            }
        } while (!clientes.containsKey(chave));
    }

    public static void selecionandoElementosComTamanhoReduzido() {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");
        System.out.println(funcionarios.stream().filter(f -> f.length() <= 5).collect(Collectors.toList()));
    }

    public static void calculandoQuadradoDeNumeros(){
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);
        System.out.println(numeros.stream().map(n -> n * n).collect(Collectors.toList()));
    }

    public static void calculandoTotalComESemImposto(){
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);
        Double totalSemImposto = 0.0, totalComImposto = 0.0;
        System.out.println("Valor total antes do imposto: " + precosProdutos.stream().reduce(totalSemImposto, (p1, p2) -> p1+p2));
        System.out.println("Valor total depois do imposto: " + precosProdutos.stream().map(p -> p + 0.08 * p).reduce(totalComImposto, (p1, p2) -> p1 + p2));
    }

    public static void calculandoEstatisticas(){
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
        Double mediaNota = 0.0, menorNota = 0.0, maiorNota = 0.0;
        menorNota = notas.stream().min((n1, n2) -> Double.compare(n1, n2)).stream().collect(Collectors.toList()).getFirst();
        maiorNota = notas.stream().max((n1, n2) -> Double.compare(n1, n2)).stream().collect(Collectors.toList()).getFirst();
        System.out.println("A média das notas é: " + notas.stream().reduce(mediaNota, (n1, n2) -> (n1 + n2))/notas.size());
        System.out.println("A menor nota foi: " + menorNota.toString());
        System.out.println("A maior nota foi: " + maiorNota);
    }
}