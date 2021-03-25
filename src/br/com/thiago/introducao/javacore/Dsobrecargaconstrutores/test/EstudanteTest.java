package br.com.thiago.introducao.javacore.Dsobrecargaconstrutores.test;

import br.com.thiago.introducao.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante est = new Estudante("122423", "Thiago", new double[] {5, 7, 9}, "22/03/2021");

        est.imprime();
    }
}
