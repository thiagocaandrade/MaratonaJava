package br.com.thiago.javacore.Lclassesabstratas.classes;

public class Gerente extends Funcionario {

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    public Gerente() {
    }

    @Override
    public void calculaSalario(){
        this.salario = salario + (salario *0.2);
    }

    @Override
    public void imprime() {

    }
}
