import model.conversor_moeda.ConversorMoeda;
import model.conversor_temperatura.ConversorTemperaturaPadrao;
import model.ecommerce.Produto;
import model.ecommerce.Servico;
import model.geometria.CalculadoraSalaRetangular;
import model.produtos.Livro;
import model.produtos.ProdutoFisico;
import model.tabuada.TabuadaMultiplicacao;

public class Main{
    public static void main(String[] args){

        ConversorMoeda conversorMoeda = new ConversorMoeda();
        System.out.println(conversorMoeda.converterDolarParaReal(275.50));

        CalculadoraSalaRetangular calculadoraMetragem = new CalculadoraSalaRetangular();
        System.out.println(calculadoraMetragem.calcularArea(4, 2));
        System.out.println(calculadoraMetragem.calcularPerimetro(4, 2));

        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(5);

        ConversorTemperaturaPadrao conversorTemperatura = new ConversorTemperaturaPadrao();
        System.out.println(conversorTemperatura.celsiusParaFahrenheit(100));
        System.out.println(conversorTemperatura.fahrenheitParaCelsius(100));

        Livro livro = new Livro("Harry Potter e o Cálice de Fogo", 150.00);
        System.out.println(livro.calcularPrecoFinal());
        
        ProdutoFisico ps5 = new ProdutoFisico("Playstation 5", 5000.00);
        System.out.println(ps5.calcularPrecoFinal());

        Produto p = new Produto("Betoneira", 1500.00);
        System.out.println(p.calcularPrecoFinal());

        Servico s = new Servico("Desenvolver software", 3500.00);
        System.out.println(s.calcularPrecoFinal());
    }
}