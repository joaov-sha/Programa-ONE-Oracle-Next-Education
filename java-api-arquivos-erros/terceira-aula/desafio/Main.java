package desafio;

import java.util.Scanner;

import desafio.errors.InvalidPasswordException;
import desafio.model.Login;
import desafio.model.User;

public class Main {
    
    public static void main(String[] args) throws InvalidPasswordException{
        Scanner s = new Scanner(System.in);
        /*
        System.out.print("Informe o primeiro número da operação: ");
        Double a = s.nextDouble();
        s.nextLine();
        System.out.print("Informe a operação que deseja realizar: ");
        String operacao = s.next();
        System.out.print("Informe o segundo número da operação: ");
        Double b = s.nextDouble();
        if(operacao.equals("+") || operacao.equals("soma")){
            System.out.println(Calculadora.soma(a, b));
        }else if(operacao.equals("-") || operacao.equals("subtracao")){
            System.out.println(Calculadora.subtracao(a, b));
        }else if(operacao.equals("*") || operacao.equals("multiplicacao")){
            System.out.println(Calculadora.multiplicacao(a, b));
        }else if(operacao.equals("/") || operacao.equals("divisao")){
            try {
                System.out.println(Calculadora.divisao(a, b));
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
            }
        }
        */

        User u = new User("Joao", "MinhaSenhaForte123");
        User u1 = new User("Maria", "SenhaT");

        System.out.println(Login.validateLogin(u.getSenha()));
        
        try {
            System.out.println(Login.validateLogin(u1.getSenha()));
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }

        s.close();
        System.exit(0);
    }
}
