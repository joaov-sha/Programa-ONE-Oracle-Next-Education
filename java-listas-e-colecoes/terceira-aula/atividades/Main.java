import java.util.ArrayList;

import model.Filme;
import model.Titulo;

public class Main {
    
    public static void main(String[] args){
        
        Filme f1 = new Filme("O agente secreto", 2026, 180);
        Filme f2 = new Filme("Avatar cinza e fogo", 2025, 150);
        Filme f3 = new Filme("Titanic", 1996, 126);

        ArrayList<Filme> catalogo = new ArrayList<Filme>();
        catalogo.add(f1);
        catalogo.add(f2);
        catalogo.add(f3);

        for(Titulo t: catalogo){
            if(t instanceof Filme filme && ((Filme)t).getDuracao() > 150 ){
                System.out.println(filme.toString());
            }
        }
    }
}
