package br.com.thiago.javacore.Bintroducaometodos.test;

import br.com.thiago.javacore.Bintroducaometodos.classes.Calculadora;

public class ParametrosTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        calculadora.alteraDoisNumeros(num1, num2);
    }
}
