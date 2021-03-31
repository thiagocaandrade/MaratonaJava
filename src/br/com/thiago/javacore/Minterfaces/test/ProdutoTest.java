package br.com.thiago.javacore.Minterfaces.test;

import br.com.thiago.javacore.Minterfaces.classes.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 4, 3000);
        produto.calcularImposto();
        produto.calculaFrete();
        System.out.println(produto);
    }
}
