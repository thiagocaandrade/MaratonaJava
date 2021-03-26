package br.com.thiago.javacore.Hheranca.classes;

public class Funcionario  extends Pessoa{

    private double salario;

    {
        System.out.println("Bloco de inicialização de funcionario 1");
    }
    {
        System.out.println("Bloco de inicialização de funcionario 2");
    }
    static {
        System.out.println("Bloco de inicialização estatico de funcionario 1");
    }

    public Funcionario(String nome){
        super(nome);
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu " + super.nome + " recebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
