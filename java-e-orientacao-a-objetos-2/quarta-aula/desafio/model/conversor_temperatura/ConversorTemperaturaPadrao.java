package model.conversor_temperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public double celsiusParaFahrenheit(double valorEmCelsius) {
        return valorEmCelsius * 1.8 + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double valorEmFahrenheit) {
        return (valorEmFahrenheit - 32) * 5/9;
    }
    
}
