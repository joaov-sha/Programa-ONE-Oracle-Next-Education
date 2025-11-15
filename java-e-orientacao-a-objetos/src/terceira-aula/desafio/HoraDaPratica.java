package desafio;

import java.util.Scanner;

public class HoraDaPratica {

    public static void main(String[] args){
        // ex01(5);
        // ex02(5, 10);
        // ex03();
        // ex04();
        // ex05();
        ex06();
    }

    static void ex01(int numero){
        if(numero > 0){
            System.out.println("Número positivo!");
        }else if(numero == 0){
            System.out.println("Número neutro!");
        }else{
            System.out.println("Número negativo!");
        }
    }

    static void ex02(int primeiroNumero, int segundoNumero){
        if(primeiroNumero > segundoNumero){
            System.out.println("O " + primeiroNumero + " é maior que " + segundoNumero);
        }else{
            System.out.println("O " + segundoNumero + " é maior que " + primeiroNumero);
        }
    }

    static void ex03(){
        Scanner s = new Scanner(System.in);
        int opcao = s.nextInt();
        switch(opcao){
            case 1:
                System.out.print("Informe o valor do lado do quadrado: ");
                int lado = s.nextInt();
                System.out.printf("A área do quadrado é: %.2f\n", Math.pow(lado,2));
                break;
            case 2:
            System.out.print("Informe o valor do raio do círculo: ");
                double raio = s.nextDouble();
                System.out.printf("A área do círculo é: %.2f\n", Math.PI * Math.pow(raio,2));
                break;
            default:
                System.out.println("Valor incorreto informado!");
                break;
        }
        s.close();
    }

    static void ex04(){
        Scanner s = new Scanner(System.in);

        System.out.print("Informe um número para que seja exibida a tabuada: ");
        int n = s.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }

        s.close();
    }

    static void ex05(){
        Scanner s = new Scanner(System.in);

        System.out.print("Informe um número qualquer: ");
        int n = s.nextInt();

        if(n % 2 == 0){
            System.out.println("O número " + n + " é par!");
        }else{
            System.out.println("O número " + n + " é impar!");
        }

        s.close();
    }

    static void ex06(){
        Scanner s = new Scanner(System.in);

        int fatorial = 1;
        
        System.out.print("Informe um número inteiro qualquer para que seja calculado seu fatorial: ");
        int n = s.nextInt();

        for(int i = n; i >= 1; i--){
            fatorial *= i;
        }

        System.out.println(fatorial);

        s.close();
    }
}
