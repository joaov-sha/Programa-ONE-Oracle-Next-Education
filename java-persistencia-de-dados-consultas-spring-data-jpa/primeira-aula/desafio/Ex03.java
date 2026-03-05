public class Ex03 {
    public static void main(String[] args) {
        System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
        System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"

    }

    public static String obterPrimeiroEUltimoNome(String nomeCompleto) {
        String[] nomes = nomeCompleto.trim().split(" ");
        if(nomes.length <= 1){
            return nomes[0];
        }else{
            StringBuilder sb = new StringBuilder();
            sb.append(nomes[0]);
            sb.append(" ");
            sb.append(nomes[nomes.length-1]);
            return sb.toString();
        }
    }
}