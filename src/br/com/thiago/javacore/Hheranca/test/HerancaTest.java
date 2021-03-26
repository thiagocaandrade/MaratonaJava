package br.com.thiago.javacore.Hheranca.test;

import br.com.thiago.javacore.Hheranca.classes.Endereco;
import br.com.thiago.javacore.Hheranca.classes.Funcionario;
import br.com.thiago.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {

//        Pessoa pessoa = new Pessoa("Gina");
//        pessoa.setCpf("12345");

        Endereco endereco = new Endereco();
//        endereco.setBairro("Bairro 1");
        endereco.setRua("Rua 34");

//        pessoa.setEndereco(endereco);

//        pessoa.imprime();

        System.out.println("-------------------------------------------------------------");

        Funcionario funcionario = new Funcionario("Andrade");
        funcionario.setCpf("899877");
        funcionario.setSalario(7000);
        funcionario.setEndereco(endereco);

//        funcionario.imprime();
    }
}
