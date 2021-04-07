package br.com.thiago.javacore.Oexception.checkedexception.test;

import br.com.thiago.javacore.Oexception.checkedexception.classes.Funcionario;
import br.com.thiago.javacore.Oexception.checkedexception.classes.Pessoa;

public class SobrescritaComExceptionTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Pessoa pessoa = new Pessoa();

        funcionario.salvar();
    }
}
