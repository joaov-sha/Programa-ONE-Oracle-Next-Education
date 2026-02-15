package desafio.model;

import desafio.errors.InvalidPasswordException;

public class Login {
    
    public Login(){}

    public static String validateLogin(String password) throws InvalidPasswordException{
        if(password.length() < 8){
            throw new InvalidPasswordException("Senha inválida, tente novamente!");
        }
        return "Login realizado com sucesso!";
    }
}
