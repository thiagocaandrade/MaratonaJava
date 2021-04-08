package br.com.thiago.javacore.Sstrings.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Thiago";
        nome = nome.concat(" Andrade");

        String teste = "Goku";
        String teste2 = "goku";

        System.out.println(teste.charAt(3));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste.replace('o', 'a'));
        System.out.println(teste.toLowerCase());
        System.out.println(teste.toUpperCase());
        System.out.println(teste.substring(0,2));
        System.out.println(teste2.trim());



    }
}
