package br.com.thiago.javacore.Oexception.checkedexception.classes;

public class Leitor2 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("FECHANDO LEITO 2");
    }
}
