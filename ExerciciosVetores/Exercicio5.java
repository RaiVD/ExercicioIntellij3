import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner nomeBanda = new Scanner(System.in);
        String banda;
        System.out.println("Digite o nome da Banda ");
        banda=nomeBanda.next();

        String musica[] = new String[3];

        for (int i = 0; i < 3; i++) {

            System.out.println("Musicas da Banda ");
            musica[i] = nomeBanda.next();

        }
        System.out.println("--------Lista de musicas---------");

        for (int i = 0; i < musica.length; i++) {
            System.out.println(musica[i]);
        }

    }
}
