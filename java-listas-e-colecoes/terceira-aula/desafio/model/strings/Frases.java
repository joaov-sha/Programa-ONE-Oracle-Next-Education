package model.strings;

import java.util.ArrayList;

public class Frases {

    private ArrayList<String> frases = new ArrayList<String>();

    public Frases(){}
    
    public void adicionarELerFrasesDaLista(){
        frases.add("O rato");
        frases.add("roeu");
        frases.add("a roupa");
        frases.add("do rei");
        frases.add("de Roma");

        for(String palavra: frases){
            System.out.println(palavra);
        }
    }

    public Integer getFrasesSize(){
        return frases.size();
    }
}
