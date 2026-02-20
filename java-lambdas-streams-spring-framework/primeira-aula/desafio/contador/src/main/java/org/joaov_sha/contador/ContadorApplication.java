package org.joaov_sha.contador;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

		s.close();
		System.exit(0);
	}
}
