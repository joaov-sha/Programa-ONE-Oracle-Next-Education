package org.joaov_sha.gerenciador_pedidos.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;

    public Pedido(LocalDate data){
        this.data = data;
    }

    public Long getIdPedido(){
        return id;
    }

    public void setIdPedido(Long id){
        this.id = id;
    }

    public LocalDate getDataPedido(){
        return data;
    }

    public void setDataPedido(LocalDate data){
        this.data = data;
    }
}
