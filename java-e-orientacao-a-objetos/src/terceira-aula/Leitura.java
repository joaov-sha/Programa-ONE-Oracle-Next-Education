import java.util.Scanner;
public class Leitura {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite seu filme favorito? ");
        String filme = s.nextLine();
        System.out.print("Qual o ano de lançamento? ");
        int anoDeLancamento = s.nextInt();
        System.out.print("Diga a sua avaliação para o filme: ");
        double avaliacao = s.nextDouble();

        System.out.println("Seu filme favorito é: " + filme);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Avaliação do filme: " + avaliacao);

        s.close();
    }
}
