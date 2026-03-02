package org.joaov_sha.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestClient {
    
    public String createRequestAndGetResponse(URI requestURL){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                                        .uri(requestURL)
                                        .GET()
                                        .header("accept", "application/json")
                                        .header("content-type", "application/json")
                                        .header("X-Subscription-Token", "https://fipe.online")
                                        .build();
        String response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                                            .thenApply(HttpResponse::body)
                                            .join();

        return response;
    }
}