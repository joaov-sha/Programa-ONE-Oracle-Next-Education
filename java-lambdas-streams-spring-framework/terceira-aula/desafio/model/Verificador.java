package model;
import java.util.ArrayList;
import java.util.List;
import functionalinterfaces.*;

public class Verificador {

    public static boolean verificaPrimo(int numero) {
        FIPrimo fip = (x) -> {
            if (x <= 1)
                return false;
            int divisores = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    divisores++;
                }
            }
            if (divisores > 2) {
                return false;
            }
            return true;
        };
        return fip.verificaPrimo(numero);
    }

    public static List<Integer> verificarListaDePrimos(List<Integer> listaDeNumeros) {
        List<Integer> listaDeNumerosPrimos = new ArrayList<Integer>();
        for (Integer i : listaDeNumeros) {
            FIPrimo fip = (x) -> {
                if (x <= 1)
                    return false;
                int divisores = 0;
                for (int j = 1; j <= x; j++) {
                    if (x % j == 0) {
                        divisores++;
                    }
                }
                if (divisores > 2) {
                    return false;
                }

                return true;
            };
            if(fip.verificaPrimo(i)){
                listaDeNumerosPrimos.add(i);
            }
        }
        return listaDeNumerosPrimos;
    }
}
