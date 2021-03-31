package br.com.thiago.javacore.Npolimorfismo.test;

import br.com.thiago.javacore.Npolimorfismo.classes.Funcionario;
import br.com.thiago.javacore.Npolimorfismo.classes.Gerente;
import br.com.thiago.javacore.Npolimorfismo.classes.RelatorioPagamento;
import br.com.thiago.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Osvaldo", 5000, 2000);
        Vendedor vendedor = new Vendedor("Yuri", 2000, 20000);
        RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
//        relatorioPagamento.relatorioPagamentoGerente(gerente);
//        System.out.println("-----------------------------------------------");
//        relatorioPagamento.relatorioPagamentoVendedor(vendedor);

        relatorioPagamento.relatorioPagamentoGenerico(gerente);
        System.out.println("-----------------------------------------------");
        relatorioPagamento.relatorioPagamentoGenerico(vendedor);


    }
}
