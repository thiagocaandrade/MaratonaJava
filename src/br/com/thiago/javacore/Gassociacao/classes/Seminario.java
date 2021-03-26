package br.com.thiago.javacore.Gassociacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;


    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    public  void print(){
        System.out.println("--------------Relatório Seminário--------------------");
        System.out.println("Titulo :" + this.titulo);
        if (this.professor != null){
            System.out.println("Professor Palestrante :" + this.professor.getNome());
        } else {
            System.out.println("Nenhum professor cadastrado para esse seminário");
        }
        if (this.local != null){
            System.out.println("Local, rua  :" + this.local.getRua() + "Bairro " + this.local.getBairro());
        } else {
            System.out.println("Nenhum local cadastrado para esse seminário");
        }
        if (alunos != null && alunos.length != 0) {
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
        return;
        }
        System.out.println("Nenhum aluno cadastrado");

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }


}
