package br.com.alura.screnmatch.principal;

import br.com.alura.screnmatch.model.DadosEpsodios;
import br.com.alura.screnmatch.model.DadosSerie;
import br.com.alura.screnmatch.model.DadosTemporada;
import br.com.alura.screnmatch.model.Episodio;
import br.com.alura.screnmatch.servicos.ConsumoApi;
import br.com.alura.screnmatch.servicos.ConverteDados;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private Scanner leitura = new Scanner(System.in);
    private final String ENDERECO = "https://www.omdbapi.com/?t=";// atributo imutável equivalete a const do javascript
    private final String API_KEY = "&apikey=6585022c";

    public void exibeMenu() {
        System.out.println("Digite o nome da série para a busca");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        System.out.println(dados);

        List<DadosTemporada> temporadas = new ArrayList<>();
        for (int i = 1; i <= dados.totalTemporadas(); i++) {
            json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }

        temporadas.forEach(System.out::println);

        for (int i = 0; i < dados.totalTemporadas(); i++) {
            List<DadosEpsodios> episodiosTemporada = temporadas.get(i).episodios();
            for (int j = 0; j < episodiosTemporada.size(); j++) {
                System.out.println(episodiosTemporada.get(j).titulo());
            }
        }

        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

        List<DadosEpsodios> dadosEpsodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList());
//
//        System.out.println("\n Top 10 epsódios");

//        dadosEpsodios.stream()
//                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
//                .peek(e -> System.out.println("Primeiro filtro N/A " + e))
//                .sorted(Comparator.comparing(DadosEpsodios::avaliacao).reversed())
//                .peek(e -> System.out.println("Ordenação " + e))
//                .limit(10)
//                .peek(e -> System.out.println("Limite " + e))
//                .map(e -> e.titulo().toUpperCase())
//                .peek(e -> System.out.println("Mapeamento " + e))
//                .forEach(System.out::println);
//
        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream()
                        .map(d -> new Episodio(t.numero(), d))// aqui criamos um novo tipo de array
                ).collect(Collectors.toList());

        episodios.forEach(System.out::println);

//        System.out.println("Digite o nome do trecho do titulo do epsódio");
//
//        var trechoDoTitulo = leitura.nextLine();
//        Optional<Episodio> epsodioBuscado = episodios.stream()
//                .filter(e -> e.getTitulo().toUpperCase().contains(trechoDoTitulo.toUpperCase()))
//                .findFirst();
//        if (epsodioBuscado.isPresent()) {
//            System.out.println("Epsódio encontrado");
//            System.out.println("Temporada " + epsodioBuscado.get().getTemporada());
//        } else {
//            System.out.println("Epsódio não encontrado");
//        }


//
//        leitura.nextLine();
//
//        System.out.println("\nA partir de que ano você deseja assistir os epsódios?\n");
//        var ano = leitura.nextInt();
//        LocalDate dataBusca = LocalDate.of(ano, 1, 1);
//
//        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        episodios.stream()
//                .filter(d -> d.getDataDeLancamento() != null && d.getDataDeLancamento().isAfter(dataBusca))
//                .forEach(e -> System.out.println(
//                        " Temporada: " + e.getTemporada() +
//                                " Epsódios: " + e.getTitulo() +
//                                " Data lançamento: " + e.getDataDeLancamento().format(formatador)// transforma a data
//                ));

        Map<Integer, Double> avaliacoesPorTemporada = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.groupingBy(Episodio::getTemporada,
                        Collectors.averagingDouble(Episodio::getAvaliacao)));
        System.out.println("\nCriando o mapa de avaliação geral\n");
        System.out.println("* * " + avaliacoesPorTemporada);

        DoubleSummaryStatistics est = episodios.stream()
                .filter(e -> e.getAvaliacao() > 0.0)
                .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));

        System.out.println("Média: " + est.getAverage());
        System.out.println("Melhor episódio: " + est.getMax());
        System.out.println("Pior episódio: " + est.getMin());
        System.out.println("Quantidade: " +  est.getCount());
    }
}
