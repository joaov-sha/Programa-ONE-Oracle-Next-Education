package models;

import interfaces.FIPalindromo;
import interfaces.FIPrimo;

public class Verificador {
    
    // public boolean verificarPrimo(int numero){
    //     FIPrimo fip = new FIPrimo() {
    //         @Override
    //         public boolean verificaPrimo(int numero){
    //             boolean isNumeroPrimo = true;
    //             int divisores = 0;
    //             for(int i = 1; i <= numero; i++){
    //                 if(numero % i == 0){
    //                     divisores++;
    //                 }
    //             }
    //             if(divisores > 2){
    //                 isNumeroPrimo = false;
    //             }
    //             return isNumeroPrimo;
    //         }
    //     };
    //     return fip.verificaPrimo(numero);
    // }

    public boolean verificaPrimo(int numero){
        FIPrimo fip = (x) -> {
            if(x <= 1) return false;
            int divisores = 0;
            for(int i = 1; i <= x; i++){
                if(x % i == 0){
                    divisores++;
                }
            }
            if(divisores > 2){
                return false;
            }
            return true;
        };
        return fip.verificaPrimo(numero);
    }

    public boolean verificarPalindromo(String texto){
        FIPalindromo fipa = (txt) -> {
            String[] arrayStrings = txt.split("");
            StringBuilder sb = new StringBuilder();
            for(String caractere : arrayStrings){
                if(!caractere.equals(" ")){
                    sb.append(caractere);
                }
            }
            String sbReverse = sb.reverse().toString();
            if(sbReverse.equalsIgnoreCase(sb.toString())){
                return true;
            }
            return false;
        };
        return fipa.verificarPalindromo(texto);
    }
}
