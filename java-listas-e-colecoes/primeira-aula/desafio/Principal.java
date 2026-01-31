package desafio;

import java.util.ArrayList;

import desafio.model.Pessoa;

public class Principal {
    
    public static void main(String[] args){

        ArrayList<Pessoa> listaDeChamada = new ArrayList<Pessoa>();

        Pessoa a = new Pessoa("Joao", 18);
        Pessoa b = new Pessoa("Maria", 18);
        Pessoa c = new Pessoa("Bruxa", 65);

        listaDeChamada.add(a);
        listaDeChamada.add(b);
        listaDeChamada.add(c);

        System.out.println(listaDeChamada.size());
        System.out.println(listaDeChamada.get(0).toString());

        for(Pessoa p : listaDeChamada){
            System.out.println(p.toString());
        }
    }
}
