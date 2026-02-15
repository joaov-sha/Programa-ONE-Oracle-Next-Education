package desafio.model;

import desafio.errors.InvalidOperationException;

public class Calculadora {

    public Calculadora() {
    }

    public static Double soma(Double a, Double b) {
        return a + b;
    }

    public static Double subtracao(Double a, Double b) {
        return a - b;
    }

    public static Double multiplicacao(Double a, Double b) {
        return a * b;
    }

    public static Double divisao(Double a, Double b) {
        if (b == 0) {
            throw new InvalidOperationException("O divisor da operação, deve ser diferente de zero!");
        }

        return (Double) a / b;
    }
}
