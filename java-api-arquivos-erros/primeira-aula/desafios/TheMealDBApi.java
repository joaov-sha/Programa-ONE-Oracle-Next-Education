import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class TheMealDBApi {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Informe a receita que deseja verificar: ");
        String receita = s.nextLine();

        String queryString = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + receita.trim();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                    .GET()
                    .uri(URI.create(queryString))
                    .build();

        client.sendAsync(request, BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenAccept(System.out::println)
                    .join();
                    
        s.close();
        System.exit(0);
    }
}
