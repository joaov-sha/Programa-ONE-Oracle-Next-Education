import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome = "Jaqueline Oliveira";
        String tipoDeConta = "corrente";
        double saldo = 2500;
        int opcao = 5;
        System.out.printf(
                """
                        *************************************
                        Nome: %s
                        Tipo de Conta: %s
                        Saldo: %.2f
                        *************************************
                        """, nome, tipoDeConta, saldo);
        do {
            System.out.println("Operações: ");
            System.out.println();
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            opcao = s.nextInt();
            switch (opcao) {
                case 1:
                    System.out.printf("O saldo atual é de %.2f\n", saldo);
                    break;
                case 2:
                    System.out.print("Informe o valor a ser depositado: ");
                    double deposito = s.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                    } else {
                        while (deposito <= 0) {
                            System.out.println("Valor inválido para depósito! Informe o valor a ser depositado: ");
                            deposito = s.nextDouble();
                            if (deposito > 0) {
                                saldo += deposito;
                                break;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.print("Informe o valor da transferência a ser realizada: ");
                    double transferencia = s.nextDouble();
                    if (transferencia > saldo) {
                        while (transferencia > saldo) {
                            System.out.println("Saldo insuficiente! Tente novamente: ");
                            transferencia = s.nextDouble();
                            if(transferencia <= saldo){
                                saldo -= transferencia;
                                break;
                            }
                        }
                    } else {
                        saldo -= transferencia;
                    }
                    break;
                case 4:
                    System.out.println("O sistema será encerrado agora, obrigado por utilizar!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida informada!");
                    break;
            }
        } while (opcao != 4);
        s.close();
    }
}