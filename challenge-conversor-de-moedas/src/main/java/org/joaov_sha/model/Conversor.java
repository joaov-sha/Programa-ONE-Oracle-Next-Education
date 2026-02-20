package org.joaov_sha.model;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Conversor {
    
    public Conversor(){}

    public static Double getFatorDeConversao(String baseTicker, String targetTicker) throws IOException, InterruptedException{
        String encodedBaseTicker = URLEncoder.encode(baseTicker, StandardCharsets.UTF_8);
        String encodedTargetTicker = URLEncoder.encode(targetTicker, StandardCharsets.UTF_8);
        String queryString = "https://v6.exchangerate-api.com/v6/\'BearerToken\'/pair/" + encodedBaseTicker + "/" + encodedTargetTicker;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                                        .GET()
                                        .header("Authorization", "\'Bearer Token\'")
                                        .header("accept", "application/json")
                                        .uri(URI.create(queryString))
                                        .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        Gson gson = new GsonBuilder()
                        .setPrettyPrinting().create();
        ConversaoRecord conversaoRecord = gson.fromJson(json, ConversaoRecord.class);
        return conversaoRecord.conversion_rate();
    }
}
