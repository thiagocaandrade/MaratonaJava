package br.com.thiago.introducao.javacore.Fmodificadorestatico.test;

import br.com.thiago.introducao.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);
        Carro c = new Carro("BMW", 280);
        Carro c2 = new Carro("AUDI", 275);
        Carro c3 = new Carro("MERCEDES", 290);


        c.imprime();
        c2.imprime();
        c3.imprime();
    }
}
