package org.joaov_sha.gerenciador_pedidos;

import java.time.LocalDate;

import org.joaov_sha.gerenciador_pedidos.principal.Principal;
import org.joaov_sha.gerenciador_pedidos.repository.CategoriaRepository;
import org.joaov_sha.gerenciador_pedidos.repository.PedidoRepository;
import org.joaov_sha.gerenciador_pedidos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GerenciadorPedidosApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorPedidosApplication.class, args);
	}

	@Override
	public void run(String... args){
		Principal principal = new Principal(categoriaRepository, produtoRepository, pedidoRepository);
		principal.criarCategoria("Móveis");
		principal.criarProduto("Cadeira", 900.00);
		principal.criarPedido(LocalDate.now());
	}
}
