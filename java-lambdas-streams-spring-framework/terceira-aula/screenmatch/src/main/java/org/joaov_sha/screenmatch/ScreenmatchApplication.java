package org.joaov_sha.screenmatch;

import java.util.ArrayList;
import java.util.List;

import org.joaov_sha.screenmatch.model.DadosSerieRecord;
import org.joaov_sha.screenmatch.model.DadosTemporadaRecord;
import org.joaov_sha.screenmatch.service.ConsumoApi;
import org.joaov_sha.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		List<DadosTemporadaRecord> temporadas = new ArrayList<>();
		var consumoApi = new ConsumoApi();
		
		var temporadaJson = consumoApi.obterDados("https://api.themoviedb.org/3/search/tv?query=suits&include_adult=false&language=en-US&page=1");
		ConverteDados converter = new ConverteDados();
		DadosSerieRecord serieRecord = converter.obterDados(temporadaJson, DadosSerieRecord.class);
		System.out.println(serieRecord);
		
		ConverteDados conversor = new ConverteDados();
		String json = "";
		DadosTemporadaRecord record = null;
		for(int i = 1; i <= 9; i++){
			json = consumoApi.obterDados("https://api.themoviedb.org/3/tv/37680/season/" + i + "?language=pt-BR");
			record = conversor.obterDados(json, DadosTemporadaRecord.class);
			temporadas.add(record);
		}
		
		for(DadosTemporadaRecord temporada : temporadas){
			System.out.println(temporada);
		}
	}
}
