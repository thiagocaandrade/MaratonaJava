package br.com.thiago.introducao.javacore.sobrecargametodos.test;

import br.com.thiago.introducao.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.init("Teresinha da Silva", "098.345.123-44",4500, "333345");



        funcionario.imprime();

    }
}
