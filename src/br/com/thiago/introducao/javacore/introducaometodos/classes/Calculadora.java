package br.com.thiago.introducao.javacore.introducaometodos.classes;

public class Calculadora {

    public void somaDoisNumeros(){
        System.out.println(5+5);
    }

    public void subtraiDoisNumeros(){
        System.out.println(5-5);
    }

    public void multiplicaDoisNumeros(int num1, int num2){

        System.out.println(num1*num2);

    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2!=0){
            return num1/num2;

        }
        return 0;
    }

    public void imprimeDoisNumerosDividos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("Não é possivel dividir por 0");
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;

    }

    public void somaArray(int [] numeros){
        int soma = 0;
        for(int num : numeros){
            soma +=num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma +=num;
        }
        System.out.println(soma);
    }
}
