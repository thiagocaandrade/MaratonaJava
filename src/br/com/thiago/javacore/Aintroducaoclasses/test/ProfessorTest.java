package br.com.thiago.javacore.Aintroducaoclasses.test;

import br.com.thiago.javacore.Aintroducaoclasses.classes.Professor;

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
