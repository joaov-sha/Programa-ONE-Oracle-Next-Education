package models;

import java.util.ArrayList;
import java.util.List;

import interfaces.FIDivisao;
import interfaces.FILinear;
import interfaces.FIMultiplicacao;

public class Calculadora {
    
    public int multiplicacao(int a, int b){
        FIMultiplicacao fim = (x, y) -> x * y;
        return fim.multiplicacao(a,b);
    }

    public Double divisao(Double a, double b) throws ArithmeticException{
        FIDivisao fid = (x,y) -> {
            if(y == 0){
                throw new ArithmeticException("Não é possível realizar divisão por zero.");
            }
            return x/y;
        };
        return fid.divisao(a, b);
    }

    public List<Integer> progressaoLinear(List<Integer> numeros){
        List<Integer> arrayListDeNumeros = new ArrayList<>();
        FILinear fil = (nums) -> {
            for(Integer num: nums){
                arrayListDeNumeros.add(num * 3);
            }
            return arrayListDeNumeros;
        };
        return fil.progressaoLinear(numeros);
    }
}
