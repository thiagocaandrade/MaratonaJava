package br.com.thiago.javacore.Csobrecargametodos.test;

import br.com.thiago.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Thiago", "098.345.123-44",4500, "333345");
        Funcionario funcionario2 = new Funcionario();


        funcionario.imprime();
        funcionario2.imprime();

    }
}
