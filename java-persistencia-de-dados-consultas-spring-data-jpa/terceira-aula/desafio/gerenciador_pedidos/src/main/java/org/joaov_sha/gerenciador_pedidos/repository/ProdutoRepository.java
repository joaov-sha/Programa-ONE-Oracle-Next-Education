package org.joaov_sha.gerenciador_pedidos.repository;

import org.joaov_sha.gerenciador_pedidos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
