import java.time.LocalDate;
import java.util.ArrayList;

import model.*;

public class Main {
    
    public static void main(String[] args){
        ArrayList<Produto> carrinhoDeCompras = new ArrayList<Produto>();

        Produto p1 = new Produto("Computador", 2500.00, 5);
        Produto p2 = new Produto("Notebook", 3500.00, 10);
        Produto p3 = new Produto("Smartphone", 5000.00, 30);

        carrinhoDeCompras.add(p1);
        carrinhoDeCompras.add(p2);
        carrinhoDeCompras.add(p3);

        System.out.println("Tamanho da lista de produtos no carrinho: " + carrinhoDeCompras.size());

        System.out.println("O primeiro produto do carrinho é: " + carrinhoDeCompras.get(0).toString());

        System.out.println("Lista de produtos no carrinho:");
        for(Produto p : carrinhoDeCompras){
            System.out.println(p.toString());
        }

        ProdutoPerecivel iogurte = new ProdutoPerecivel("Iogurte", 4.99, 36, LocalDate.parse("2025-12-31"));
        System.out.println(iogurte.toString());
    }
}
