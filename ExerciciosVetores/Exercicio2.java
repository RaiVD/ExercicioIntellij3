import java.util.Scanner;
//2. Faça um programa de lista de chamada que armazene o nome de 10 alunos e apresente a lista completa para o usuário
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner valorDigitado = new Scanner(System.in);
        int qtdAlunos;

        System.out.println("Digite a quantidade de alunos");
        qtdAlunos = valorDigitado.nextInt();
        String alunos [] = new String[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++){

            System.out.println("Digite o nome do aluno");
            alunos[i] = valorDigitado.next();

        }
        System.out.println("--------Lista de Chamada---------");

        for (int i = 0; i < alunos.length; i ++){
            System.out.println(alunos[i]);
        }

    }
}
