package br.com.thiago.javacore.Gassociacao.classes;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;


    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public void print (){
        System.out.println("--------------Relatório Professor--------------------");
        System.out.println("Nome Professor :" + this.nome);
        System.out.println("Especialidade Professor :" + this.especialidade);
        System.out.print("Seminário participantes ");
        if (seminarios != null && seminarios.length != 0){
            for (Seminario seminario : seminarios){
                System.out.println(seminario.getTitulo() + " ");
            }
            return;
        }
        System.out.println("Professor não vinculado a nenhum seminário");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
