package br.com.thiago.introducao.javacore.Gassociacao.test;

import br.com.thiago.introducao.javacore.Gassociacao.classes.Aluno;
import br.com.thiago.introducao.javacore.Gassociacao.classes.Local;
import br.com.thiago.introducao.javacore.Gassociacao.classes.Professor;
import br.com.thiago.introducao.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Thiago Andrade", 20);
        Aluno aluno2 = new Aluno("Carlos Andrade", 24);

        Seminario seminario = new Seminario("Como ser um baita programador");
        Professor professor = new Professor("Yoda", "Backend");
        Local local = new Local("Vale Silicio", "Califa");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setProfessor(professor);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[] {aluno, aluno2});

        Seminario[] semArray = new Seminario[1];
        semArray[0] = seminario;
        professor.setSeminarios(semArray);

        seminario.print();
        aluno.print();
        aluno2.print();
        professor.print();
    }
}
