package org.joaov_sha.gerenciador_pedidos.repository;

import org.joaov_sha.gerenciador_pedidos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}
