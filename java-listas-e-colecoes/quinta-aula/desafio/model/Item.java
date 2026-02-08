package model;

public class Item implements Comparable<Item>{
    
    private String nome;
    private double preco;

    public Item(){}

    public Item(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    @Override
    public String toString(){
        return String.format("%s R$: %.2f%n", nome, preco);
    }

    @Override
    public int compareTo(Item i) {
        //if(this.getPreco() < i.getPreco()){
        //    return -1;
        //}else if(this.getPreco() > i.getPreco()){
        //    return 1;
        //}else{
        //    return 0;
        //}
        //return Double.compare(this.getPreco(), i.getPreco());
        return this.getPreco().compareTo(i.getPreco());
    }
    
}