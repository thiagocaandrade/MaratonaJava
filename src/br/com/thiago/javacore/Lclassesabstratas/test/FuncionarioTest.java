package br.com.thiago.javacore.Lclassesabstratas.test;

import br.com.thiago.javacore.Lclassesabstratas.classes.Gerente;
import br.com.thiago.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Andrade", "2012-2", 2000);
        Vendedor vendedor = new Vendedor("Carolina", "12343-2", 1500, 5000);
        gerente.calculaSalario();
        vendedor.calculaSalario();
        System.out.println(vendedor);
        System.out.println(gerente);

    }
}
