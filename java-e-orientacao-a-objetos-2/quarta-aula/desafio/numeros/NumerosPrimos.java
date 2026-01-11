package numeros;

public class NumerosPrimos {
    
    public void verificarPrimalidade(int numero){
        int quantidadeDeDivisores = 0;
        for(int i = numero; i >= 1; i--){
            if(numero / i == 0)
                quantidadeDeDivisores++;
        }
        if(quantidadeDeDivisores > 2){
            System.out.println("O número informado não é primo!");
        }else{
            System.out.println("O número informado: " + numero + " é primo!");
        }
    }
}
