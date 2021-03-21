package br.com.thiago.introducao.javacore.introducaometodos.test;

import br.com.thiago.introducao.javacore.introducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();

        estudante.setNome("Thiago Andrade");
        estudante.setIdade(-1);
        estudante.setNotas(new double[]{8, 7, 9.5});

        estudante.imprimir();
        estudante.tirarMedia();
        System.out.println(estudante.getNome());

    }



}
