package org.joaov_sha;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.joaov_sha.model.AddressRecord;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o CEP que deseja consultar: ");
        String cep = s.nextLine();

        String queryString = "https://viacep.com.br/ws/" + cep.trim() + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                                        .GET()
                                        .header("accept","application/json")
                                        .uri(URI.create(queryString))
                                        .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        AddressRecord addressRecord = gson.fromJson(json, AddressRecord.class);

        FileWriter fw = new FileWriter("src/main/java/org/joaov_sha/out/cep.json", StandardCharsets.UTF_8, true);
        fw.write(gson.toJson(addressRecord));

        fw.close();
        s.close();
        System.exit(0);
    }
}