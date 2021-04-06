package br.com.thiago.javacore.Oexception.checkedexception.classes;

public class Leitor1 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("FECHANDO LEITO 1");
    }
}
