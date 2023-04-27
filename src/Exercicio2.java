public class Exercicio2 {
    public static void main(String[] args) {

        int i = 9;

        if (i != 0) {
            int mult = 0;
            while (mult < 10) {
                mult++;
                System.out.println(i + " * " + mult + "  = " + (i * mult));
            }
        }
    }
}
