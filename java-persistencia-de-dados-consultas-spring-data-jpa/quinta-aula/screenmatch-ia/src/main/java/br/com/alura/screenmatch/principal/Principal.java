package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.repository.SerieRepository;
import br.com.alura.screenmatch.service.ConsumoApi;
import br.com.alura.screenmatch.service.ConverteDados;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "\"yourApiKey\"";
    private List<DadosSerie> dadosSeries = new ArrayList<>();
    private Optional<Serie> serieBusca;
    private SerieRepository serieRepository;

    private List<Serie> series = new ArrayList<>();

    public Principal(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    public void exibeMenu() {
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    1 - Buscar séries
                    2 - Buscar episódios
                    3 - Listar séries
                    4 - Buscar por séries por titulo
                    5 - Buscar séries por ator
                    6 - Buscar top 5 séries
                    7 - Buscar séries por categoria
                    8 - Buscar séries por temporadas e por avaliação
                    9 - Buscar episódios por trecho do nome
                    10 - Top 5 episódios por serie
                    11 - 
                    0 - Sair
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    buscarSerieWeb();
                    break;
                case 2:
                    buscarEpisodioPorSerie();
                    break;
                case 3:
                    listarSeriesBuscadas();
                    break;
                case 4:
                    buscarSeriePorTitulo();
                    break;
                case 5:
                    buscarSeriesPorAtor();
                    break;
                case 6:
                    buscarTop5Series();
                    break;
                case 7:
                    buscarSeriesPorCategoria();
                    break;
                case 8:
                    filtrarSeriesPorTemporadasEAvaliacao();
                    break;
                case 9:
                    buscarEpisodioPorTrecho();
                    break;
                case 10:
                    topEpisodiosPorSerie();
                    break;
                case 11:
                    buscarEpisodiosPorData();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void buscarEpisodiosPorData() {
        buscarSeriePorTitulo();
        if(serieBusca.isPresent()){
            Serie serie = serieBusca.get();
            System.out.print("Informe o ano limite de lançamento do episódio: ");
            var anoLancamento = leitura.nextInt();
            leitura.nextLine();

            List<Episodio> episodiosAno = serieRepository.episodioPorSerieEAno(serie, anoLancamento);
        }
    }

    private void topEpisodiosPorSerie() {
        buscarSeriePorTitulo();
        if(serieBusca.isPresent()){
            Serie serie = serieBusca.get();
            List<Episodio> topEpisodios = serieRepository.topEpisodiosPorSerie(serie);
            topEpisodios.forEach(e -> System.out.printf("Série: %s Temporada %s - Episódio %s - %s%n", e.getSerie().getTitulo(), e.getTemporada(), e.getNumeroEpisodio(), e.getTitulo()));
        }
    }

    private void buscarEpisodioPorTrecho() {
        System.out.print("Qual o nome do episódio para busca? ");
        var trechoEpisodio = leitura.nextLine();
        List<Episodio> episodiosEncontrados = serieRepository.episodiosPorTrecho(trechoEpisodio);
        episodiosEncontrados.forEach(e -> System.out.printf("Série: %s Temporada %s - Episódio %s - Avaliação %s%n", e.getSerie().getTitulo(), e.getTemporada(), e.getNumeroEpisodio(), e.getTitulo(), e.getAvaliacao()));
    }

    private void buscarSeriesPorCategoria() {
        System.out.print("Qual categoria ou gênero de séries que deseja buscar? ");
        var nomeGenero = leitura.nextLine();
        List<Serie> seriesPorCategoria = serieRepository.findByGenero(nomeGenero);
        System.out.println("Séries da categoria " + nomeGenero);
        seriesPorCategoria.forEach(System.out::println);
    }

    private void listarSeriesBuscadas() {
        series = serieRepository.findAll();
        // series = dadosSeries.stream().map(d -> new
        // Serie(d)).collect(Collectors.toList());
        // dadosSeries.forEach(System.out::println);
        // series.stream().sorted(Comparator.comparing(Serie::getGenero)).forEach(System.out::println);
        System.out.println(series);
    }

    private void buscarSerieWeb() {
        DadosSerie dados = getDadosSerie();
        Serie serie = new Serie(dados);
        serieRepository.save(serie);
        // dadosSeries.add(dados);
        System.out.println(dados);
    }

    private DadosSerie getDadosSerie() {
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        return dados;
    }

    private void buscarEpisodioPorSerie() {
        System.out.print("Escolha uma série pelo nome: ");
        var nomeSerie = leitura.nextLine();

        // Optional<Serie> serie = series.stream()
        // .filter(s ->
        // s.getTitulo().toLowerCase().contains(nomeSerie.toLowerCase())).findFirst();

        Optional<Serie> serie = serieRepository.findByTituloContainingIgnoreCase(nomeSerie);

        if (serie.isPresent()) {

            var serieEncontrada = serie.get();
            List<DadosTemporada> temporadas = new ArrayList<>();

            for (int i = 1; i <= serieEncontrada.getTotalTemporadas(); i++) {
                var json = consumo
                        .obterDados(
                                ENDERECO + serieEncontrada.getTitulo().replace(" ", "+") + "&season=" + i + API_KEY);
                DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
                temporadas.add(dadosTemporada);
            }
            List<Episodio> episodios = temporadas.stream()
                    .flatMap(d -> d.episodios().stream().map(e -> new Episodio(d.numero(), e)))
                    .collect(Collectors.toList());
            serieEncontrada.setEpisodios(episodios);
            serieRepository.save(serieEncontrada);

            temporadas.forEach(System.out::println);

        } else {
            System.out.println("Serie não encontrada!");
        }
    }

    private void buscarSeriePorTitulo() {
        System.out.print("Informe o nome da série que deseja buscar: ");
        var nomeSerie = leitura.nextLine();
        Optional<Serie> serieBuscada = serieRepository.findByTituloContainingIgnoreCase(nomeSerie);

        if (serieBuscada.isPresent()) {
            System.out.println("Dados da série: " + serieBuscada.get());
        } else {
            System.out.println("Série não encontrada!");
        }
    }

    private void buscarSeriesPorAtor() {
        // System.out.print("Informe o nome do ator que deseja buscar: ");
        // var nomeAtor = leitura.nextLine();
        // List<Serie> seriesEncontradas =
        // serieRepository.findByAtoresContainingIgnoreCase(nomeAtor);
        // System.out.println(seriesEncontradas);
        System.out.print("Qual o nome para busca? ");
        var nomeAtor = leitura.nextLine();
        System.out.print("Avaliações a partir de que valor? ");
        var avaliacao = leitura.nextDouble();
        leitura.nextLine();
        List<Serie> seriesEncontradas = serieRepository
                .findByAtoresContainingIgnoreCaseAndAvaliacaoGreaterThanEqual(nomeAtor, avaliacao);
        System.out.println("Séries em que o ator: " + nomeAtor + " trabalhou: ");
        seriesEncontradas.forEach(s -> System.out.println(s.getTitulo() + " avaliação: " + s.getAvaliacao()));
    }

    private void buscarTop5Series() {
        List<Serie> topSeries = serieRepository.findTop5ByOrderByAvaliacaoDesc();
        topSeries.forEach(s -> System.out.println(s.getTitulo() + " avaliação: " + s.getAvaliacao()));
    }

    private void buscarSeriesPorTemporadasEAvaliacao() {
        System.out.print("Até quantas temporadas de série você deseja ver? ");
        var totalDeTemporadas = leitura.nextInt();
        leitura.nextLine();
        System.out.print("Qual a avaliação mínima das séries que deseja ver? ");
        var avaliacaoMinima = leitura.nextDouble();
        leitura.nextLine();
        List<Serie> series = serieRepository.findSeriesByTotalTemporadasLessThanEqualAndAvaliacaoGreaterThanEqual(
                totalDeTemporadas, avaliacaoMinima);
        series.forEach(s -> System.out.println(
                s.getTitulo() + " temporada(s): " + s.getTotalTemporadas() + " avaliação: " + s.getAvaliacao()));
    }

    private void filtrarSeriesPorTemporadasEAvaliacao(){
        System.out.print("Até quantas temporadas de série você deseja ver? ");
        var totalDeTemporadas = leitura.nextInt();
        leitura.nextLine();
        System.out.print("Qual a avaliação mínima das séries que você deseja ver? ");
        var avaliacaoMinima = leitura.nextDouble();
        List<Serie> series = serieRepository.seriesPorTemporadaEAvaliacao(totalDeTemporadas, avaliacaoMinima);
        System.out.println(series);
    }
}