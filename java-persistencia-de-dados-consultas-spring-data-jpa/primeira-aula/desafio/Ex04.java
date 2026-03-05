public class Ex04 {
    public static void main(String[] args) {
        System.out.println(ehPalindromo("socorram me subi no onibus em marrocos")); // Saída: true
        System.out.println(ehPalindromo("Java")); // Saída: false
    }

    public static boolean ehPalindromo(String palavra) {
        StringBuilder sb = new StringBuilder();
        sb.setLength(0);
        String[] arrayStrings = palavra.split("");
            for(String caractere : arrayStrings){
                if(!caractere.equals(" ")){
                    sb.append(caractere);
                }
            }
            String palavraEmCaracteres = sb.toString();
            String sbReverse = sb.reverse().toString();
            if(sbReverse.equalsIgnoreCase(palavraEmCaracteres)){
                return true;
            }
            return false;
    }

}
