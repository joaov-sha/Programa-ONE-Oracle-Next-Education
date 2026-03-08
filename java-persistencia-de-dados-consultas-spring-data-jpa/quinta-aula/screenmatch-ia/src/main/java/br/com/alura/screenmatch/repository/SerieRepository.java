package br.com.alura.screenmatch.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Serie;


@Repository
public interface SerieRepository extends JpaRepository<Serie, Long>{
    
    Optional<Serie> findByTituloContainingIgnoreCase(String nomeSerie);

    List<Serie> findByAtoresContainingIgnoreCaseAndAvaliacaoGreaterThanEqual(String nomeAtor, Double avaliacao);

    List<Serie> findTop5ByOrderByAvaliacaoDesc();

    List<Serie> findByGenero(String nomeGenero);

    List<Serie> findSeriesByTotalTemporadasLessThanEqualAndAvaliacaoGreaterThanEqual(Integer totalDeTemporadas, Double avaliacaoMinima);

    @Query("select s from series where s.totalTemporadas <= :totalDeTemporadas and s.avaliacao >= :avaliacaoMinima")
    List<Serie> seriesPorTemporadaEAvaliacao(Integer totalDeTemporadas, Double avaliacaoMinima);

    @Query("select e from serie s join s.episodios e where e.titulo ilike %:trechoEpisodio%")
    List<Episodio> episodiosPorTrecho(String trechoEpisodio);

    @Query("SELECT e FROM Serie s JOIN s.episodios e WHERE s = :serie ORDER BY e.avaliacao DESC LIMIT 5")
    List<Episodio> topEpisodiosPorSerie(Serie serie);

    @Query("SELECT e FROM Serie s JOIN s.episodios e WHERE s = :serie AND YEAR(e.dataLancamento)")
    List<Episodio> episodioPorSerieEAno(Serie serie, int anoLancamento);
}
