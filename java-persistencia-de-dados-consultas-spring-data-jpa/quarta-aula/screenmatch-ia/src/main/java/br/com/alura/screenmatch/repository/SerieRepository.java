package br.com.alura.screenmatch.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.screenmatch.model.Serie;


@Repository
public interface SerieRepository extends JpaRepository<Serie, Long>{
    
    Optional<Serie> findByTituloContainingIgnoreCase(String nomeSerie);

    List<Serie> findByAtoresContainingIgnoreCaseAndAvaliacaoGreaterThanEqual(String nomeAtor, Double avaliacao);

    List<Serie> findTop5ByOrderByAvaliacaoDesc();

    List<Serie> findByGenero(String nomeGenero);

    List<Serie> findSeriesByTotalTemporadasLessThanEqualAndAvaliacaoGreaterThanEqual(Integer totalDeTemporadas, Double avaliacaoMinima);
}
