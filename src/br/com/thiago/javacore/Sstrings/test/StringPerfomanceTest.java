package br.com.thiago.javacore.Sstrings.test;

public class StringPerfomanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto :" + (fim-inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(500000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuilder :" + (fim-inicio) + " ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(500000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto StringBuffer :" + (fim-inicio) + " ms");
    }

    private static void concatString(int tam){
        String string = "";

        for (int i=0; i<tam; i++){
            string+=i;
        }
    }

    private static void concatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);

        for (int i=0; i<tam; i++){
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tam){
        StringBuffer sb = new StringBuffer(tam);

        for (int i=0; i<tam; i++){
            sb.append(i);
        }
    }
}
