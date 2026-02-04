package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
    
    private List<Integer> listaDeNumerosInteiros = new ArrayList<Integer>();

    public Lista(){}

    public void adicionarNumerosOrdenarEImprimir(){
        listaDeNumerosInteiros.add(4);
        listaDeNumerosInteiros.add(3);
        listaDeNumerosInteiros.add(75);
        listaDeNumerosInteiros.add(2);
        listaDeNumerosInteiros.add(48);
        listaDeNumerosInteiros.add(36);
        listaDeNumerosInteiros.add(27);

        Collections.sort(listaDeNumerosInteiros);
        System.out.println(listaDeNumerosInteiros);
    }
}
