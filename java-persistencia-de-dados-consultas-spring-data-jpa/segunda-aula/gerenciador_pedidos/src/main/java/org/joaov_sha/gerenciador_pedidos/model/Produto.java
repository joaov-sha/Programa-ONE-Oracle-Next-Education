package org.joaov_sha.gerenciador_pedidos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)    
    private String nome;
    @Column(name = "valor")
    private Double preco;

    public Produto(){}

    public Produto(String nome, Double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public Long getIdProduto(){
        return id;
    }

    public void setIdProduto(Long id){
        this.id = id;
    }

    public String getNomeProduto(){
        return nome;
    }

    public void setNomeProduto(String nome){
        this.nome = nome;
    }

    public Double getPrecoProduto(){
        return preco;
    }

    public void setPrecoProduto(Double preco){
        this.preco = preco;
    }
}
