package models;

import interfaces.FIMultiplicacao;

public class Calculadora {
    
    public int multiplicacao(int a, int b){
        FIMultiplicacao fim = (x, y) -> x * y;
        return fim.multiplicacao(a,b);
    }
}
