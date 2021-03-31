package br.com.thiago.javacore.Npolimorfismo.classes;

public class RelatorioPagamento {

//    public void relatorioPagamentoGerente(Gerente gerente){
//        System.out.println("Gerando relatório de pagamento para gerência");
//        gerente.calcularPagamento();
//        System.out.println("Nome: " + gerente.getNome());
//        System.out.println("Salário: " + gerente.getSalario());
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor){
//        System.out.println("Gerando relatório de pagamento para vendedores");
//        vendedor.calcularPagamento();
//        System.out.println("Nome: " + vendedor.getNome());
//        System.out.println("Salário: " + vendedor.getSalario());
//    }

    public void relatorioPagamentoGenerico(Funcionario funcionario){
        System.out.println("Gerando relatório de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
        if (funcionario instanceof Gerente){
            Gerente gerente = (Gerente) funcionario;
            System.out.println("Participação nos lucros :" + gerente.getPnl());
        }
        if (funcionario instanceof Vendedor){
            Vendedor vendedor = (Vendedor) funcionario;
            System.out.println("Total venda: "+ ((Vendedor) funcionario).getTotalVendas());
        }
    }

}

