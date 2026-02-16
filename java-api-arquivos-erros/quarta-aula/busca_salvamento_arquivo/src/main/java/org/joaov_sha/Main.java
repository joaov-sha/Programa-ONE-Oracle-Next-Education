package org.joaov_sha;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.joaov_sha.model.Titulo;
import org.joaov_sha.model.TituloTmdb;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        Gson gson = new GsonBuilder()
                            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                            .create();
        
        String filme = "";

        List<Titulo> titulos = new ArrayList<Titulo>();

        while (!filme.equals("sair")) {
            String searchTerm = URLEncoder.encode(filme, StandardCharsets.UTF_8);

            String queryString = "https://api.themoviedb.org/3/search/movie?query=" + searchTerm + "&language=en-US";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(queryString))
                    .GET()
                    .header("accept", "application/json")
                    .header("Authorization",
                            "Bearer \'yourApiKey\'")
                    .build();

            HttpResponse<String> response = client.sendAsync(request, BodyHandlers.ofString()).join();

            System.out.println(response);
            
            

            JsonElement jsonElement = JsonParser.parseString(response.body());

            TituloTmdb meuTituloTmdb = gson.fromJson(jsonElement, TituloTmdb.class);

            Titulo meuTitulo = new Titulo(meuTituloTmdb);
            titulos.add(meuTitulo);
            System.out.print("Informe o filme sobre o qual deseja procurar informações: ");
            filme = s.nextLine();
        }

        for(Titulo t : titulos){
            System.out.println(t.toString());
        }

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));

        s.close();
        System.exit(0);
    }
}