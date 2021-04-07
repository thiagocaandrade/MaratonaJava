package br.com.thiago.javacore.Oexception.customexceptions;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException (){
        super("Usuario ou senha inválidos");
    }
}
