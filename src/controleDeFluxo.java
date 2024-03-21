import java.util.Scanner;
public class controleDeFluxo {


    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Coloque suas notas nas matérias, respectivamente: Matemática, Português, Geografia e História: ");
        System.out.println("Nota de Matemática: ");
        int matematica = s.nextInt();
        System.out.println("Nota de Português: ");
        int portugues = s.nextInt();
        System.out.println("Nota de Geografia: ");
        int geografia = s.nextInt();
        System.out.println("Nota de História: ");
        int historia = s.nextInt();

        int resultado= matematica+portugues+geografia+historia;
        int media = resultado/4;

        System.out.println("A sua média é: " + media);

        if (media>= 7) {
            System.out.println("Portanto, você está APROVADO.");

        } else if (media>= 5) {
            System.out.println("Portanto, você está de RECUPERAÇÃO.");
        } else {System.out.println("Portanto, você está REPROVADO.");}


    }


}
