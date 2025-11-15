package exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int numeroAleatorioGerado = gerarNumeroAleatorio();
        int tentativas = 0;
        int numeroInformadoPeloUsuario = 0;
        while(tentativas < 5){
            numeroInformadoPeloUsuario = s.nextInt();
            if(numeroInformadoPeloUsuario == numeroAleatorioGerado){
                ++tentativas;
                System.out.println("Parabéns, você acertou! O número era: " + numeroInformadoPeloUsuario + " !");
                break;
            }else{
                if(numeroInformadoPeloUsuario > numeroAleatorioGerado){
                    System.out.println("Número informado é maior que o número desejado!");
                } else {
                    System.out.println("Número informado é menor que o número desejado!");
                }
            }
            tentativas++;
        }

        s.close();
    }

    static int gerarNumeroAleatorio(){
        return new Random().nextInt(100);
    }
}
