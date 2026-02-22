package interfaces;

import java.util.List;

@FunctionalInterface
public interface FIOrdenacao {
    
    List<String> ordenarLista(List<String> listaDeStrings);
}