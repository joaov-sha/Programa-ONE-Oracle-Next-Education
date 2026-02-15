package desafio.errors;

import javax.naming.InvalidNameException;

public class InvalidUserDataException extends InvalidNameException{
    
    public InvalidUserDataException(String message){
        super(message);
    }
}
