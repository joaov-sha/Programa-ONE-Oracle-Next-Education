package model.conversor_moeda;

public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar * 5.5;
    }
    
}
