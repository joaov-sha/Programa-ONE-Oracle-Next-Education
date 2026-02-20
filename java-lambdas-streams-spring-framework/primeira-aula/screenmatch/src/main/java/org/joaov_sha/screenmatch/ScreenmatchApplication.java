package org.joaov_sha.screenmatch;

import org.joaov_sha.screenmatch.model.DadosSerieRecord;
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
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://api.themoviedb.org/3/search/tv?query=suits&include_adult=false&language=en-US&page=1");
		ConverteDados conversor = new ConverteDados();
		DadosSerieRecord record = conversor.obterDados(json, DadosSerieRecord.class);
		System.out.println(record);
	}
}
