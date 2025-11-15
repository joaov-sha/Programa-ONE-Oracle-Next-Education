import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;    
public class HoraDaPratica {
    public static void main(String[] args){
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
    }

    static void ex01(){
        System.out.println("Olá, [Seu Nome]!");
    }

    static void ex02(){
        System.out.println("Tudo bem?");
    }

    static void ex03(){
        Scanner s = new Scanner(System.in);
        String anotacao = "";
        List<String> cadernoDeAnotacoes = new ArrayList<String>();
        while(!anotacao.equals("sair")){
            anotacao = s.nextLine();
            cadernoDeAnotacoes.add(anotacao);
        }
        for (String nota : cadernoDeAnotacoes) {
            System.out.println(nota);
        }
        s.close();
    }

    static void ex04(){
        Scanner s = new Scanner(System.in);
        int primeiroNumero, segundoNumero, resultado;
        primeiroNumero = s.nextInt();
        segundoNumero = s.nextInt();
        resultado = primeiroNumero + segundoNumero;
        System.out.println(resultado);
        s.close();
    }

    static void ex05(){
        Scanner s = new Scanner(System.in);
        int primeiroNumero, segundoNumero, resultado;
        primeiroNumero = s.nextInt();
        segundoNumero = s.nextInt();
        resultado = primeiroNumero - segundoNumero;
        System.out.println(resultado);
        s.close();
    }
}
