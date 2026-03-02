package org.joaov_sha.controller;

import java.net.URI;

import org.joaov_sha.service.AddressBuilder;
import org.joaov_sha.service.RequestClient;

public class MenuController {

    private AddressBuilder ab = new AddressBuilder();
    private RequestClient rc = new RequestClient();
    
    public void showMenu(){
        System.out.println("-------------- Menu --------------");
        System.out.println("| 1 -------------------- Referências da api");
        System.out.println("| 2 -------------------- Consultar marcas");
        System.out.println("| 3 -------------------- Consultar modelos por marca");
        System.out.println("| 4 -------------------- Consultar ano de fabricação por modelo");
        System.out.println("| 5 -------------------- Consultar modelos por ano em determinada marca");
        System.out.println("| 6 -------------------- Consultar anos de fabricação por marca");
        System.out.println("| 7 -------------------- Consultar modelos por ano em determinada marca");
        System.out.println("| 8 -------------------- Consultar anos de fabricação por código fipe");
        System.out.println("| 9 -------------------- Consultar ano de fabricação específico por código fipe");
        System.out.println("| 10 ------------------- Consultar histórico de preços por ano de fabricação em determinado código fipe");
        System.out.println("| 0 -------------------- Sair do sistema");
        System.out.println("----------------------------------");
        System.out.println("Selecione uma opção para executar: ");
    }

    public void selectOption(int opcao){
        URI url = ab.buildAddress(opcao);
        String response = rc.createRequestAndGetResponse(url);
        System.out.println(response);
    }
}
