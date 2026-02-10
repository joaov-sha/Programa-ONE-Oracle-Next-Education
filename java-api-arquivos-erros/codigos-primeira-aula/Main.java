import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        var titulo = s.nextLine();

        String queryString = "https://api.themoviedb.org/3/search/movie?query=" + titulo + "&language=pt-BR";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(queryString))
                    .GET()
                    .header("accept", "application/json")
                    .header("Authorization", "Bearer \"APIKEY\"")
                    .build();
        client.sendAsync(request, BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenAccept(System.out::println)
                    .join();

        s.close();
    }
}