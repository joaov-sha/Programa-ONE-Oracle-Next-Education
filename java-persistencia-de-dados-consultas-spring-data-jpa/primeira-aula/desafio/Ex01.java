import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex01{
    public static void main(String[] args){
        exercicio01();
    }

    public static void exercicio01(){
        List<String> input = Arrays.asList("10", "abc", "20", "30x");
        List<Integer> output = input.stream().filter(n -> n.matches("\\d{2}")).map(n -> Integer.parseInt(n)).collect(Collectors.toList());
        System.out.println(output);
    }
}