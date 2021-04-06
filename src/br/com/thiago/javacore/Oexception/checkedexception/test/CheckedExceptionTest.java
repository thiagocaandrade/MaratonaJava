package br.com.thiago.javacore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
    public static void main(String[] args) {
            abrirArquivo();
    }

    public static void criarArquivo() throws IOException {
        File file = new File("Teste.txt");
        try {
            System.out.println("Arquivo criado? : " + file.createNewFile());
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static String abrirArquivo(){
        try{
            System.out.println("ABRINDO UM ARQUIVO");
            System.out.println("EXECUTANDO A LEITURA DO ARQUIVO");
//            throw  new Exception();
            System.out.println("ESCREVENDO UM ARQUIVO");
            return "valor";
        } catch (Exception e){
            System.out.println("DENTRO DO CATCH");
            e.printStackTrace();
        } finally {
            System.out.println("FECHAR O  ARQUIVO");
        }
        return null;
    }
}
