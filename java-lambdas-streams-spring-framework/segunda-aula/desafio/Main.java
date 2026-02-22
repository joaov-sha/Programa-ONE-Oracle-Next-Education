import java.util.Scanner;

import models.Calculadora;
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
        System.out.println(isNumeroPrimo);

        Tipografo t = new Tipografo();
        String fraseTipadaEmMaiuscula = t.tiparParaMaiusculo("A sua piscina tá cheia de ratos, suas ideias não correspondem aos fatos! O tempo não para!");
        System.out.println(fraseTipadaEmMaiuscula);

        s.close();
        System.exit(0);
    }
}
