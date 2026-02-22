package models;

import interfaces.FITipagem;

public class Tipografo {
    
    public String tiparParaMaiusculo(String texto){
        FITipagem fit = (txt) -> {
            String[] caracteres = txt.split("");
            StringBuilder sb = new StringBuilder();
            for (String caractere : caracteres) {
                sb.append(caractere.toUpperCase());
            }
            return sb.toString();
        };
        return fit.tiparParaMaiusculo(texto);
    }
}
