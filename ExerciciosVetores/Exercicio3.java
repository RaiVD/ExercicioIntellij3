//Faça um programa que receba 10 números inteiros, armazene-os e verifique quais numeros são pares, e exiba para o usuário apenas os números pares da lista

public class Exercicio3 {
    public static void main(String[] args) {
        int valores[] = new int[10];

        valores[0]=5;
        valores[1]=7;
        valores[2]=4;
        valores[3]=9;
        valores[4]=9;
        valores[5]=3;
        valores[6]=5;
        valores[7]=1;
        valores[8]=6;
        valores[9]=8;

        if(valores[0] % 2 == 0){
            System.out.println(valores[0]);
        } else if (valores[1] % 2 == 0){
            System.out.println(valores[1]);
        } else if (valores[2] % 2 == 0) {
            System.out.println(valores[2]);
        }else if (valores[3] % 2 == 0) {
            System.out.println(valores[3]);
        }else if (valores[4] % 2 == 0) {
            System.out.println(valores[4]);
        }else if (valores[5] % 2 == 0) {
            System.out.println(valores[5]);
        }else if (valores[6] % 2 == 0) {
            System.out.println(valores[6]);
        }else if (valores[7] % 2 == 0) {
            System.out.println(valores[7]);
        }else if (valores[8] % 2 == 0) {
            System.out.println(valores[8]);
        }else if (valores[9] % 2 == 0) {
            System.out.println(valores[9]);
        }else{
            System.out.println("ímpar");
        }

    }
}
