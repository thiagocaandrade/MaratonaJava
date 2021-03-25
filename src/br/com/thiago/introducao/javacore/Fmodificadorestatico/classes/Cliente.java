package br.com.thiago.introducao.javacore.Fmodificadorestatico.classes;

public class Cliente {
    //0 - Bloco de inicialização estático é executado quando a JVM carregar a classe. (é executado apenas uma vez)
    //1 - Alocado espaco na memoria para o objeto que sera criado
    //2 - Cada atributo de classes é criado e inicializado com seus valores default pi valores xplicitos
    //3 - Bloco de inicialização é executado
    //4 - O construtor é executado

    private static int[] parcelas;

   static  {
        System.out.println("Dentro do bloco de inicialização");
        parcelas = new int[100];
        for( int i = 1; i<= 100; i++){
            parcelas[i-1] = i;
        }
    }

    public Cliente(){

    }

    public static int[] getParcelas() {
        return parcelas;
    }

}
