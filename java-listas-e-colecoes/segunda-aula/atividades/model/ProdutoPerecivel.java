package model;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto{
    
    private LocalDate dataDeValidade;
    private boolean estaVencido;

    public ProdutoPerecivel(String nome, double preco, int quantidade, LocalDate dataDeValidade){
        super(nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
        this.estaVencido = verificarVencimento();
    }

    public LocalDate getDataDeValidade(){
        return dataDeValidade;
    }

    public void setDataDeValidade(LocalDate dataDeValidade){
        this.dataDeValidade = dataDeValidade;
    }

    public boolean getValidade(){
        return estaVencido;
    }

    public boolean verificarVencimento(){
        if(dataDeValidade.isBefore(LocalDate.now())){
            return false;
        }
        return true;
    }

    @Override
    public String toString(){
        return String.format("Produto: %s%nPreco: %.2f%nQuantidade: %d%nData de validade: %s%nValidade: %s", super.getNome(), super.getPreco(), super.getQuantidade(), dataDeValidade, estaVencido);
    }
}
