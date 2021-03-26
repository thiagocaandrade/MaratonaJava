package br.com.thiago.javacore.Isobrescrita.test;

import br.com.thiago.javacore.Isobrescrita.classes.Pessoa;

public class PessoTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joaquina na esquina");
        pessoa.setIdade(34);
        System.out.println(pessoa);
    }
}
