package org.joaov_sha;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import org.joaov_sha.model.MovieRecord;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o filme do qual deseja obter informações: ");

        String filme = s.nextLine();

        String[] tituloDoFilme = filme.split(" ");
        StringBuilder sb = new StringBuilder();
        if(tituloDoFilme.length > 1){
            for(int i = 0; i < tituloDoFilme.length-1; i++){
                sb.append(tituloDoFilme[i]);
                sb.append("+");
            }
            sb.append(tituloDoFilme[tituloDoFilme.length-1]);
            filme = sb.toString();
        }

        String queryString = "https://api.themoviedb.org/3/search/movie?query=" + filme + "&language=pt-BR";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(queryString))
                    .GET()
                    .header("accept", "application/json")
                    .header("Authorization", "Bearer \'yourApiKey\'")
                    .build();

        //client.sendAsync(request, BodyHandlers.ofString())
        //            .thenApply(HttpResponse::body)
        //            .thenAccept(System.out::println)
        //            .join();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println("JSON: " + json);

        Gson gson = new Gson();
        MovieRecord movierecord = gson.fromJson(json, MovieRecord.class);
        System.out.println(movierecord);
        
        s.close();
        System.exit(0);
    }
}