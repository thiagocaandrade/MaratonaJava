package br.com.thiago.javacore.Lclassesabstratas.classes;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, String clt, double salario, double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    public Vendedor() {
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    private double totalVendas;

    @Override
    public void calculaSalario() {
        this.salario = salario + (totalVendas *0.05);
    }

    @Override
    public void imprime() {

    }
}
