package br.com.thiago.introducao.javacore.introducaometodos.test;

import br.com.thiago.introducao.javacore.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Professor professor2 = new Professor();

        professor.cpf = "1111";
        professor.matricula = "222";
        professor.nome = "Carlos";
        professor.rg = "333";
        professor2.cpf = "4444";
        professor2.matricula = "555";
        professor2.nome = "Andrade";
        professor2.rg = "666";

        professor.imprime();
        professor2.imprime();




    }
}