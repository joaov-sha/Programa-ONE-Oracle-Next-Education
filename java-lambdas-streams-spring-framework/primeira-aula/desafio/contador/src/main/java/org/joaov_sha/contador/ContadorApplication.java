package org.joaov_sha.contador;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.joaov_sha.contador.model.Tarefa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		Scanner s = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = s.nextInt();

		for(int i = 1; i <= numero; i++){
			System.out.println(i);
		}

		// 2 - Para adicionarmos as dependências necessárias para realização da segunda etapa deste desafio, seria necessário acessarmos o mvnrepository, procurar pela dependência requerida, então adicionarmos a dependência ao arquivo pom.xml caso fossemos realizar o procedimento de forma manual, enquanto que para realizarmos a adição da dependência através do gerenciador maven, como utilizo o visual studio code como editor de códigos, basta abrirmos o explorador de arquivos do editor, e procurar na porção inferior da tela a aba do menu, cujo nome é maven, abri-la, procurar por dependências, clicar para adicionar dependências ao projeto, e procurá-las através da barra de texto que se abre ao topo do editor, clicando em adicioná-las para fazer com que a dependência seja adicionada ao projeto de forma automática.

		Tarefa t = new Tarefa("Tirar o lixo", false, "Joao");

		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(t);
		FileWriter fw = new FileWriter("Tarefa.json", StandardCharsets.UTF_8, true);
		fw.append(json);
		fw.close();
		System.out.println("Lendo do arquivo: ");
		FileReader fr = new FileReader("Tarefa.json", StandardCharsets.UTF_8);
		System.out.println(fr.readAllLines());
		fr.close();
		fr = new FileReader("Tarefa.json", StandardCharsets.UTF_8);
		Tarefa tarefa = mapper.readValue(fr, Tarefa.class);
		System.out.println("Lendo do objeto: ");
		System.out.println(tarefa.toString());
		fr.close();

		
		s.close();
		System.exit(0);
	}
}
