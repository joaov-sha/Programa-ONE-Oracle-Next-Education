package models;

import java.util.Collections;
import java.util.List;

import interfaces.FIOrdenacao;

public class Ordenador {
    
    public List<String> ordenarLista(List<String> lista){
        FIOrdenacao fio = texto -> {
            Collections.sort(texto, (la, lb) -> la.compareTo(lb));
            return texto;
        };
        return fio.ordenarLista(lista);
    }
}
