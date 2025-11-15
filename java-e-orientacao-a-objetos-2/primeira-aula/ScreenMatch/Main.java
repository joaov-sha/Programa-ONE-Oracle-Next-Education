public class Main {
    public static void main(String[] args){
        Filme meuFilme = new Filme();

        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1980);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
    }
}