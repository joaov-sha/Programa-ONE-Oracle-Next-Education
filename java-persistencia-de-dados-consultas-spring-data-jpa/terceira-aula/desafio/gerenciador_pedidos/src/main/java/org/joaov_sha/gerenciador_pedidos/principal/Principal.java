package org.joaov_sha.gerenciador_pedidos.principal;

import java.time.LocalDate;

import org.joaov_sha.gerenciador_pedidos.model.Categoria;
import org.joaov_sha.gerenciador_pedidos.model.Pedido;
import org.joaov_sha.gerenciador_pedidos.model.Produto;
import org.joaov_sha.gerenciador_pedidos.repository.CategoriaRepository;
import org.joaov_sha.gerenciador_pedidos.repository.PedidoRepository;
import org.joaov_sha.gerenciador_pedidos.repository.ProdutoRepository;

public class Principal {
    private CategoriaRepository categoriaRepository;
    private ProdutoRepository produtoRepository;
    private PedidoRepository pedidoRepository;
    
    public Principal(CategoriaRepository categoriaRepository, ProdutoRepository produtoRepository, PedidoRepository pedidoRepository){
        this.categoriaRepository = categoriaRepository;
        this.produtoRepository = produtoRepository;
        this.pedidoRepository = pedidoRepository;
    }
    
    public Principal(){}

    public void criarProduto(String nome, Double preco){
        Produto produto = new Produto(nome, preco);
        produtoRepository.save(produto);
    }

    public void criarCategoria(String nome){
        Categoria categoria = new Categoria(nome);
        categoriaRepository.save(categoria);
    }

    public void criarPedido(LocalDate data){
        Pedido pedido = new Pedido(data);
        pedidoRepository.save(pedido);
    }
}
