import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Filme;

public class Main{
    public static void main(String[] args){
        Filme t2 = new Filme("As crônicas de nárnia", 2005, 135);
        Filme t3 = new Filme("Zumbilândia", 2010, 120);
        Filme t1 = new Filme("O auto da compadecida", 2000, 140);

        List<Filme> catalogo = new ArrayList<Filme>();
        catalogo.add(t1);
        catalogo.add(t2);
        catalogo.add(t3);

        Collections.sort(catalogo, (arg0, arg1) -> arg0.getAnoDeLancamento());
        System.out.println(catalogo);
    }
}