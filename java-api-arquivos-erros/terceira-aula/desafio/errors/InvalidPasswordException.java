package desafio.errors;

import java.security.InvalidKeyException;

public class InvalidPasswordException extends InvalidKeyException{
    
    public InvalidPasswordException(String message){
        super(message);
    }
}
