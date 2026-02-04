import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import model.Lista;
import model.Titulo;

public class Main{
    public static void main(String[] args){
        Lista lista = new Lista();
        lista.adicionarNumerosOrdenarEImprimir();

        List<Titulo> titulos = new ArrayList<Titulo>();
        Titulo t2 = new Titulo("Coisa");
        Titulo t1 = new Titulo("Qualquer");
        Titulo t3 = new Titulo("Aqui");
        titulos.add(t1);
        titulos.add(t2);
        titulos.add(t3);

        Collections.sort(titulos, (b1,b2) -> b1.getNome().compareTo(b2.getNome()));

        System.out.println(titulos);

        List<Titulo> testeList = new LinkedList<Titulo>();
        Titulo t4 = new Titulo("As tranças da vovó careca");
        Titulo t5 = new Titulo("O banho do peixe");
        Titulo t6 = new Titulo("Sharknado");

        testeList.add(t4);
        testeList.add(t5);
        testeList.add(t6);

        testeList = new ArrayList<Titulo>();
        
        testeList.add(t4);
        testeList.add(t5);
        testeList.add(t6);

        for (Titulo titulo : testeList) {
            System.out.println(titulo.getNome());
        }
    }
}