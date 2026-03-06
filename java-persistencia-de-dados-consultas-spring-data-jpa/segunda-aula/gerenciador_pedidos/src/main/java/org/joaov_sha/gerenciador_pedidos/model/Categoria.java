package org.joaov_sha.gerenciador_pedidos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    public Categoria(){}

    public Categoria(String nome){
        this.nome = nome;
    }

    public Long getIdCategoria(){
        return id;
    }

    public void setIdCategoria(Long id){
        this.id = id;
    }

    public String getNomeCategoria(){
        return nome;
    }

    public void setNomeCategoria(String nome){
        this.nome = nome;
    }
}
