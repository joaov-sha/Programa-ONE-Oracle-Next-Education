package desafio.errors;

public class InvalidOperationException extends IllegalArgumentException{
    
    public InvalidOperationException(String message){
        super(message);
    }
}
