package br.com.thiago.javacore.Rwrappers.test;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class WrappersTest {
    public static void main(String[] args) {

        byte bytePrimitivo = 1;
        short shortPrimitivo = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10;
        float floatPrimiivo = 10;
        double doublePrimitivo = 10;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        Byte byteWrapper = 1;
        Short shortWrapper = 1;
        Integer integerWrapper = 1;
        Long longWrapper = 10L;
        Float floatWrapper = new Float("10");
        Double doubleWrapper = 10D;
        Character characterWrapper = 'A';
        Boolean booleanWrapper = true;

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isLetterOrDigit('#'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));


    }
}
