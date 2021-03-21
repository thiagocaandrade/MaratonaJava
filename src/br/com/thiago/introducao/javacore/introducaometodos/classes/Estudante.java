package br.com.thiago.introducao.javacore.introducaometodos.classes;

import javax.print.DocFlavor;

public class Estudante {

    private String nome;
    private int idade;
    private double[] notas;

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    private boolean aprovado;


    public void imprimir(){
        System.out.println("O nome do estudante é: " + this.nome);
        System.out.println("A idade é: " + this.idade);
        if (this.notas!=null) {
            for (double nota : this.notas) {
                System.out.print(nota + " ");
            }
        }

    }

    public  void tirarMedia(){
        if (this.notas == null){
            System.out.println("Esse aluno não possui notas!!");
            return;
        }
        double media = 0;
            for (double nota : this.notas) {
                media += nota;
            }

        media = media/this.notas.length;

        if (media > 6){
            System.out.println("\nA média é: " + media + "\nSITUAÇÃO: APROVADO");
            return;
        }

        System.out.println("\nA média é: " + media + "\nSITUAÇÃO: REPROVADO");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            System.out.println("VocÊ não pode fazer isso!!");
            return;
        }
        this.idade = idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
