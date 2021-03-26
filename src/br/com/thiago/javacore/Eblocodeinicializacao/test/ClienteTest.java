package br.com.thiago.javacore.Eblocodeinicializacao.test;

import br.com.thiago.javacore.Eblocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        for(int parcela : cliente.getParcelas()){
            System.out.println( parcela + " ");
        }

    }
}
