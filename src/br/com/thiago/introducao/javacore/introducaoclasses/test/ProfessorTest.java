package br.com.thiago.introducao.javacore.introducaoclasses.test;

import br.com.thiago.introducao.javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Thiago";
        professor.cpf = "111";
        professor.rg = "222";
        professor.matricula = "333";

        System.out.println(professor.nome);
        System.out.println(professor.cpf);
        System.out.println(professor.rg);
        System.out.println(professor.matricula);

    }


}
