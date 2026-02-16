package org.joaov_sha;

import java.io.IOException;
import java.util.Scanner;

import org.joaov_sha.model.Conversor;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Informe a moeda da qual quer converter: ");
            String baseTicker = s.nextLine();
            System.out.print("Informe a moeda para a qual quer converter: ");
            String targetTicker = s.nextLine();
            System.out.print("Informe o valor a ser convertido de " + baseTicker + " para " + targetTicker + ": ");
            Double valor = s.nextDouble();
            Double taxaDeConversao = Conversor.getFatorDeConversao(baseTicker, targetTicker);
            Double valorConvertido = valor * taxaDeConversao;
            System.out.printf("%.2f %s é igual a %.2f %s%n", valor, baseTicker, valorConvertido, targetTicker);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        s.close();
        System.exit(0);
    }
}