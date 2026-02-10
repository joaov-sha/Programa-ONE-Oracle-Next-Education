import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class GoogleBooksApi{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Informe um título para busca: ");
        String titulo = s.nextLine();
        String[] tituloStrings = titulo.split(" ");
        StringBuilder sb = new StringBuilder();
        if(tituloStrings.length > 1){
            for(int i = 0; i < tituloStrings.length-1; i++){
                sb.append(tituloStrings[i]);
                sb.append("+");
            }
            sb.append(tituloStrings[tituloStrings.length-1]);
        }

        String queryString = "https://www.googleapis.com/books/v1/volumes?q="+ sb.toString() +"&download=epub&key=yourApiKey";
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