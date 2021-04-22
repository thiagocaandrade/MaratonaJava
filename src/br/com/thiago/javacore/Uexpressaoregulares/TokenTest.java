package br.com.thiago.javacore.Uexpressaoregulares;

public class TokenTest {
    public static void main(String[] args) {
        String str = "Thiago, Paulo, Eduardo, Matheus, Vitor, Never";
        String[] tokens = str.split(",");
        for (String arr: tokens){
            System.out.println(arr.trim());
        }
    }
}
