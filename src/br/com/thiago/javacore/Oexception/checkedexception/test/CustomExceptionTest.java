package br.com.thiago.javacore.Oexception.checkedexception.test;

import br.com.thiago.javacore.Oexception.customexceptions.LoginInvalidoException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        String usuarioBacoDeDados = "Goku";
        String senhaBacoDeDados = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "123";
        if (!usuarioBacoDeDados.equals(usuarioDigitado) || !senhaBacoDeDados.equals(senhaDigitada)){
            throw  new LoginInvalidoException();
        } else {
            System.out.println("LOGADO");
        }
    }
}
