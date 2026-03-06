package org.joaov_sha.gerenciador_pedidos.repository;

import org.joaov_sha.gerenciador_pedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
}
