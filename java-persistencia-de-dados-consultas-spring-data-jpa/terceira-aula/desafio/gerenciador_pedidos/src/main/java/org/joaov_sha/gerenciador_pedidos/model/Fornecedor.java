package org.joaov_sha.gerenciador_pedidos.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Fornecedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "fornecedor")
    private List<Produto> produtosFornecidos;

    public Fornecedor(){}

    public Fornecedor(String nome){
        this.nome = nome;
    }

    public List<Produto> getProdutosFornecidos() {
        return produtosFornecidos;
    }

    public void setProdutosFornecidos(List<Produto> produtosFornecidos) {
        this.produtosFornecidos = produtosFornecidos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
