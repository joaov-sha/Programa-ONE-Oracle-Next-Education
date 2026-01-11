import java.util.ArrayList;
import java.util.List;

import animal.Cachorro;
import animal.Gato;
import carro.Carro;
import carro.ModeloCarro;
import conta_bancaria.ContaCorrente;

public class Main {
    
    public static void main(String[] args){

        ModeloCarro FerrariF40 = new ModeloCarro("F40", 1987, 2500000.00);
        ModeloCarro FerrariF50 = new ModeloCarro("F50", 1997, 3350000.00);
        ModeloCarro FerrariF80 = new ModeloCarro("F80", 2027, 15000000.00);
        List<Double> precoMedioFerrari = new ArrayList<Double>();
        precoMedioFerrari.add(FerrariF40.getPreco());
        precoMedioFerrari.add(FerrariF50.getPreco());
        precoMedioFerrari.add(FerrariF80.getPreco());
        double precoMedio = Carro.calcularPrecoMedio(precoMedioFerrari);
        System.out.printf("O preço médio de uma ferrari desde os anos 80 até hoje é: %.2f\n", precoMedio);

        Gato gato = new Gato("Duke");
        gato.emitirSom();
        gato.arranharMoveis();

        Cachorro cachorro = new Cachorro("Arfus");
        cachorro.emitirSom();
        cachorro.abanarRabo();

        ContaCorrente cc = new ContaCorrente("João", 1, 1500.00);
        cc.cobrarTarifaMensal(150.00);
        System.out.printf("O saldo da conta corrente após a cobrança da taxa é de: R$ %.2f\n", cc.consultarSaldo());
    }
}
