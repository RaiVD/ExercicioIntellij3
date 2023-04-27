//

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner valorDigitado = new Scanner(System.in);
        int qtdItens;

        System.out.println("Digite a quantidade de Itens da lista");
        qtdItens = valorDigitado.nextInt();
        String Item[] = new String[qtdItens];

        for (int i = 0; i < qtdItens; i++) {

            System.out.println("Digite o nome do Item");
            Item[i] = valorDigitado.next();

        }
        System.out.println("--------Lista do super mercado---------");

        for (int i = 0; i < Item.length; i++) {
            System.out.println(Item[i]);
        }

    }

}