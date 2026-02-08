package model;

import java.util.List;

public class Cartao {
    
    private double limite;
    private double saldo;

    public Cartao(double limite){
        this.limite = limite;
        this.saldo = limite;
    }

    public double getLimite(){
        return limite;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean realizarCompra(List<Item> listaDeItens, Item i){
        if(i.getPreco() <= this.getSaldo()){
            listaDeItens.add(i);
            System.out.println("Compra realizada com sucesso!");
            this.saldo -= i.getPreco();
            return true;
        }else{
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
}