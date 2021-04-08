package br.com.thiago.javacore.Sstrings.test;

public class StringBuilderTest {
    public static void main(String[] args) {
        String s = " Uma frase comum";
        StringBuilder sb = new StringBuilder(16);
        sb.append("Uma frase comum");
        sb.append(" test");
        System.out.println(sb.reverse());
        System.out.println(sb.delete(0,2));
        System.out.println(sb.insert(2, "###"));

    }
}
