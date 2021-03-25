package br.com.thiago.introducao.javacore.Aintroducaoclasses.test;

import br.com.thiago.introducao.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante thiago = new Estudante();
        thiago.nome = "Thiago";
        thiago.matricula = "1212";
        thiago.idade = 15;

        System.out.println(thiago.nome);
        System.out.println(thiago.matricula);
        System.out.println(thiago.idade);

    }
}
