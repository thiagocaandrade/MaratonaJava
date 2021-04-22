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
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n ate m
        // ()
        // |
        // $
        // p(v|c)o = ovo ou oco
        // maca(rr|c)ão = macarrão ou macacão
        // . coringa 1.3 = 123,133,1A3....
        // ^ [^abc]

//        String regex = "0[xX][0-9a-fA-F]+(\\s|$)";
//        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
//        Pattern pattern = Pattern.compile(regex);
//        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
//        String texto = "fulano@gmail.com, fulano@hotmail.com";
//        String regex = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
        String regex = "proj([^,])*";
//        String texto = "05/10/2010 05/03/2015 1/1/01 01/05/95";
        String texto = "proj1.java, proj1.class, proj2.class, proj2.java";
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
