import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import model.Cartao;
import model.Item;

public class Main{

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        List<Item> carrinho = new ArrayList<Item>();
        boolean sucesso;
        System.out.print("Digite o limite do cartão: ");
        double limite = s.nextDouble();
        s.nextLine();
        Cartao c = new Cartao(limite);
        int op;

        do{
            System.out.print("Digite a descrição da compra: ");
            String nomeDoProduto = s.nextLine();
            System.out.print("informe o valor da compra: ");
            double valorDoProduto = s.nextDouble();
            s.nextLine();
            Item i = new Item(nomeDoProduto, valorDoProduto);
            sucesso = c.realizarCompra(carrinho, i);

            if(!sucesso)
                break;
            
            System.out.print("Digite 0 para sair ou 1 para continuar: ");
            op = s.nextInt();
            s.nextLine();
        }while(op == 1);

        
        if(carrinho.size() >= 1){
            System.out.println("***************** Compras realizadas *****************");
            for(Item i : carrinho){
                System.out.println(i.toString());
            }
            System.out.println("******************************************************");

            System.out.println("***************** Compras realizadas por ordem de valor *****************");
            Collections.sort(carrinho);
            for(Item i : carrinho){
                System.out.println(i.toString());
            }
            System.out.println("*************************************************************************");
        }

        s.close();
        System.exit(0);
    }
}