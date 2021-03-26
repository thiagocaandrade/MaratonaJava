package br.com.thiago.javacore.Kenum.classes;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),PESSOA_JURIDICA(2, "Pessoa Jurídica");
    private int tipo;
    private String nome;

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
