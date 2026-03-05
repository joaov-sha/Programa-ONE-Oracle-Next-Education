import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o nome do mês que deseja verificar a quantidade de dias: ");
        String nomeDoMes = s.nextLine();

        switch (nomeDoMes.toUpperCase()) {
            case "JANEIRO":
                System.out.println("O mês de JANEIRO possui: " + EnumEx06.JANEIRO.getNumeroDeDias() + " dia(s).");
                break;
            case "FEVEREIRO":
                System.out.println("O mês de FEVEREIRO possui: " + EnumEx06.FEVEIRO.getNumeroDeDias() + " dia(s).");
                break;
            case "MARÇO":
                System.out.println("O mês de MARÇO possui: " + EnumEx06.MARÇO.getNumeroDeDias() + " dia(s).");
                break;
            case "ABRIL":
                System.out.println("O mês de ABRIL possui: " + EnumEx06.ABRIL.getNumeroDeDias() + " dia(s).");
                break;
            case "MAIO":
                System.out.println("O mês de MAIO possui: " + EnumEx06.MAIO.getNumeroDeDias() + " dia(s).");
                break;
            case "JUNHO":
                System.out.println("O mês de JUNHO possui: " + EnumEx06.JUNHO.getNumeroDeDias() + " dia(s).");
                break;
            case "JULHO":
                System.out.println("O mês de JULHO possui: " + EnumEx06.JULHO.getNumeroDeDias() + " dia(s).");
                break;
            case "AGOSTO":
                System.out.println("O mês de AGOSTO possui: " + EnumEx06.AGOSTO.getNumeroDeDias() + " dia(s).");
                break;
            case "SETEMBRO":
                System.out.println("O mês de SETEMBRO possui: " + EnumEx06.SETEMBRO.getNumeroDeDias() + " dia(s).");
                break;
            case "OUTUBRO":
                System.out.println("O mês de OUTUBRO possui: " + EnumEx06.OUTUBRO.getNumeroDeDias() + " dia(s).");
                break;
            case "NOVEMBRO":
                System.out.println("O mês de NOVEMBRO possui: " + EnumEx06.NOVEMBRO.getNumeroDeDias() + " dia(s).");
                break;
            case "DEZEMBRO":
                System.out.println("O mês de DEZEMBRO possui: " + EnumEx06.DEZEMBRO.getNumeroDeDias() + " dia(s).");
                break;
            default:
                break;
        }

        s.close();
        System.exit(0);
    }
}
