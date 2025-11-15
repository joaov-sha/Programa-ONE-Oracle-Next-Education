public class Filme {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        // System.out.println("Filme: Top Gun: Maverick");
        int anoDeLancamento = 2022;
        // System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        
        System.out.println();

        double media = (9.8 + 6.3 + 8.0) / 3;
        String sinopse = "Filme de ação com galã dos anos 80.";
        String dadosDoFilme = String.format("""
                Filme: Top Gun: Maverick
                Sinopse: %s
                Ano de lançamento: %d
                Incluído no plano: %b
                Avaliação dos usuários: %.2f\n
                """, sinopse, anoDeLancamento, incluidoNoPlano, notaDoFilme);
        
        System.out.println(dadosDoFilme);
    }
}
