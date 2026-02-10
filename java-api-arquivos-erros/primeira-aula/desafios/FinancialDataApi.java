import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class FinancialDataApi {
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Informe o ticker do qual deseja obter informações: ");
        String ticker = s.nextLine();

        String queryString = "https://finnhub.io/api/v1/search?q="+ ticker.trim() +"&exchange=US&token=yourApiKey";
        
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
