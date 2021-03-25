package br.com.thiago.introducao.javacore.Aintroducaoclasses.test;

import br.com.thiago.introducao.javacore.Aintroducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.placa = "TTT";
        carro.modelo = "Gol";
        carro.velocidadeMaxima = 100f;

        System.out.println(carro.placa);
        System.out.println(carro.modelo);
        System.out.println(carro.velocidadeMaxima);


    }
}
