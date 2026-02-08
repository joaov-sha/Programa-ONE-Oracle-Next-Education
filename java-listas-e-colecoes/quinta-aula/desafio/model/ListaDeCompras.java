package model;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras{
    
    private List<Item> carrinho;

    public ListaDeCompras(){
        this.carrinho = new ArrayList<Item>();
    }

    public void addItemNoCarrinho(Item i){
        carrinho.add(i);
    }

    public int getQuantidadeDeItensNoCarrinho(){
        return carrinho.size();
    }

    public List<Item> getItensNoCarrinho(){
        return carrinho;
    }
}