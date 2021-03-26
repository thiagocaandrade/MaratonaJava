package br.com.thiago.javacore.Bintroducaometodos.test;

import br.com.thiago.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(2,2);
        System.out.println(calculadora.divideDoisNumeros(20,2));
        calculadora.imprimeDoisNumerosDividos(20, 5);

        int[] numeros = new int[]{1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5);

    }
}
