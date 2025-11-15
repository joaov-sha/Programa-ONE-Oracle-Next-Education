package exercicios;
import java.util.Scanner;
public class ConversorDeTemperatura {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Informe a temperatura atual em graus Célsius: ");
        double temperaturaEmCelsius = s.nextDouble();
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 1.8) + 32;
        System.out.printf("A temperatura atual é de: %.2f Graus Fahrenheit\n", temperaturaEmFahrenheit);
        s.close();
    }
}
