import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws IOException{
        Scanner s = new Scanner(System.in);

        FileWriter fw = new FileWriter("out/arquivo.txt",StandardCharsets.UTF_8,true);
        fw.write("Conteúdo a ser gravado no arquivo.");

        fw.close();
        s.close();
        System.exit(0);
    }
}