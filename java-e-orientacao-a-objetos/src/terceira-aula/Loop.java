import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        double media = 0, nota = 0;
        
        for(int i = 0; i < 3; i++){
            System.out.print("Informe a sua avaliação do filme: ");
            nota = s.nextDouble();
            media += nota;
        }

        System.out.printf("Média das avaliações: %.2f\n", media/3.0);

        s.close();
    }
}
