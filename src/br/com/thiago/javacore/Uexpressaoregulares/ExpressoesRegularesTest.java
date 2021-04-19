package br.com.thiago.javacore.Uexpressaoregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {
    public static void main(String[] args) {
        // \\d todos os digitos
        // \\D tudo o que não for digitos
        // \s espações em branco \t \n \f \r
        // \S espações que não é branco
        // \w caracteres de palavras a-z A-Z, digitos e underline(_)
        // \W tudo o que não for de palavra
//        String regex = "[abcABC]";
        String regex = "0[xX][0-9a-fA-F]";
//        String texto = "cafeBABE";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: "+ texto);
        System.out.println("indice: 0123456789");
        System.out.println("expressao: "+matcher.pattern());
        System.out.println("posicoes encontradas: ");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
