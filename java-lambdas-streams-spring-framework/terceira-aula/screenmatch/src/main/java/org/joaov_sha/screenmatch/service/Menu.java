package org.joaov_sha.screenmatch.service;

import java.util.Scanner;

public class Menu {

    private Scanner s = new Scanner(System.in);

    private ConsumoApi consumo = new ConsumoApi();
    
    public void exibeDadosSerie(){
        System.out.print("Digite o nome da série para busca: ");
        String nomeSerie = s.nextLine();
    }
}
