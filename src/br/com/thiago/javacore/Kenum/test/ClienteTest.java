package br.com.thiago.javacore.Kenum.test;

import br.com.thiago.javacore.Kenum.classes.Cliente;
import br.com.thiago.javacore.Kenum.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(cliente);

    }
}
